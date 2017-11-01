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
import modelo.FichaReparacion;

/**
 *
 * @author benja
 */
public class RegistroTallerDAO implements GeneralDAORegistroTaller {

    private ArrayList<FichaReparacion> arrayFichaReparacions = new ArrayList<>();

    @Override
    public ArrayList mostrarDatos() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String consultaSQL = "SELECT * FROM fich_reparacion;";

            ResultSet results = statement.executeQuery(consultaSQL);
           
            int idFicha, rutPersona, idEstadoFicha, horasTrabajo, total;
            String patente, fechaIngreso, fechaSalida, motivos, detalles;

            arrayFichaReparacions.removeAll(arrayFichaReparacions);
            while (results.next()) {
                idFicha = results.getInt("id_ficha");
                rutPersona = results.getInt("rut_persona");
                patente = results.getString("patente");
                idEstadoFicha = results.getInt("p_nombre");
                fechaIngreso = results.getString("fech_ingreso");
                fechaSalida = results.getString("fech_salida");
                motivos = results.getString("motivos");
                detalles = results.getString("detalles");
                horasTrabajo = results.getInt("hor_trabajo");
                total = results.getInt("total");
                //System.out.println(campo1 +"   "+campo2 +"\n");
                arrayFichaReparacions.add(new FichaReparacion(idFicha, rutPersona,
                        patente, idEstadoFicha, fechaIngreso, fechaSalida,
                        motivos, detalles, horasTrabajo, total));
            }

            // Fin de conexi�n
            connection.close();

        } //catching excepcion
        catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return arrayFichaReparacions;
    }

    @Override
    public FichaReparacion buscarDatosPorPatente(String patente) {
        FichaReparacion obj = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM fich_reparacion WHERE patente= '" + patente + "';";

            ResultSet results = statement.executeQuery(query);

            int idFicha, rutPersona, idEstadoFicha, horasTrabajo, total;
            String  fechaIngreso, fechaSalida, motivos, detalles;

            while (results.next()) {
                idFicha = results.getInt("id_ficha");
                rutPersona = results.getInt("rut_persona");
               
                idEstadoFicha = results.getInt("id_est_fich");
                fechaIngreso = results.getString("fech_ingreso");
                fechaSalida = results.getString("fech_salida");
                
                motivos = results.getString("motivos");
                detalles = results.getString("detalles");
                horasTrabajo = results.getInt("hor_trabajo");
                total = results.getInt("total");
                obj = new FichaReparacion(idFicha, rutPersona, patente, idEstadoFicha, fechaIngreso, fechaSalida, motivos, detalles, horasTrabajo, total);
                break;
                
            }
            connection.close();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return obj;
    }

    @Override
    public FichaReparacion buscarDatosCompleto(String patente, int rut, char dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int agregarDatos(FichaReparacion ficha) {
        try {
            //Constructor               
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String agregarSQL = "INSERT INTO fich_reparacion "
                    + "(rut_persona , patente, id_est_fich, fech_ingreso,fech_salida,motivos,detalles,hor_trabajo,total)"
                    + "VALUES(" + ficha.getRutPersona() + ", '" + ficha.getPatente() + "','" + ficha.getIdEstadoFicha()
                    + "','" + ficha.getFechaIngreso() + "','" + ficha.getFechaSalida() + "','" + ficha.getMotivos() + "','" + ficha.getDetalles() + "',"
                    + ficha.getHorasTrabajo() + "," + ficha.getTotal() + ");";
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
    public int eliminarDatos(String patente, int rut, char dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizarDatosFicha(FichaReparacion obj) {
          int results = 0;
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");
            
                       
            Statement statement = connection.createStatement();
            
            String actualizarSQL ="UPDATE fich_reparacion  SET"
                    + " id_est_fich="+obj.getIdEstadoFicha()+","
                    + " fech_salida='"+obj.getFechaSalida()+"',"
                    + " detalles='"+obj.getDetalles()+"',"                  
                    + " hor_trabajo="+obj.getHorasTrabajo()+","
                    + " total="+obj.getTotal()+" WHERE patente='"+obj.getPatente()+"';";
                    
            results = statement.executeUpdate(actualizarSQL);

            connection.close();

        } //catching excepcion
        catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }

        return results;
    }

    @Override
    public FichaReparacion buscarDatosPorId(int id) {
       FichaReparacion obj = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM fich_reparacion WHERE id_ficha =" + id + ";";

            ResultSet results = statement.executeQuery(query);

            int idFicha, rutPersona, idEstadoFicha, horasTrabajo, total;
            String patente, fechaIngreso, fechaSalida, motivos, detalles;

            while (results.next()) {
                idFicha = results.getInt("id_ficha");
                rutPersona = results.getInt("rut_persona");
                patente = results.getString("patente");
                idEstadoFicha = results.getInt("p_nombre");
                fechaIngreso = results.getString("fech_ingreso");
                fechaSalida = results.getString("fech_salida");
                motivos = results.getString("motivos");
                detalles = results.getString("detalles");
                horasTrabajo = results.getInt("hor_trabajo");
                total = results.getInt("total");

                obj = new FichaReparacion(idFicha, rutPersona, patente, idEstadoFicha, fechaIngreso, fechaSalida, motivos, detalles, horasTrabajo, total);

                break;
                
            }
            connection.close();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return obj;
    }

}
