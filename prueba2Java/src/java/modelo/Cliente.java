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

    public void setFechaAsociacion(String fechaAsociacion) {
        this.fechaAsociacion = fechaAsociacion;
    }

    public Cliente(String fechaAsociacion, int rut, char dv, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String direccion) {
        super(rut, dv, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, direccion);
        this.fechaAsociacion = fechaAsociacion;
    }

    public Cliente() {
    }

   
   
}
