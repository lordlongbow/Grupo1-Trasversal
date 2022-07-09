package grupo1.trasversal.Data;

import grupo1.trasversal.Modelos.Alumno;
import grupo1.trasversal.Modelos.Cursada;
import grupo1.trasversal.Modelos.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 1
 */
public class CursadaData {

    private Connection con = null;
    private AlumnoData alumData;
    private MateriaData materiaData;

    public CursadaData(Conexion conexion) {

        this.con = conexion.getConexion();
        this.alumData = new AlumnoData(conexion);
        this.materiaData = new MateriaData(conexion);

    }

    public boolean guardarInscripcion(Cursada inscripcion) {
        boolean insc = false;
        try {
            String sql = "INSERT INTO cursada (idAlumno, idMateria, nota) VALUES ( ? , ? , ? );";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(2, inscripcion.getMateria().getIdMateria());
            ps.setDouble(3, inscripcion.getNota());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                inscripcion.setId(rs.getInt("id"));
                // JOptionPane.showMessageDialog(null, "Se inscribió al alumno correctamente");
                insc = true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar Inscripción");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El alumno ya está inscripto en esta materia " + ex.getMessage());
        }
        return insc;
    }

    public List<Cursada> obtenerInscripciones() {
        ArrayList<Cursada> inscripciones = new ArrayList();
        try {
            String sql = "SELECT * FROM cursada;";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet resultSet = ps.executeQuery();
            Cursada inscripcion;
            while (resultSet.next()) {
                inscripcion = new Cursada();
                inscripcion.setId(resultSet.getInt("id"));

                Alumno a = alumData.obtenerAlumnoXId(resultSet.getInt("idAlumno"));
                inscripcion.setAlumno(a);

                Materia m = materiaData.obtenerMateriaXId(resultSet.getInt("idMateria"));
                inscripcion.setMateria(m);

                inscripcion.setNota(resultSet.getDouble("nota"));

                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las inscripciones: " + ex.getMessage());
        }

        return inscripciones;
    }

    public boolean actualizarNota(Alumno alu, Materia mat, double nota) {
        boolean cargado = false;
        try {
            String sql = "UPDATE cursada SET nota = ? WHERE idAlumno=? and idMateria=?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, alu.getIdAlumno());
            ps.setInt(3, mat.getIdMateria());

            if (ps.executeUpdate() != 0) {
                cargado = true;
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las inscripciones: " + ex.getMessage());
        }

        return cargado;

    }

//    public boolean borrarCursada(int id){
//         boolean borrado=false;
//         String sql= "DELETE FROM cursada WHERE id='?';";
//         try {
//             
//             PreparedStatement ps= con.prepareStatement(sql);
//             ps.setInt(1, id);
//             ps.executeQuery();
//             borrado=true;
//             ps.close();
//         } catch (SQLException ex) {
//             JOptionPane.showMessageDialog(null, "Error de sintaxis ");
//         }
//
//         return borrado;
//    }
//    
    public boolean borrarCursada(int idAlumno, int idMateria) {
        boolean result = true;
        String sql = "DELETE FROM `cursada` WHERE cursada.idAlumno =" + idAlumno + " and idMateria= " + idMateria;
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            int rs = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
            if (rs == 0) {
                result = false;
            }

            ps.close();
        } catch (SQLException ex) {
            result = false;
            JOptionPane.showMessageDialog(null, "Error de sintaxis\n" + ex);
        }

        return result;
    }

//    public List<Materia> alumnoCursa(int idAlumno){
//     
//        ArrayList<Materia> materias = new ArrayList<Materia>();
//
//        try {
//            String sql = "SELECT materia.idMateria,materia.nombre FROM cursada, materia WHERE idAlumno = ? AND cursada.idMateria = materia.idMateria;";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, idAlumno);
//            ResultSet resultSet = ps.executeQuery();
//            Materia materia;
//            while (resultSet.next()) {
//                materia = new Materia();
//                materia.setIdMateria(resultSet.getInt("idMateria"));
//                materia.setNombre(resultSet.getString("nombre"));
//                materia.setAnio(resultSet.getInt("anio"));
//                materia.setActivo(resultSet.getBoolean("activo"));
//                materias.add(materia);
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Error al obtener la materia");
//        }
//
//        return materias;
//     }
    public ArrayList<Materia> materiasInscriptoAlumno(Alumno alumno) {
        ArrayList<Materia> materias = new ArrayList();
        try {
            String sql = "SELECT * FROM cursada WHERE idAlumno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getIdAlumno());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                materias.add(materiaData.obtenerMateriaXId(rs.getInt("idMateria")));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones\n" + ex, "Error Obtener inscripciones", JOptionPane.ERROR_MESSAGE);
        }
        return materias;
    }

    public double obtenerNota(Alumno alu, Materia mat) {
        double nota = 0;
        try {
            String sql = "SELECT nota FROM cursada WHERE idAlumno=? and idMateria=?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alu.getIdAlumno());
            ps.setInt(2, mat.getIdMateria());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nota = rs.getDouble("nota");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener notas: " + ex.getMessage());
        }

        return nota;

    }

    public List<Materia> alumnoNoCursa(int idAlumno) {

        ArrayList<Materia> materias = new ArrayList<Materia>();
// SELECT idMateria,nombre FROM cursada, materia WHERE idAlumno = ? AND cursada.idMateria = materia.idMateria;
        try {
            String sql = "Select * from materia where idMateria not in (select idMateria from cursada where idAlumno =?) AND activo = 1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet resultSet = ps.executeQuery();
            Materia materia;
            while (resultSet.next()) {
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnio(resultSet.getInt("anio"));
                materia.setActivo(resultSet.getBoolean("activo"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la materia");
        }

        return materias;
    }

    public List<Alumno> quienesCursan(int idMateria) {

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        try {
            String sql = "SELECT alumno.idAlumno, alumno.nombre, alumno.apellido, alumno.fechNac, alumno.dni, alumno.activo FROM cursada,alumno WHERE idMateria = ? AND cursada.idAlumno = alumno.idAlumno AND alumno.activo=1; ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet resultSet = ps.executeQuery();
            Alumno alumno;
            while (resultSet.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(resultSet.getInt("idAlumno"));
                alumno.setApellido(resultSet.getString("apellido"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFechNac(resultSet.getDate("fechNac").toLocalDate());
                alumno.setDni(resultSet.getLong("dni"));
                alumno.setActivo(resultSet.getBoolean("activo"));

                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la materia");
        }

        return alumnos;
    }
    /*
    Funcionalidades que faltarían:
Borrar una cursada (delete) _/
Dado un alumno nos devuelva las materias en las que está inscripto _/
Dado un alumno nos devuelva las materias en las que NO está inscripto _/
Dada una materia nos devuelva los alumnos inscriptos en ella. _/
     */

}
