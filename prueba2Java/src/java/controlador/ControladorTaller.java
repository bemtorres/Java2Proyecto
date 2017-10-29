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
public class ControladorTaller implements GeneralDaoTaller{
    
    @Override
    public Auto buscarDatosAuto(String patente, int rut, char dv) {
        Auto obj = null;
        try {
                      Class.forName("com.mysql.jdbc.Driver").newInstance();
                        Connection connection = DriverManager.getConnection
                                               ("jdbc:mysql://localhost:3306/empresa","root","");

                        Statement statement = connection.createStatement();
                       String dv1 = dv+ "";
                        String query = "Select * FROM vehiculo JOIN auto using(patente) WHERE patente='"+patente+"' and rut_persona="+rut+" and dv='"+dv1+"';" ;
                                
                        ResultSet results = statement.executeQuery(query);
                        
                        int rut_persona;
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
                        while (results.next())
                        {
                                rut_persona = results.getInt("rut_persona");                                
                                patente = results.getString("patente");
                                cantPuertas = results.getInt("cant_puertas");
                                cantAsientos = results.getInt("asientos");
                                tipoAuto = results.getString("tipo_auto");
                                cantAirbags = results.getInt("canti_aitbag");
                                cambiosAutomaticos = results.getString("camb_automatico");
                                electrico = results.getString("electrico");
                                direccionAsistida = results.getString("dire_asistid");
                                portaEquipaje = results.getString("port_equip");
                                marca = results.getString("marca");
                                foto= results.getString("foto");
                                anyo= results.getInt("anyo");
                                kilometraje = results.getInt("kilometraje");
                                tipo_bencina = results.getString("tip_bencina");
                                
                                obj = new Auto(cantPuertas, cantAsientos, tipoAuto, cantAirbags, cambiosAutomaticos, electrico, direccionAsistida, portaEquipaje, cantAsientos, marca, rut, foto, anyo, kilometraje, tipo_bencina);
                                break;                                
                       }
                  connection.close();
         }
         catch(java.lang.Exception ex){
            System.out.println("Error: " + ex);
         }
       return obj;
    }

    @Override
    public Moto buscarDatosMoto(String patente, int rut, char dv) {
      return null;
    }
    
}
