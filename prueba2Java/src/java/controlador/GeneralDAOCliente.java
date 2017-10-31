/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author benja
 */
public interface GeneralDAOCliente {
    public abstract ArrayList mostrarDatos();
    public abstract Cliente buscarDatos(int rut, char dv) ;
    public abstract Cliente buscarDatosS(String rut, String dv) ;
    public Cliente buscarDatos(int rut);
    public abstract int agregarDatosPersona(Cliente cliente);
    public abstract int agregarDatosCliente(Cliente cliente);
    public abstract int eliminarDatosCliente(int rut);
    public abstract int eliminarDatosPersona(int rut, char dv);
    public abstract int actualizarDatosPersonaCliente(Cliente obj); 
}
