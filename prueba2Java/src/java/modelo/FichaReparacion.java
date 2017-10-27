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
public class FichaReparacion {
    private int idFicha;
    private Empleado rutPersona;
    private Vehiculo patente;
    private EstadoFicha idEstado;
    private Date fechaIngreso;
    private Date fechaSalida;
    private String detalles;
    private int horasTrabajo;
    private int total;

    public FichaReparacion() {
    }

    public FichaReparacion(int idFicha, Empleado rutPersona, Vehiculo patente, EstadoFicha idEstado, Date fechaIngreso, Date fechaSalida, String detalles, int horasTrabajo, int total) {
        this.idFicha = idFicha;
        this.rutPersona = rutPersona;
        this.patente = patente;
        this.idEstado = idEstado;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.detalles = detalles;
        this.horasTrabajo = horasTrabajo;
        this.total = total;
    }

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }

    public Empleado getRutPersona() {
        return rutPersona;
    }

    public void setRutPersona(Empleado rutPersona) {
        this.rutPersona = rutPersona;
    }

    public Vehiculo getPatente() {
        return patente;
    }

    public void setPatente(Vehiculo patente) {
        this.patente = patente;
    }

    public EstadoFicha getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(EstadoFicha idEstado) {
        this.idEstado = idEstado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "fichaReparacion{" + "idFicha=" + idFicha + ", rutPersona=" + rutPersona + ", patente=" + patente + ", idEstado=" + idEstado + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", detalles=" + detalles + ", horasTrabajo=" + horasTrabajo + ", total=" + total + '}';
    }
    
    
}
