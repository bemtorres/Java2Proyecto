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
public class DetalleFichaRepuesto {
    private FichaReparacion idFicha;
    private Repuesto idRespuesto;
    private int cantidad;
    private int total;

    public DetalleFichaRepuesto() {
    }

    public DetalleFichaRepuesto(FichaReparacion idFicha, Repuesto idRespuesto, int cantidad, int total) {
        this.idFicha = idFicha;
        this.idRespuesto = idRespuesto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public FichaReparacion getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(FichaReparacion idFicha) {
        this.idFicha = idFicha;
    }

    public Repuesto getIdRespuesto() {
        return idRespuesto;
    }

    public void setIdRespuesto(Repuesto idRespuesto) {
        this.idRespuesto = idRespuesto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "DetalleFichaRepuesto{" + "idFicha=" + idFicha + ", idRespuesto=" + idRespuesto + ", cantidad=" + cantidad + ", total=" + total + '}';
    }
    
    
}
