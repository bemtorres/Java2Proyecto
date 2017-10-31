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
import modelo.Auto;
import modelo.Moto;

/**
 *
 * @author benja
 */
public class ControladorDAOTaller implements GeneralDaoTaller {

    @Override
    public Auto buscarDatosAuto(String patente, int rut, char dv) {
        Auto obj = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String query = "Select * FROM vehiculo JOIN auto using(patente) WHERE patente='" + patente + "' and rut_persona=" + rut + ";";

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

                obj = new Auto(cantPuertas, cantAsientos, tipoAuto, cantAirbags, cambiosAutomaticos, electrico, direccionAsistida, portaEquipaje, patente, marca, rut, foto, anyo, kilometraje, tipo_bencina);
                break;
            }
            connection.close();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return obj;
    }

    @Override
    public Moto buscarDatosMoto(String patente, int rut, char dv) {
        Moto obj = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();
            String dv1 = dv + "";
            String query = "Select * FROM vehiculo JOIN moto on(vehiculo.patente = moto.vehiculo_patente)  WHERE vehiculo_patente='" + patente + "' and rut_persona=" + rut + ";";

            ResultSet results = statement.executeQuery(query);

            int rut_persona;
            String marca;
            String foto;
            int anyo;
            int kilometraje;
            String tipo_bencina;
            String tipomoto;

            while (results.next()) {
                marca = results.getString("marca");
                foto = results.getString("foto");
                anyo = results.getInt("anyo");
                tipomoto = results.getString("tip_moto");
                kilometraje = results.getInt("kilometraje");
                tipo_bencina = results.getString("tip_bencina");

                obj = new Moto(tipomoto, patente, marca, rut, foto, anyo, kilometraje, tipo_bencina);
                break;
            }
            connection.close();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return obj;
    }

    @Override
    public Auto buscarDatosAuto(String patente) {
        Auto obj = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String query = "Select * FROM vehiculo JOIN auto using(patente) WHERE patente='" + patente + "';";

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
                rut = results.getInt("rut_persona");
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

                obj = new Auto(cantPuertas, cantAsientos, tipoAuto, cantAirbags, cambiosAutomaticos, electrico, direccionAsistida, portaEquipaje, patente, marca, rut, foto, anyo, kilometraje, tipo_bencina);
                break;
            }
            connection.close();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return obj;
    }

    @Override
    public Moto buscarDatosMoto(String patente) {
        Moto obj = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String query = "Select * FROM vehiculo JOIN moto on(vehiculo.patente = moto.vehiculo_patente)  WHERE vehiculo_patente='" + patente + "';";

            ResultSet results = statement.executeQuery(query);

            int rut;
            String marca;
            String foto;
            int anyo;
            int kilometraje;
            String tipo_bencina;
            String tipomoto;

            while (results.next()) {
                rut = results.getInt("rut_persona");
                marca = results.getString("marca");
                foto = results.getString("foto");
                anyo = results.getInt("anyo");
                tipomoto = results.getString("tip_moto");
                kilometraje = results.getInt("kilometraje");
                tipo_bencina = results.getString("tip_bencina");
                obj = new Moto(tipomoto, patente, marca, rut, foto, anyo, kilometraje, tipo_bencina);
                break;
            }
            connection.close();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return obj;
    }

}
