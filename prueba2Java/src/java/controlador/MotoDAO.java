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
                                marca = results.getString("marca");
                                rut_persona = results.getInt("rut_persona");
                                foto= results.getString("foto");
                                anyo= results.getInt("anyo");
                                kilometraje = results.getInt("kilometraje");
                                tipo_bencina = results.getString("tip_bencina");
                                tipoAuto = results.getString("tipo_moto");
   
                                obj = new Moto(patente, marca, anyo, foto,kilometraje, tipo_bencina,tipo_moto);
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
        Moto obj =null;
          try {

                      Class.forName("com.mysql.jdbc.Driver").newInstance();

                        Connection connection = DriverManager.getConnection
                                               ("jdbc:mysql://localhost:3306/empresa","root","");


                        Statement statement = connection.createStatement();

                        String query = "SELECT * from moto where patente='"+patente+"';" ;


                         ResultSet results = statement.executeQuery(query);
                        
                        String campo1; 
                        int campo2;                     
                        String campo3;
                        String campo4;
                        int campo5;
                        int campo6;
                        String campo7;  
                             
                            while (results.next())
                            {
                                campo1 = results.getString("patente");
                                campo2=results.getInt("rut_persona");
                                campo3=results.getString("marca");
                                campo4=results.getString("foto");
                                campo5=results.getInt("anyo");
                                campo6=results.getInt("kilometraje");
                                campo7=results.getString("tipo_moto");
                                
                                
                                if(campo1.equals(patente)){
                                     obj=new Moto(campo1,campo2,campo3,campo4,campo5,campo6,campo7);
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
    public int agregarDatosVehiculo(Moto moto) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();            
            Connection connection = DriverManager.getConnection
                          ("jdbc:mysql://localhost:3306/empresa","root","");
        
            Statement statement = connection.createStatement();
                          
           String  agregarSQL = "INSERT INTO vehiculos (marca,rut_persona,foto,anyo,kilometraje,tip_bencina)"+
                                 " VALUES('"+moto.getMarca()+"',"+moto.getRut()+",'"+moto.getFoto()+"',"+moto.getAnyo()+","+moto.getKilometraje()+",'"+moto.getTipo_bencina()+"')";
            
        }
        catch(java.lang.Exception ex)
        {
            System.out.println("Error: " + ex);
            return 0;
        }
    }

    @Override
    public int agregarDatosMoto(Moto moto) {
        
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
