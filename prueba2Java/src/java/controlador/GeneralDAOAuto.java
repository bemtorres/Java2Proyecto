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
    public abstract Auto buscarDatos(String patente) ;
    public abstract int agregarDatosVehiculo(Auto auto);
    public abstract int agregarDatosAuto(Auto auto);
    public abstract int eliminarDatos(String patente);
    public abstract int actualizarDatosAuto(Auto obj); 
    public abstract int eliminarDatosVehiculo(String patente);
}
