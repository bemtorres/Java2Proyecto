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
public class Moto extends Vehiculo{
    private String tipomoto;
    
    public Moto(String tipomoto, int rutCliente, String marca, int rut, String foto, int anyo, int kilometraje, String tipo_bencina) {
        super(rutCliente, marca, rut, foto, anyo, kilometraje, tipo_bencina);
        this.tipomoto = tipomoto;
    }

    public Moto(String tipomoto) {
        this.tipomoto = tipomoto;
    }
        

    public String getTipomoto() {
        return tipomoto;
    }

    public void setTipomoto(String tipomoto) {
        this.tipomoto = tipomoto;
    }

    @Override
    public String toString() {
        return "Moto{" + "tipomoto=" + tipomoto + '}';
    }


    
    
    
}
