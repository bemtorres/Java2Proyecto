/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.FichaReparacion;

/**
 *
 * @author benja
 */
public interface GeneralDAORegistroTaller {
    public abstract ArrayList mostrarDatos();
    public abstract FichaReparacion buscarDatosPorPatente(String patente) ;
    public abstract FichaReparacion buscarDatosCompleto(String patente, int rut, char dv) ;
    public abstract int agregarDatos(FichaReparacion ficha);
    public abstract int eliminarDatos(String patente, int rut, char dv);
    public abstract int actualizarDatosFicha(FichaReparacion obj);
    public abstract FichaReparacion buscarDatosPorId(int id) ;
    
}
