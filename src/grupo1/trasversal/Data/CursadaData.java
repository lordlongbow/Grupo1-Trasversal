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
            String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES ( ? , ? , ? );";

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
            String sql = "SELECT * FROM inscripcion;";

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

}
