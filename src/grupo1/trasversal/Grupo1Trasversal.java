/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo1.trasversal;

import grupo1.trasversal.Data.Conexion;
import java.sql.Connection;

/**
 *
 * @author POSITIVO BGH
 */
public class Grupo1Trasversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Conexion conexion = new Conexion();

        Connection con = conexion.getConexion();

    }

}
