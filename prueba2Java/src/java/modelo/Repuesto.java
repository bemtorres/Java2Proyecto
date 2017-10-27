/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author carlos
 */
public class Repuesto {
    private int idRepuesto;
    private String nombreRepuesto;
    private int precio;
    private int cantidad;
    private int stock;
    private String tipoVehiculo;

    public Repuesto() {
    }

    public Repuesto(int idRepuesto, String nombreRepuesto, int precio, int cantidad, int stock, String tipoVehiculo) {
        this.idRepuesto = idRepuesto;
        this.nombreRepuesto = nombreRepuesto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.stock = stock;
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "Repuesto{" + "idRepuesto=" + idRepuesto + ", nombreRepuesto=" + nombreRepuesto + ", precio=" + precio + ", cantidad=" + cantidad + ", stock=" + stock + ", tipoVehiculo=" + tipoVehiculo + '}';
    }

    
    
    
    
}
