
package grupo1.trasversal;

/**
 *
 * @author Grupo 1
 */

import grupo1.trasversal.Data.AlumnoData;
import grupo1.trasversal.Data.Conexion;
import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import grupo1.trasversal.Modelos.Alumno;



public class Colegio {

    public static void main(String[] args) {
        
        Conexion conexion=new Conexion();
        AlumnoData ad=new AlumnoData(conexion);
        /*Alumno pepe=new Alumno("Leticia","Moreira",LocalDate.of(1973, Month.MARCH, 12),2344553,true);
        
        if(ad.agregarAlumno(pepe)){
        
            JOptionPane.showMessageDialog(null, "Alumno Agregado Exitosamente");
        }
*/
        
        List<Alumno> lista=ad.obtenerAlumnos();
        
        for(Alumno alu:lista){
        
            System.out.println("dni "+alu.getDni());
            System.out.println("apellido "+alu.getApellido());
            System.out.println("nombre "+alu.getNombre());
        }
        System.out.println("-------------Buscamos por id----------------");
        Alumno aEncontrado=ad.obtenerAlumnoXId(3);
        if(aEncontrado!=null){
        System.out.println("Apellido "+aEncontrado.getApellido());
        }else {
        
            System.out.println("Alumno no existe");
        }
        
        System.out.println("-------------Modificamos apellido--------------");
        //aEncontrado.setApellido("Zarate");
        
        //ad.modificarAlumno(aEncontrado);
        System.out.println("-------------Borrar alumno--------------");
        //ad.borrarAlumno(3);
        
    }
}
