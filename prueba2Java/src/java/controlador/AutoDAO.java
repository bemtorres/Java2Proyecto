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
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();            
            Connection connection = DriverManager.getConnection
                          ("jdbc:mysql://localhost:3306/empresa","root","");
        
            Statement statement = connection.createStatement();
            
            String consultaSQL = "Select * from vehiculo join auto using(patente);" ;
                                 
            ResultSet results = statement.executeQuery(consultaSQL);
            /*
            private String patente;
            private String marca;
            private String foto;
            private int anyo;
            private int kilometraje;
            private String tipo_bencina;
            private int cantPuertas;
            private int cantAsientos;
            private String tipoAuto;
            private int cantAirbags;
            private String cambiosAutomaticos;
            private String electrico;
            private String direccionAsistida;
            private String portaEquipaje;*/
            
            String campo1, campo2, campo3, campo6, campo9, campo11, campo12, campo13, campo14;
            int campo4, campo5, campo7, campo8, campo10;
                           
            
            arrayAutos.removeAll(arrayAutos);
            while (results.next())
            {
                campo1 =  results.getString("patente");
                campo2 =  results.getString("marca");
                campo3 =  results.getString("p_nombre");
                campo4 =  results.getInt("anyo");
                campo5 =  results.getInt("");
                campo6 =  results.getString("");
                campo7 =  results.getInt("");
                campo8 =  results.getInt("");
                campo9 =  results.getInt("telefono");
                campo10 = results.getString("email");
                campo11 = results.getString("fech_asociacion");
                campo12 = 
                campo13 =
                campo14 =
                        
                char dvNuevo = campo2.charAt(0);
                //System.out.println(campo1 +"   "+campo2 +"\n");
                arrayClientes.add(new Cliente(campo11,campo1, dvNuevo,campo3,campo4,campo5,campo6,campo7,campo8,campo9,campo10));
            }
          
            // Fin de conexi�n
                            
                        connection.close();
                
        } //catching excepcion
        catch(java.lang.Exception ex){
            System.out.println("Error: " + ex);
        }   
        return arrayClientes;
    }

    @Override
    public Auto buscarDatos(String patente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public int agregarDatosVehiculo(Auto auto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public int agregarDatosAuto(Auto auto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public int eliminarDatos(String patente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public int actualizarDatosPersonaAuto(Auto obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
     
}
