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
public class RegistroTallerDAO implements GeneralDAORegistroTaller{

    private ArrayList<FichaReparacion> arrayFichaReparacions = new ArrayList<>();

    @Override
    public ArrayList mostrarDatos() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            Statement statement = connection.createStatement();

            String consultaSQL = "SELECT * fich_reparacion;";

            ResultSet results = statement.executeQuery(consultaSQL);
            /*
             id_ficha    INT NOT NULL AUTO_INCREMENT,
            rut_persona INT NOT NULL ,
            patente VARCHAR (10) NOT NULL ,
            id_est_fich  INT NOT NULL ,
            fech_ingreso DATE NOT NULL ,
            fech_salida  DATE NOT NULL ,
            motivos VARCHAR (250) NOT NULL ,
            detalles VARCHAR (250) NOT NULL ,
            hor_trabajo INT NOT NULL ,
            total       INT NOT NULL,
           
             private int idFicha;
    private int rutPersona;
    private String patente;
    private int idEstadoFicha;
    private String fechaIngreso;
    private String fechaSalida;
    private String detalles;
    private int horasTrabajo;
    private int total;
            */
            int idFicha,rutPersona, idEstadoFicha, horasTrabajo, total;
            String patente, fechaIngreso, fechaSalida, motivos, detalles ;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FichaReparacion buscarDatosCompleto(String patente, int rut, char dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int agregarDatos(FichaReparacion ficha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminarDatos(String patente, int rut, char dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizarDatosFicha(FichaReparacion obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
