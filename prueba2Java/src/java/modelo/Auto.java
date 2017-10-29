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
public class Auto extends Vehiculo {

    private int cantPuertas;
    private int cantAsientos;
    private String tipoAuto;
    private int cantAirbags;
    private String cambiosAutomaticos;
    private String electrico;
    private String direccionAsistida;
    private String portaEquipaje;

    public Auto() {
    }

    public Auto(int cantPuertas, int cantAsientos, String tipoAuto, int cantAirbags, String cambiosAutomaticos, String electrico, String direccionAsistida, String portaEquipaje, String patente, String marca, int rut, String foto, int anyo, int kilometraje, String tipo_bencina) {
        super(patente, marca, rut, foto, anyo, kilometraje, tipo_bencina);
        this.cantPuertas = cantPuertas;
        this.cantAsientos = cantAsientos;
        this.tipoAuto = tipoAuto;
        this.cantAirbags = cantAirbags;
        this.cambiosAutomaticos = cambiosAutomaticos;
        this.electrico = electrico;
        this.direccionAsistida = direccionAsistida;
        this.portaEquipaje = portaEquipaje;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public int getCantAirbags() {
        return cantAirbags;
    }

    public void setCantAirbags(int cantAirbags) {
        this.cantAirbags = cantAirbags;
    }

    public String getCambiosAutomaticos() {
        return cambiosAutomaticos;
    }

    public void setCambiosAutomaticos(String cambiosAutomaticos) {
        this.cambiosAutomaticos = cambiosAutomaticos;
    }

    public String getElectrico() {
        return electrico;
    }

    public void setElectrico(String electrico) {
        this.electrico = electrico;
    }

    public String getDireccionAsistida() {
        return direccionAsistida;
    }

    public void setDireccionAsistida(String direccionAsistida) {
        this.direccionAsistida = direccionAsistida;
    }

    public String getPortaEquipaje() {
        return portaEquipaje;
    }

    public void setPortaEquipaje(String portaEquipaje) {
        this.portaEquipaje = portaEquipaje;
    }

    @Override
    public String toString() {
        return super.toString()+" Auto{" + "cantPuertas=" + cantPuertas + ", cantAsientos=" + cantAsientos + ", tipoAuto=" + tipoAuto + ", cantAirbags=" + cantAirbags + ", cambiosAutomaticos=" + cambiosAutomaticos + ", electrico=" + electrico + ", direccionAsistida=" + direccionAsistida + ", portaEquipaje=" + portaEquipaje + '}';
    }

}
