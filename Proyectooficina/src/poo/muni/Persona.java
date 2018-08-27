/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

 
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Capacitacion6
 */
@Entity
@Table(name = "persona")
public abstract class Persona {
    
    @Id
    @GeneratedValue
    @Column(name = "nombre")
    String nombre;
    @Column(name = "cuil_cuit")
    String cuil_cuit;
    @Column(name = "domicilio")
    String domicilio;
    @Column(name = "telefono")
    int telefono;
    @Column(name = "email")
    String email;

    public Persona() {
    }

    public Persona(String nombre, String cuil_cuit, String domicilio, int telefono, String email) {
        this.nombre = nombre;
        this.cuil_cuit = cuil_cuit;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
    }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuil_cuit() {
        return cuil_cuit;
    }

    public void setCuilcuit(String cuil_cuit) {
        this.cuil_cuit = cuil_cuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void agregar(){
        
    }
    public void modificar (){
        
    }
    public void eliminar(){
        
    }
            
}
