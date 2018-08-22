/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

import java.util.Date;

/**
 *
 * @author Capacitacion6
 */
public class Empresa extends Persona {
    
    TipoActividad tipoactividad;
    String razonSocial;
    String representanteLegal;
    String cantidadTrabajadores;
    String sede;
    Date fecha;
    int contacto;

    public Empresa(TipoActividad tipoactividad, String razonSocial, String representanteLegal, String cantidadTrabajadores, String sede, Date fecha, int contacto, String nombre, String cuil_cuit, String domicilio, int telefono, String email) {
        super(nombre, cuil_cuit, domicilio, telefono, email);
        this.tipoactividad = tipoactividad;
        this.razonSocial = razonSocial;
        this.representanteLegal = representanteLegal;
        this.cantidadTrabajadores = cantidadTrabajadores;
        this.sede = sede;
        this.fecha = fecha;
        this.contacto = contacto;
    }

    
    public TipoActividad getTipoactividad() {
        return tipoactividad;
    }

    public void setTipoactividad(TipoActividad tipoactividad) {
        this.tipoactividad = tipoactividad;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public void setCantidadTrabajadores(String cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }
    
    
    
}
