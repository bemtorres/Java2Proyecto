/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Auto;
//importado de "EmpeladoDAO"
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author carlos
 */
public class AutoDAO implements GeneralDAOAuto {

    private static ArrayList<Auto> arrayAutos = new ArrayList<Auto>();

    @Override
    public ArrayList mostrarDatos() {

        Auto obj = null;
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String query = "Select * from vehiculo join auto using(patente);";

            ResultSet results = statement.executeQuery(query);

            int cantPuertas;
            int cantAsientos;
            String tipoAuto;
            int cantAirbags;
            String cambiosAutomaticos;
            String electrico;
            String direccionAsistida;
            String portaEquipaje;
            String marca;
            String foto;
            int anyo;
            int kilometraje;
            String tipo_bencina;
            String patente;
            int rut;
            
            arrayAutos.removeAll(arrayAutos);
            while (results.next()) {
                cantPuertas = results.getInt("cant_puertas");
                cantAsientos = results.getInt("asientos");
                tipoAuto = results.getString("tipo_auto");
                cantAirbags = results.getInt("cant_airbag");
                cambiosAutomaticos = results.getString("camb_automatico");
                electrico = results.getString("electrico");
                direccionAsistida = results.getString("dire_asistid");
                portaEquipaje = results.getString("port_equip");
                marca = results.getString("marca");
                foto = results.getString("foto");
                anyo = results.getInt("anyo");
                kilometraje = results.getInt("kilometraje");
                tipo_bencina = results.getString("tip_bencina");
                patente = results.getString("patente");
                rut = results.getInt("rut_persona");

                obj = new Auto(cantPuertas, cantAsientos, tipoAuto, cantAirbags, cambiosAutomaticos, electrico, direccionAsistida, portaEquipaje, patente, marca, rut, foto, anyo, kilometraje, tipo_bencina);
                arrayAutos.add(obj);                
            }
            // Fin de conexi�n
            connection.close();

        } //catching excepcion
        catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return arrayAutos;
    }

    @Override
    public Auto buscarDatos(String patente) {

        Auto obj = null;
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String query = "Select * from vehiculo join auto WHERE patente='" + patente + "';";

            ResultSet results = statement.executeQuery(query);

            int rut;
            int cantPuertas;
            int cantAsientos;
            String tipoAuto;
            int cantAirbags;
            String cambiosAutomaticos;
            String electrico;
            String direccionAsistida;
            String portaEquipaje;
            String marca;
            String foto;
            int anyo;
            int kilometraje;
            String tipo_bencina;

            while (results.next()) {

                patente = results.getString("patente");
                cantPuertas = results.getInt("cant_puertas");
                cantAsientos = results.getInt("asientos");
                tipoAuto = results.getString("tipo_auto");
                cantAirbags = results.getInt("cant_airbag");
                cambiosAutomaticos = results.getString("camb_automatico");
                electrico = results.getString("electrico");
                direccionAsistida = results.getString("dire_asistid");
                portaEquipaje = results.getString("port_equip");
                marca = results.getString("marca");
                rut = results.getInt("rut_persona");
                foto = results.getString("foto");
                anyo = results.getInt("anyo");
                kilometraje = results.getInt("kilometraje");
                tipo_bencina = results.getString("tip_bencina");
                
                obj =  new Auto(cantPuertas, cantAsientos, tipoAuto, cantAirbags, cambiosAutomaticos, electrico, direccionAsistida, portaEquipaje, patente, marca, rut, foto, anyo, kilometraje, tipo_bencina);
                
            }
            connection.close();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }

        return obj;
    }

    @Override
    public int agregarDatosVehiculo(Auto auto) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String agregarSQL = "INSERT INTO vehiculo (patente, rut_persona,marca,foto,anyo,kilometraje,tip_bencina)"
                    + " VALUES('" + auto.getPatente() + "'," + auto.getRut() + ",'" + auto.getMarca() + "','" + auto.getFoto() + "'," + auto.getAnyo() + "," + auto.getKilometraje() + ",'" + auto.getTipo_bencina() + "')";
            int results = statement.executeUpdate(agregarSQL);
            //System.out.println(results);           
            connection.close();
            return results;
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
            return 0;
        }
    }

    @Override
    public int agregarDatosAuto(Auto auto) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String agregarSQL = "INSERT INTO auto (patente,"
                    + " cant_puertas,"
                    + "asientos,"
                    + "tipo_auto,"
                    + "cant_airbag,"
                    + "camb_automatico,"
                    + "electrico,"
                    + "dire_asistid,"
                    + "port_equip)"
                    + " VALUES('" + auto.getPatente() + "', "
                    + auto.getCantPuertas() + ","
                    + auto.getCantAsientos() + ","
                    + "'" + auto.getTipoAuto() + "', "
                    + auto.getCantAirbags() + ","
                    + "'" + auto.getCambiosAutomaticos() + "',"
                    + "'" + auto.getElectrico() + "',"
                    + "'" + auto.getDireccionAsistida() + "',"
                    + "'" + auto.getPortaEquipaje() + "')";
            int results = statement.executeUpdate(agregarSQL);
            //System.out.println(results);           
            connection.close();
            return results;
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
            return 0;
        }
    }

    @Override
    public int eliminarDatos(String patente) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            //String  query="DELETE FROM usuarios WHERE username='"+usuario+"'";
            String query = "DELETE FROM auto WHERE patente='" + patente + "'";

            int results = statement.executeUpdate(query);

            connection.close();
            System.out.println("valor---> " + results);
            return results;

        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
            return 2;
        }
    }

    @Override
    public int actualizarDatosAuto(Auto obj) {
        int results = 0;

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String agregarSQL = "UPDATE vehiculo SET  foto= '"
                    + obj.getFoto()+ "',kilometraje = "+obj.getKilometraje()+" where patente='" + obj.getPatente()+ "'";
 
            results = statement.executeUpdate(agregarSQL);

            connection.close();

        } //catching excepcion
        catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }

        return results;
    }

    @Override
    public int eliminarDatosVehiculo(String patente) {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");


            Statement statement = connection.createStatement();

            //String  query="DELETE FROM usuarios WHERE username='"+usuario+"'";
            String query = "DELETE FROM vehiculo WHERE patente='" + patente + "'";

            int results = statement.executeUpdate(query);

            connection.close();
            System.out.println("valor---> " + results);
            return results;

        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
            return 2;
        }
    }

}
