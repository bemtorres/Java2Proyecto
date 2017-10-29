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
public class MotoDAO implements GeneralDAOMoto{
    private static ArrayList<Moto> arrayMotos = new ArrayList<Moto>();

    @Override
    public ArrayList mostrarDatos() {
        Auto obj = null;
        try {
            
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();            
            Connection connection = DriverManager.getConnection
                          ("jdbc:mysql://localhost:3306/empresa","root","");
        
            Statement statement = connection.createStatement();
            
            String consultaSQL = "Select * from vehiculo join moto using(patente);" ;
                                 
            ResultSet results = statement.executeQuery(consultaSQL);
                        String patente;
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

            arrayMotos.removeAll(arrayMotos);
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
                                rut_persona = results.getInt("rut_persona");
                                foto= results.getString("foto");
                                anyo= results.getInt("anyo");
                                kilometraje = results.getInt("kilometraje");
                                tipo_bencina = results.getString("tip_bencina");
                                
                                obj = new Moto(cantPuertas, cantAsientos, tipoAuto, cantAirbags, cambiosAutomaticos, electrico, direccionAsistida, portaEquipaje, patente, marca, anyo, foto, anyo, kilometraje, tipo_bencina);
                                arrayMotos.add(obj);
                                break;                                
            }
          
            // Fin de conexi�n
                            
                        connection.close();
                
        } //catching excepcion
        catch(java.lang.Exception ex){
            System.out.println("Error: " + ex);
        }   
        return arrayMotos;
   
    }

    
    
    @Override
    public Moto buscarDatos(String patente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int agregarDatosVehiculo(Moto moto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int agregarDatosMoto(Moto moto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminarDatos(String patente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizarDatosPersonaCliente(Moto obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
