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
    private Date fechaAsociacion;

    public Cliente() {
    }

    public Cliente(Date fechaAsociacion, int rut, char dv, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String direccion) {
        super(rut, dv, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, direccion);
        this.fechaAsociacion = fechaAsociacion;
    }
    public Date getFechaAsociacion() {
        return fechaAsociacion;
    }

    public void setFechaAsociacion(Date fechaAsociacion) {
        this.fechaAsociacion = fechaAsociacion;
    }
   
}
