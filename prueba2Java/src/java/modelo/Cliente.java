/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author carlos
 */
public class Cliente extends Persona{

   
   
    private String fechaAsociacion;

    public String getFechaAsociacion() {
        return fechaAsociacion;
    }
   
    public Cliente(String fechaAsociacion, int rut, char dv, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String direccion, String comuna, int telefono, String email) {
        super(rut, dv, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, direccion, comuna, telefono, email);
        this.fechaAsociacion = fechaAsociacion;
    }
    public void setFechaAsociacion(String fechaAsociacion) {
        this.fechaAsociacion = fechaAsociacion;
    }


    public Cliente() {
    }

    @Override
    public String toString() {
        return super.toString()+" Cliente{" + "fechaAsociacion=" + fechaAsociacion + '}';
    }

   
}
