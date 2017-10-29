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
public abstract class Vehiculo {

   
   
    private String marca;
    private int rut;
    private String foto;
    private int anyo;
    private int kilometraje;
    private String tipo_bencina;
    
    public Vehiculo( String marca, int rut, String foto, int anyo, int kilometraje, String tipo_bencina) {
       
        this.marca = marca;
        this.rut = rut;
        this.foto = foto;
        this.anyo = anyo;
        this.kilometraje = kilometraje;
        this.tipo_bencina = tipo_bencina;
    }

    public Vehiculo() {
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "rutCliente=" +  ", marca=" + marca + ", rut=" + rut + ", foto=" + foto + ", anyo=" + anyo + ", kilometraje=" + kilometraje + ", tipo_bencina=" + tipo_bencina + '}';
    }

  

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTipo_bencina() {
        return tipo_bencina;
    }

    public void setTipo_bencina(String tipo_bencina) {
        this.tipo_bencina = tipo_bencina;
    }


    
   
}
