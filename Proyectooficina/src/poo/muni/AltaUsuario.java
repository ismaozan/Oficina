/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

import java.util.Date;

/**
 *
 * @author Capacitacion5
 */
public class AltaUsuario {
    String Nombre;
    String Apllido;
    String Usuario;
    String Mail;
    char Contraseña;
    char ConfirmarContraseña;
    Date fecha;
    

    public AltaUsuario() {
    }
    
    
    public AltaUsuario(String Nombre, String Apllido, String Usuario, String Mail, char Contraseña, char ConfirmarContraseña, Date fecha) {
        this.Nombre = Nombre;
        this.Apllido = Apllido;
        this.Usuario = Usuario;
        this.Mail = Mail;
        this.Contraseña = Contraseña;
        this.ConfirmarContraseña = ConfirmarContraseña;
        this.fecha = fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApllido() {
        return Apllido;
    }

    public void setApllido(String Apllido) {
        this.Apllido = Apllido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public char getContraseña() {
        return Contraseña;
    }

    public void setContraseña(char Contraseña) {
        this.Contraseña = Contraseña;
    }

    public char getConfirmarContraseña() {
        return ConfirmarContraseña;
    }

    public void setConfirmarContraseña(char ConfirmarContraseña) {
        this.ConfirmarContraseña = ConfirmarContraseña;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void registarse(){
        
    }
    public void iniciarsesion(){
        
    }
    public void cerrarsesion(){
        
    }
}
