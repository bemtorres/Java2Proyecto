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
public interface MotoDAO {
    public abstract boolean Agregar();
    public abstract Moto Buscar();
    public abstract boolean Modificar();
    public abstract ArrayList Listar();
}
