
package grupo1.trasversal;
/**
 *
 * @author Grupo 1
 */
import grupo1.trasversal.Data.AlumnoData;
import grupo1.trasversal.Modelos.Materia;
import grupo1.trasversal.Data.Conexion;
import grupo1.trasversal.Data.MateriaData;
import grupo1.trasversal.Modelos.Alumno;
import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;


public class DiegoDiaz {

    public static void main(String[] args) {
        
        Conexion conexion=new Conexion();
        MateriaData md=new MateriaData(conexion);
        Materia l=new Materia("Matemticassss",2,true);
        
        if(md.agregarMateria(l)){
        
            JOptionPane.showMessageDialog(null, "Materia Agregada Exitosamente");
        }

        
        List<Materia> lista=md.obtenerMaterias();
        
        for(Materia alu:lista){
        
            System.out.println("año "+alu.getAnio());
            System.out.println("activo "+alu.isActivo());
            System.out.println("nombre "+alu.getNombre());
        }
        System.out.println("-------------Buscamos por id----------------");
        Materia mEncontrado=md.obtenerMateriaXId(1);
        if(mEncontrado!=null){
        System.out.println("Nombre "+mEncontrado.getNombre());
        }else {
        
            System.out.println("Materia no existe");
        }
        
        System.out.println("-------------Modificamos apellido--------------");
        //aEncontrado.setApellido("Zarate");
        
        //ad.modificarAlumno(aEncontrado);
        System.out.println("-------------Borrar alumno--------------");
        //ad.borrarAlumno(3);
        
    }
}
