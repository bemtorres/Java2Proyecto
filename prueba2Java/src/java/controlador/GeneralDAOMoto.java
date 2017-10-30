/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Moto;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public interface GeneralDAOMoto {
    public abstract ArrayList mostrarDatos();
    public abstract Moto buscarDatos(String patente) ;
    public abstract int agregarDatosVehiculo(Moto moto);
    public abstract int agregarDatosMoto(Moto moto);
    public abstract int eliminarDatos(String patente);
    public abstract int actualizarDatosMoto(Moto obj);
    public abstract int eliminarDatosVehiculo(String patente);
}
