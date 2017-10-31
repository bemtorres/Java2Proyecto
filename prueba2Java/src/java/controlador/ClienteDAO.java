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
import modelo.Cliente;

/**
 *
 * @author benja
 */
public class ClienteDAO implements GeneralDAOCliente {

    private ArrayList<Cliente> arrayClientes = new ArrayList<>();

    @Override
    public ArrayList mostrarDatos() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String consultaSQL = "Select * from persona join cliente using(rut_persona);";

            ResultSet results = statement.executeQuery(consultaSQL);

            int campo1, campo9;
            String campo2, campo3, campo4, campo5, campo6, campo7, campo8, campo10, campo11, campo12;

            arrayClientes.removeAll(arrayClientes);
            while (results.next()) {
                campo1 = results.getInt("rut_persona");
                campo2 = results.getString("dv_per");
                campo3 = results.getString("p_nombre");
                campo4 = results.getString("s_nombre");
                campo5 = results.getString("ap_pater");
                campo6 = results.getString("ap_mater");
                campo7 = results.getString("direccion");
                campo8 = results.getString("comuna");
                campo9 = results.getInt("telefono");
                campo10 = results.getString("email");
                campo11 = results.getString("fech_asociacion");
                char dvNuevo = campo2.charAt(0);
                //System.out.println(campo1 +"   "+campo2 +"\n");
                arrayClientes.add(new Cliente(campo11, campo1, dvNuevo, campo3, campo4, campo5, campo6, campo7, campo8, campo9, campo10));
            }

