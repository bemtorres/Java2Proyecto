/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author benja
 */
public class EstadoFichaDao {    

    public String buscarDatos(int id) { //SELECT name from estado where id = "";
        String nombre = "";
        try {
                      Class.forName("com.mysql.jdbc.Driver").newInstance();
                        Connection connection = DriverManager.getConnection
                                               ("jdbc:mysql://localhost:3306/empresa","root","");

                        Statement statement = connection.createStatement();
                       
                        String query = "Select * FROM estado_ficha WHERE id_est_fich ="+id+";" ;
                                
                        ResultSet results = statement.executeQuery(query);
                        String  campo1;
                           
                            
                            while (results.next())
                            {
                                campo1 = results.getString("nom_est_fich");
                                nombre = campo1;
                                break;                                
                            }
                  connection.close();
         }
         catch(java.lang.Exception ex){
            System.out.println("Error: " + ex);
         }
       return nombre;
    }
}
