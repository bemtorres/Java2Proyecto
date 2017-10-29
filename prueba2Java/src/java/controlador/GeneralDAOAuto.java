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
    public abstract boolean Agregar();
    public abstract Auto Buscar();
    public abstract boolean Modificar();
    public abstract ArrayList Listar();
}
