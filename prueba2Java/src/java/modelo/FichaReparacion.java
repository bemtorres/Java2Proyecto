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
    private int rutPersona;
    private String patente;
    private int idEstadoFicha;
    private String fechaIngreso;
    private String fechaSalida;
    private String motivos;
    private String detalles;
    private int horasTrabajo;
    private int total;

    public FichaReparacion(int idFicha, int rutPersona, String patente, int idEstadoFicha, String fechaIngreso, String fechaSalida, String motivos, String detalles, int horasTrabajo, int total) {
        this.idFicha = idFicha;
        this.rutPersona = rutPersona;
        this.patente = patente;
        this.idEstadoFicha = idEstadoFicha;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.motivos = motivos;
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

    public int getRutPersona() {
        return rutPersona;
    }

    public void setRutPersona(int rutPersona) {
        this.rutPersona = rutPersona;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getIdEstadoFicha() {
        return idEstadoFicha;
    }

    public void setIdEstadoFicha(int idEstadoFicha) {
        this.idEstadoFicha = idEstadoFicha;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getMotivos() {
        return motivos;
    }

    public void setMotivos(String motivos) {
        this.motivos = motivos;
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
        return "FichaReparacion{" + "idFicha=" + idFicha + ", rutPersona=" + rutPersona + ", patente=" + patente + ", idEstadoFicha=" + idEstadoFicha + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", motivos=" + motivos + ", detalles=" + detalles + ", horasTrabajo=" + horasTrabajo + ", total=" + total + '}';
    }

    public FichaReparacion() {
    }

}
