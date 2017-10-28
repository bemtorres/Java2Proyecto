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
public class Empleado extends Persona{

  
    
    private Date fechaContrato;
    private String usuario;
    private String clave;
    private int horaTrabajo;
    private int valorHora;
    private int sueldo;
    
    public Empleado(Date fechaContrato, String usuario, String clave, int horaTrabajo, int valorHora, int sueldo, int rut, char dv, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String direccion, String comuna, int telefono, String email) {
        super(rut, dv, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, direccion, comuna, telefono, email);
        this.fechaContrato = fechaContrato;
        this.usuario = usuario;
        this.clave = clave;
        this.horaTrabajo = horaTrabajo;
        this.valorHora = valorHora;
        this.sueldo = sueldo;
    }
    public Empleado() {
    }
  
    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getHoraTrabajo() {
        return horaTrabajo;
    }

    public void setHoraTrabajo(int horaTrabajo) {
        this.horaTrabajo = horaTrabajo;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+" Empleado{" + "fechaContrato=" + fechaContrato + ", usuario=" + usuario + ", clave=" + clave + ", horaTrabajo=" + horaTrabajo + ", valorHora=" + valorHora + ", sueldo=" + sueldo + '}';
    }

    
    
    
}
