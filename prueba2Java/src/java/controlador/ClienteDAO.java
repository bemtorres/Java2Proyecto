/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author benja
 */
public class ClienteDAO implements GeneralDaoCliente{
    private ArrayList<Cliente> arrayClientes = new ArrayList<>();
    @Override
    public ArrayList mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente buscarDatos(int rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int agregarDatosPersona(Cliente cliente) {
      try {
            //Constructor
           
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","");
        
            Statement statement = connection.createStatement();
            String dv = cliente.getDv()+"";
            String agregarSQL = " INSERT INTO persona (rut_persona,dv_per,p_nombre,s_nombre,ap_pater,ap_mater,direccion,comuna,telefono,email) "
                    + "VALUES ("+cliente.getRut()+",'"+dv+"','"+cliente.getPrimerNombre()
                    +"','"+cliente.getSegundoNombre()+"','"+cliente.getApellidoPaterno()
                    +"','"+cliente.getApellidoMaterno()+"','"+cliente.getDireccion()
                    +"','"+cliente.getComuna()+"',"+cliente.getTelefono()
                    +",'"+cliente.getEmail()+"')";   
            int results = statement.executeUpdate(agregarSQL);
            System.out.println(results);
            //Mostrar datos
             //String campo1;
             //String campo2;
           /* while (results.next())
                {
                    campo1 = results.getString("username");
                    campo2 = results.getString("password");
                    System.out.println(campo1 +"   "+campo2 +"\n");
                }
             */
             connection.close();
             return results;   
        } //catching excepcion
     catch(java.lang.Exception ex){
            System.out.println("Error: " + ex);
            return 0;
        }   
    }

    @Override
    public int eliminarDatos(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizarDatos(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int agregarDatosCliente(Cliente cliente) {        
        try {
            //Constructor            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","");
        
            Statement statement = connection.createStatement();
            
            String  agregarSQL = "INSERT INTO cliente (rut_persona,fech_asociacion)"+
                                 " VALUES("+cliente.getRut()+",'"+cliente.getFechaAsociacion()+"')";            
            int results = statement.executeUpdate(agregarSQL);
            System.out.println(results);
            //Mostrar datos
             //String campo1;
             //String campo2;
           /* while (results.next())
                {
                    
                }
             */
             connection.close();
             return results;   
        } //catching excepcion
        catch(java.lang.Exception ex){
            System.out.println("Error: " + ex);
            return 0;
        }     
    }
    
}
