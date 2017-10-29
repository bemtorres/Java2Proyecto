/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Auto;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public interface GeneralDAOAuto {
   public abstract ArrayList mostrarDatos();
    public abstract Auto buscarDatos(int rut, char dv) ;
    public abstract int agregarDatosPersona(Auto auto);
    public abstract int agregarDatosCliente(Auto auto);
    public abstract int eliminarDatos(int rut, char dv);
    public abstract int actualizarDatosPersonaCliente(Auto obj); 
}
