/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Moto;
import java.util.ArrayList;
//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author carlos
 */
public class MotoDAO implements GeneralDAOMoto {

    private static ArrayList<Moto> arrayMotos = new ArrayList<Moto>();

    @Override
    public ArrayList mostrarDatos() {
        Moto obj = null;
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            //select * from moto join vehiculo on (moto.vehiculo_patente = vehiculo.patente);
            String consultaSQL = "Select * from vehiculo join moto on(vehiculo.patente= moto.vehiculo_patente);";

            ResultSet results = statement.executeQuery(consultaSQL);
                        String patente;
                        int rut_persona;                     
                        String marca;
                        String foto;
                        int anyo;
                        int kilometraje;
                        String tipo_bencina;
                        String tipo_moto;

            arrayMotos.removeAll(arrayMotos);
            while (results.next())
            {
                                rut_persona = results.getInt("rut_persona");                                
                                patente = results.getString("patente");
                                marca = results.getString("marca");
                                foto= results.getString("foto");
                                anyo= results.getInt("anyo");
                                kilometraje = results.getInt("kilometraje");
                                tipo_bencina = results.getString("tip_bencina");
                                tipo_moto = results.getString("tipo_moto");
   
                               // obj = new Moto(patente, marca, anyo, foto,kilometraje, tipo_bencina,tipo_moto);
                                arrayMotos.add(obj);
                                break;    
            }
            connection.close();

        } //catching excepcion
        catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return arrayMotos;

    }

    @Override
    public Moto buscarDatos(String patente) {
        Moto obj = null;
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String query = "SELECT * from moto join vehiculo on(vehiculo.patente = moto.vehiculo_patente) where vehiculo_patente='" + patente + "';";

            ResultSet results = statement.executeQuery(query);

            String tipomoto;
            String vehiculo_patente;
            String marca;
            int rut_persona;
            String foto;
            int anyo;
            int kilometraje;
            String tipo_bencina;

            while (results.next()) {
                patente = results.getString("vehiculo_patente");
                marca = results.getString("marca");
                rut_persona = results.getInt("rut_persona");
                foto = results.getString("foto");
                anyo = results.getInt("anyo");
                kilometraje = results.getInt("kilometraje");
                tipo_bencina = results.getString("tipo_bencina");
                tipomoto = results.getString("tipo_moto");

                obj = new Moto(tipomoto, patente, marca, anyo, foto, anyo, kilometraje, tipo_bencina);

            }
            connection.close();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }

        return obj;
    }

    @Override
    public int agregarDatosVehiculo(Moto moto) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String agregarSQL = "INSERT INTO vehiculos (marca,rut_persona,foto,anyo,kilometraje,tip_bencina)"
                    + " VALUES('" + moto.getMarca() + "'," + moto.getRut() + ",'" + moto.getFoto() + "'," + moto.getAnyo() + "," + moto.getKilometraje() + ",'" + moto.getTipo_bencina() + "')";
            int results = statement.executeUpdate(agregarSQL);
            //System.out.println(results);           
            connection.close();
            return results;
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
            return 0;
        }
    }
    /////ARREGLAR DE ACA ABAJO
    @Override
    public int agregarDatosMoto(Moto moto) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();
            
           String  agregarSQL = "INSERT INTO moto(tipo_moto)"+
            " VALUES('"+moto.getTipomoto()+"')";
              int results = statement.executeUpdate(agregarSQL);

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
            String query = "DELETE FROM moto WHERE patente='" + patente + "'";

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
    public int actualizarDatosMoto(Moto obj) {
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
         try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();            
            Connection connection = DriverManager.getConnection
                          ("jdbc:mysql://localhost:3306/empresa","root","");
        
            Statement statement = connection.createStatement();
            
            //String  query="DELETE FROM usuarios WHERE username='"+usuario+"'";
            String  query="DELETE FROM vehiculo WHERE patente='"+patente+"'";
            
            int results = statement.executeUpdate(query);
            
             connection.close();
            System.out.println("valor---> " + results);
             return results;
           
        }
        catch(java.lang.Exception ex)
        {
            System.out.println("Error: " + ex);
            return 2;
        }  
    }

}
