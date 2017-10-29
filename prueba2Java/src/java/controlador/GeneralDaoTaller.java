/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Auto;
import modelo.Moto;

/**
 *
 * @author benja
 */
public interface GeneralDaoTaller {
    public abstract Auto buscarDatosAuto(String patente,int rut,char dv) ;
    public abstract Moto buscarDatosMoto(String patente,int rut, char dv) ;
     public abstract Auto buscarDatosAuto(String patente) ;
    public abstract Moto buscarDatosMoto(String patente) ;
}
