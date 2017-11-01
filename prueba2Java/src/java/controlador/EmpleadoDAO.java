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
import java.util.Date;
import modelo.Cliente;
import modelo.Empleado;

/**
 *
 * @author benja
 */
public class EmpleadoDAO implements GeneralDAOEmpleado {

    private static ArrayList<Empleado> arrayEmpleados = new ArrayList<Empleado>();

    @Override
    public ArrayList mostrarDatos() {
     try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String consultaSQL = "Select * from persona join empleado using(rut_persona);";

            ResultSet results = statement.executeQuery(consultaSQL);


            arrayEmpleados.removeAll(arrayEmpleados);
            Date fechaContrato;
            String clave;
            int horaTrabajo;
            int valorHora;
            int sueldo;
            char dv;
            String primerNombre;
            String segundoNombre;
            String apellidoPaterno;
            String apellidoMaterno;
            String direccion;
            String comuna;
            int telefono;
            String email;
            String usuario;
            int rut;
            while (results.next()) {
                rut = results.getInt("rut_persona");
                dv = results.getString("dv_per").charAt(0);
                primerNombre = results.getString("p_nombre");
                segundoNombre = results.getString("s_nombre");
                apellidoPaterno = results.getString("ap_pater");
                apellidoMaterno = results.getString("ap_mater");
                direccion = results.getString("direccion");
                comuna = results.getString("comuna");
                telefono = results.getInt("telefono");
                email = results.getString("email");
                fechaContrato = results.getDate("fech_contra");
                usuario = results.getString("usuario");
                clave = results.getString("clave");
                horaTrabajo = results.getInt("hor_trabo");
                valorHora = results.getInt("val_hora");
                sueldo = results.getInt("sueldo");               
                //System.out.println(campo1 +"   "+campo2 +"\n");
                arrayEmpleados.add(new Empleado(fechaContrato, usuario, clave, horaTrabajo, valorHora, sueldo, rut, dv, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, direccion, comuna, telefono, email));
            }

            // Fin de conexi�n
            connection.close();

        } //catching excepcion
        catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return arrayEmpleados;

    }

    @Override
    public boolean verificarDatos(String usuario, String password) {
        boolean estado = false;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");
            Statement statement = connection.createStatement();
            String consultaSQL = "SELECT * from empleado where usuario='" + usuario + "' and clave='" + password + "';";
            ResultSet results = statement.executeQuery(consultaSQL);

            String campo1;
            String campo2;

            while (results.next()) {
                campo1 = results.getString("usuario");
                campo2 = results.getString("clave");
                if (campo1.equals(usuario)) {
                    estado = true;
                }
            }
            connection.close();

        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return estado;
    }

    @Override
    public Empleado buscarDatos(int rut) {
        Empleado obj = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String query = "Select * from persona join empleado using(rut_persona) where rut_persona=" + rut + ";";

            ResultSet results = statement.executeQuery(query);
            Date fechaContrato;
            String clave;
            int horaTrabajo;
            int valorHora;
            int sueldo;
            char dv;
            String primerNombre;
            String segundoNombre;
            String apellidoPaterno;
            String apellidoMaterno;
            String direccion;
            String comuna;
            int telefono;
            String email;
            String usuario;
            
            while (results.next()) {
                rut = results.getInt("rut_persona");
                dv = results.getString("dv_per").charAt(0);
                primerNombre = results.getString("p_nombre");
                segundoNombre = results.getString("s_nombre");
                apellidoPaterno = results.getString("ap_pater");
                apellidoMaterno = results.getString("ap_mater");
                direccion = results.getString("direccion");
                comuna = results.getString("comuna");
                telefono = results.getInt("telefono");
                email = results.getString("email");
                fechaContrato = results.getDate("fech_contra");
                usuario = results.getString("usuario");
                clave = results.getString("clave");
                horaTrabajo = results.getInt("hor_trabo");
                valorHora = results.getInt("val_hora");
                sueldo = results.getInt("sueldo");               
                obj = new Empleado(fechaContrato, usuario, clave, horaTrabajo, valorHora, sueldo, rut, dv, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, direccion, comuna, telefono, email);
                break;
            }
            connection.close();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return obj;
    
    }

    @Override
    public int actualizarDatos(Empleado obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado buscarDatos(String usuario) {
        Empleado obj = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String query = "Select * from persona join empleado using(rut_persona) where usuario='" + usuario + "';";

            ResultSet results = statement.executeQuery(query);
            Date fechaContrato;
            String clave;
            int horaTrabajo;
            int valorHora;
            int sueldo;
            char dv;
            String primerNombre;
            String segundoNombre;
            String apellidoPaterno;
            String apellidoMaterno;
            String direccion;
            String comuna;
            int telefono;
            String email;
            int rut;
            while (results.next()) {
                rut = results.getInt("rut_persona");
                dv = results.getString("dv_per").charAt(0);
                primerNombre = results.getString("p_nombre");
                segundoNombre = results.getString("s_nombre");
                apellidoPaterno = results.getString("ap_pater");
                apellidoMaterno = results.getString("ap_mater");
                direccion = results.getString("direccion");
                comuna = results.getString("comuna");
                telefono = results.getInt("telefono");
                email = results.getString("email");
                fechaContrato = results.getDate("fech_contra");
                usuario = results.getString("usuario");
                clave = results.getString("clave");
                horaTrabajo = results.getInt("hor_trabo");
                valorHora = results.getInt("val_hora");
                sueldo = results.getInt("sueldo");

                obj = new Empleado(fechaContrato, usuario, clave, horaTrabajo, valorHora, sueldo, rut, dv, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, direccion, comuna, telefono, email);
                break;
            }
            connection.close();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return obj;
    }

}
