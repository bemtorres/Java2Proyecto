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
public class AutoDAO implements GeneralDAOAuto{
    private ArrayList<Auto> arrayAutos = new ArrayList<>();
    @Override
    public ArrayList mostrarDatos() {
        
        Auto obj = null;
        try {
            
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();            
            Connection connection = DriverManager.getConnection
                          ("jdbc:mysql://localhost:3306/empresa","root","");
        
            Statement statement = connection.createStatement();
            
            String consultaSQL = "Select * from vehiculo join auto using(patente);" ;
                                 
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

            arrayAutos.removeAll(arrayAutos);
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
                                
                                obj = new Auto(cantPuertas, cantAsientos, tipoAuto, cantAirbags, cambiosAutomaticos, electrico, direccionAsistida, portaEquipaje, cantAsientos, marca, rut_persona, foto, anyo, kilometraje, tipo_bencina);
                                arrayAutos.add(obj);
                                break;                                
            }
          
            // Fin de conexi�n
                            
                        connection.close();
                
        } //catching excepcion
        catch(java.lang.Exception ex){
            System.out.println("Error: " + ex);
        }   
        return arrayAutos;
    }

    @Override
    public Auto buscarDatos(String patente) {
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public int agregarDatosVehiculo(Auto auto) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();            
            Connection connection = DriverManager.getConnection
                          ("jdbc:mysql://localhost:3306/empresa","root","");
        
            Statement statement = connection.createStatement();
                          
           String  agregarSQL = "INSERT INTO vehiculos (marca,rut,foto,anyo,kilometraje,tip_bencina)"+
                                 " VALUES('"+auto.getMarca()+"','"+auto.getRut()+"','"+auto.getFoto()+"','"+auto.getAnyo()+"','"+auto.getKilometraje()+"','"+auto.getTipo_bencina()+"')";
            
        }
        catch(java.lang.Exception ex)
        {
            System.out.println("Error: " + ex);
            return 0;
        }
    }

    @Override
    public int agregarDatosAuto(Auto auto) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();            
            Connection connection = DriverManager.getConnection
                          ("jdbc:mysql://localhost:3306/empresa","root","");
        
            Statement statement = connection.createStatement();
            
            /*
            private int cantPuertas;
            private int cantAsientos;
            private String tipoAuto;
            private int cantAirbags;
            private String cambiosAutomaticos;
            private String electrico;
            private String direccionAsistida;
            private String portaEquipaje;
            */
                          
           String  agregarSQL = "INSERT INTO auto(cantPuertas,cantAsientos,tipoAuto,cantAirbags,cambiosAutomaticos,electrico,direccionAsistida,portaEqipaje)"+
    " VALUES('"+auto.getCantPuertas()+"','"+auto.getCantAsientos()+"','"+auto.getTipoAuto()+"','"+auto.getCantAirbags()+"','"+auto.getCambiosAutomaticos()+"','"+auto.getElectrico()+"','"+auto.getDireccionAsistida()+"','"+auto.getPortaEquipaje()+"')";
            
        }
        catch(java.lang.Exception ex)
        {
            System.out.println("Error: " + ex);
            return 0;
        }
    }

    @Override
    public int eliminarDatos(String patente) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();            
            Connection connection = DriverManager.getConnection
                          ("jdbc:mysql://localhost:3306/empresa","root","");
        
            Statement statement = connection.createStatement();
            
            //String  query="DELETE FROM usuarios WHERE username='"+usuario+"'";
            String  query="DELETE FROM autos WHERE patente='"+patente+"'";
            
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

    @Override
    public int actualizarDatosPersonaAuto(Auto obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
     
}
