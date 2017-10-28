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
import java.util.ArrayList;
import modelo.Empleado;

/**
 *
 * @author benja
 */
public class EmpleadoDAO implements GeneralDAOEmpleado{
    private static ArrayList<Empleado> arrayEmpleados=new ArrayList<Empleado>(); 
    
    @Override
    public ArrayList mostrarDatos() {
        try {
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               Connection connection = DriverManager.getConnection
                                               ("jdbc:mysql://localhost:3306/empresa","root","");   
               Statement statement = connection.createStatement();
               String consultaSQL = "SELECT * from empleado join persona using(rut_persona)";
               ResultSet results = statement.executeQuery(consultaSQL);
               String campo1;
               String campo2;
               arrayEmpleados.removeAll(arrayEmpleados);
               while (results.next())               {
                    campo1 = results.getString("username");
                    campo2 = results.getString("password");
                  //  arrayEmpleados.add(new Empleado(campo1,campo2));
               }                    
               connection.close();                
        } 
        catch(java.lang.Exception ex){
            System.out.println("Error: " + ex);
        }   
        return arrayEmpleados;
    }

    @Override
    public boolean verificarDatos(String usuario, String password) {
        boolean estado=false;
            try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();

                            Connection connection = DriverManager.getConnection
                                                   ("jdbc:mysql://localhost:3306/empresa","root","");
                            Statement statement = connection.createStatement();
                            String consultaSQL = "SELECT * from empleado where usuario='"+usuario+"' and clave='"+password+"';" ;
                            ResultSet results = statement.executeQuery(consultaSQL);


                            String campo1;
                            String campo2;

                            while (results.next())
                           {
                                campo1 = results.getString("usuario");
                               campo2= results.getString("clave");                              
                               if(campo1.equals(usuario)){
                                    estado=true;
                                   }
                           }
             connection.close();

            }
            catch(java.lang.Exception ex){
                System.out.println("Error: " + ex);
        }
        return estado;    
    }

    @Override
    public Empleado buscarDatos(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizarDatos(Empleado obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
