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
public class EstadoFicha {
    private int idEstadoFicha;
    private String nombreEstadoFicha;

    public EstadoFicha() {
    }

    public EstadoFicha(int idEstadoFicha, String nombreEstadoFicha) {
        this.idEstadoFicha = idEstadoFicha;
        this.nombreEstadoFicha = nombreEstadoFicha;
    }

    public int getIdEstadoFicha() {
        return idEstadoFicha;
    }

    public void setIdEstadoFicha(int idEstadoFicha) {
        this.idEstadoFicha = idEstadoFicha;
    }

    public String getNombreEstadoFicha() {
        return nombreEstadoFicha;
    }

    public void setNombreEstadoFicha(String nombreEstadoFicha) {
        this.nombreEstadoFicha = nombreEstadoFicha;
    }

    @Override
    public String toString() {
        return "EstadoFicha{" + "idEstadoFicha=" + idEstadoFicha + ", nombreEstadoFicha=" + nombreEstadoFicha + '}';
    }
    
    
}
