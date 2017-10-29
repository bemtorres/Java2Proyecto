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
    private static ArrayList<Auto> arrayAutos = new ArrayList<Auto>();
    
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
                                
                                obj = new Auto(cantPuertas, cantAsientos, tipoAuto, cantAirbags, cambiosAutomaticos, electrico, direccionAsistida, portaEquipaje, patente, marca, anyo, foto, anyo, kilometraje, tipo_bencina);
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
        
        Auto obj =null;
          try {

                      Class.forName("com.mysql.jdbc.Driver").newInstance();

                        Connection connection = DriverManager.getConnection
                                               ("jdbc:mysql://localhost:3306/empresa","root","");


                        Statement statement = connection.createStatement();

                        String query = "SELECT * from auto where patente='"+patente+"';" ;


                         ResultSet results = statement.executeQuery(query);
                        
                        String campo1; 
                        int campo2;
                        int campo3;
                        int campo4;
                        String campo5;
                        int campo6;
                        String campo7;
                        String campo8;
                        String campo9;
                        String campo10;                       
                        String campo11;
                        String campo12;
                        int campo13;
                        int campo14;
                        String campo15;  
                             
                            while (results.next())
                            {
                                campo1 = results.getString("patente");
                                campo2=results.getInt("rut_persona");
                                campo3=results.getInt("canPuertas");
                                campo4=results.getInt("cantAsientos");
                                campo5=results.getString("tipoAuto");
                                campo6=results.getInt("cantAirbags");
                                campo7=results.getString("cambiosAutomaticos");
                                campo8=results.getString("electrico");
                                campo9=results.getString("direccionAsistida");
                                campo10=results.getString("portaEquipaje");
                                campo11=results.getString("marca");
                                campo12=results.getString("foto");
                                campo13=results.getInt("anyo");
                                campo14=results.getInt("kilometraje");
                                
                                
                                if(campo1.equals(patente)){
                                     obj=new Auto(campo1,campo2,campo3,campo4,campo5,campo6,campo7,campo8, campo9,campo10,campo11,campo12,campo13,campo14);
                                     break;
                                }
                            }
                  connection.close();
         }
         catch(java.lang.Exception ex){
            System.out.println("Error: " + ex);
         }
 
         return obj;
    }

    @Override
    public int agregarDatosVehiculo(Auto auto) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();            
            Connection connection = DriverManager.getConnection
                          ("jdbc:mysql://localhost:3306/empresa","root","");
        
            Statement statement = connection.createStatement();
                          
           String  agregarSQL = "INSERT INTO vehiculos (marca,rut_persona,foto,anyo,kilometraje,tip_bencina)"+
                                 " VALUES('"+auto.getMarca()+"',"+auto.getRut()+",'"+auto.getFoto()+"',"+auto.getAnyo()+","+auto.getKilometraje()+",'"+auto.getTipo_bencina()+"')";
            
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
    public int actualizarDatosAuto(Auto obj) {
        int results=0;
        
        try {
                   
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","");
        
            Statement statement = connection.createStatement();

            String  agregarSQL = "UPDATE auto SET  patente='"+
                                 obj.getPatente()+"' where rut_persona='"+obj.getRut()+"'";
            
            results = statement.executeUpdate(agregarSQL);
                  
             connection.close();
                
        } //catching excepcion
        catch(java.lang.Exception ex){
            System.out.println("Error: " + ex);
        }
        
      return results;  
    }
     
}
