/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Empleado;

/**
 *
 * @author benja
 */
public interface GeneralDAOEmpleado {
    public abstract ArrayList mostrarDatos();
    public abstract boolean verificarDatos(String usuario, String password);
    public abstract Empleado buscarDatos(int Rut) ;
    public abstract  int actualizarDatos(Empleado obj);
    public abstract Empleado buscarDatos(String usuario) ;
}
