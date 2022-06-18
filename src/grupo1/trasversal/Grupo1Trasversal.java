/*
Sistema de gestión para la Universidad de La Punta:
La Universidad de La Punta cree necesario utilizar un systema para poder llevar el registro de 
los alumnos de la institución y las materías que se dictan en la misma. Adicionalmente se 
necesita poder registrar las materias que cursa cada alumno. El sistema debe permitir cargar la 
calificación obtenida (nota) cuando un alumno rinde un examen final. Para cada materia que 
cursa un alumno solo se registrará la última calificación obtenida, osea no se mantiene registro 
de las notas obtenidas anteriormente, por lo que, si un alumno reinde el examen final de una 
materia y obtiene una calificación de “4”, y luego rinde nuevamente el examen para la materia 
y obtiene una calificación de “9” solo quedará registro de esta última.
 */
package grupo1.trasversal;

import grupo1.trasversal.Data.Conexion;
import java.sql.Connection;

/**
 *
 * @author Grupo 1
 */
public class Grupo1Trasversal {

    
    public static void main(String[] args) {

        Conexion conexion = new Conexion();

        Connection con = conexion.getConexion();

    }

}