            // Fin de conexi�n
            connection.close();

        } //catching excepcion
        catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return arrayClientes;

    }

    @Override
    public Cliente buscarDatos(int rut, char dv) {
        Cliente obj = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();
            String dv1 = dv + "";
            String query = "Select * from persona join cliente using(rut_persona) where rut_persona=" + rut + " and dv_per='" + dv1 + "';";

            ResultSet results = statement.executeQuery(query);

            int campo1, campo9;
            String campo2, campo3, campo4, campo5, campo6, campo7, campo8, campo10, campo11, campo12;

            while (results.next()) {
                campo1 = results.getInt("rut_persona");
                campo2 = results.getString("dv_per");
                campo3 = results.getString("p_nombre");
                campo4 = results.getString("s_nombre");
                campo5 = results.getString("ap_pater");
                campo6 = results.getString("ap_mater");
                campo7 = results.getString("direccion");
                campo8 = results.getString("comuna");
                campo9 = results.getInt("telefono");
                campo10 = results.getString("email");
                campo11 = results.getString("fech_asociacion");
                char dvNuevo = campo2.charAt(0);
                if (campo1 == rut) {
                    obj = new Cliente(campo11, campo1, dvNuevo, campo3, campo4, campo5, campo6, campo7, campo8, campo9, campo10);
                    break;
                }
            }
            connection.close();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return obj;
    }

    @Override
    public int agregarDatosPersona(Cliente cliente) {
        try {
            //Constructor               
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();
            String dv = cliente.getDv() + "";

            String agregarSQL = " INSERT INTO persona (rut_persona,dv_per,p_nombre,s_nombre,ap_pater,ap_mater,direccion,comuna,telefono,email) "
                    + "VALUES (" + cliente.getRut() + ",'" + dv + "','" + cliente.getPrimerNombre()
                    + "','" + cliente.getSegundoNombre() + "','" + cliente.getApellidoPaterno()
                    + "','" + cliente.getApellidoMaterno() + "','" + cliente.getDireccion()
                    + "','" + cliente.getComuna() + "'," + cliente.getTelefono()
                    + ",'" + cliente.getEmail() + "')";
            int results = statement.executeUpdate(agregarSQL);
            //System.out.println(results);           
            connection.close();
            return results;
        } //catching excepcion
        catch (java.lang.Exception ex) {
            // System.out.println("Error: " + ex);
            return 0;
        }
    }

   

    @Override
    public int actualizarDatosPersonaCliente(Cliente obj) {
        int results = 0;

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");
            String dv1 = obj.getDv() + "";
            Statement statement = connection.createStatement();
            String actualizarSQL = "UPDATE persona SET p_nombre='" + obj.getPrimerNombre() + "',s_nombre='" + obj.getSegundoNombre() + "',ap_pater='" + obj.getApellidoPaterno() + "',ap_mater='" + obj.getApellidoMaterno() + "',direccion='" + obj.getDireccion() + "',comuna='" + obj.getComuna() + "',telefono=" + obj.getTelefono() + ",email='" + obj.getEmail() + "' "
                    + "where rut_persona=" + obj.getRut() + " and dv_per='" + dv1 + "';";
            results = statement.executeUpdate(actualizarSQL);

            connection.close();

        } //catching excepcion
        catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }

        return results;
    }

    @Override
    public int agregarDatosCliente(Cliente cliente) {
        try {
            //Constructor            
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String agregarSQL = "INSERT INTO cliente (rut_persona,fech_asociacion)"
                    + " VALUES(" + cliente.getRut() + ",'" + cliente.getFechaAsociacion() + "')";
            int results = statement.executeUpdate(agregarSQL);
            System.out.println(results);
            connection.close();
            return results;
        } //catching excepcion
        catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
            return 0;
        }
    }

    @Override
    public Cliente buscarDatos(int rut) {
        Cliente obj = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();
            String query = "Select * from persona join cliente using(rut_persona) where rut_persona=" + rut + ";";

            ResultSet results = statement.executeQuery(query);

            int campo1, campo9;
            String campo2, campo3, campo4, campo5, campo6, campo7, campo8, campo10, campo11, campo12;

            while (results.next()) {
                campo1 = results.getInt("rut_persona");
                campo2 = results.getString("dv_per");
                campo3 = results.getString("p_nombre");
                campo4 = results.getString("s_nombre");
                campo5 = results.getString("ap_pater");
                campo6 = results.getString("ap_mater");
                campo7 = results.getString("direccion");
                campo8 = results.getString("comuna");
                campo9 = results.getInt("telefono");
                campo10 = results.getString("email");
                campo11 = results.getString("fech_asociacion");
                char dvNuevo = campo2.charAt(0);
                if (campo1 == rut) {
                    obj = new Cliente(campo11, campo1, dvNuevo, campo3, campo4, campo5, campo6, campo7, campo8, campo9, campo10);
                    break;
                }
            }
            connection.close();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return obj;
    }

    @Override
    public int eliminarDatosCliente(int rut) {
        try {
            //Constructor

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");
            
            Statement statement = connection.createStatement();
            //Si elimino  a un cliente tambien eliminare todos sus autos
            String query = "DELETE FROM cliente WHERE rut_persona=" + rut;
            
            int results = statement.executeUpdate(query);
                
            connection.close();
            System.out.println("valor---> " + results);
            return results;

        } //catching excepcion
        catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
            return 2;
        }    
    }

    @Override
    public int eliminarDatosPersona(int rut, char dv) {
       try {
            //Constructor

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");
            String dv1 = dv + "";
            Statement statement = connection.createStatement();
            //Si elimino  a un cliente tambien eliminare todos sus autos
            String query = "DELETE FROM persona WHERE rut_persona=" + rut + " and dv_per='" + dv1 + "'";
            
            int results = statement.executeUpdate(query);
                
            connection.close();
            System.out.println("valor---> " + results);
            return results;

        } //catching excepcion
        catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
            return 2;
        }
    }

    @Override
    public Cliente buscarDatosS(String rut, String dv) {
       Cliente obj = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();
           
            String query = "Select * from persona join cliente using(rut_persona) where rut_persona=" + rut + " and dv_per='" + dv + "';";

            ResultSet results = statement.executeQuery(query);

            int campo1, campo9;
            String campo2, campo3, campo4, campo5, campo6, campo7, campo8, campo10, campo11, campo12;

            while (results.next()) {
                campo1 = results.getInt("rut_persona");
                campo2 = results.getString("dv_per");
                campo3 = results.getString("p_nombre");
                campo4 = results.getString("s_nombre");
                campo5 = results.getString("ap_pater");
                campo6 = results.getString("ap_mater");
                campo7 = results.getString("direccion");
                campo8 = results.getString("comuna");
                campo9 = results.getInt("telefono");
                campo10 = results.getString("email");
                campo11 = results.getString("fech_asociacion");
                char dvNuevo = campo2.charAt(0);
                if (rut.equals(campo1+"") ) {
                    obj = new Cliente(campo11, campo1, dvNuevo, campo3, campo4, campo5, campo6, campo7, campo8, campo9, campo10);
                    break;
                }
            }
            connection.close();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }   
        return obj;
    }

}
