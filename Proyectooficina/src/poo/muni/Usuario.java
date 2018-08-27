/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;



import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Capacitacion5
 */
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name = "id_usuario")
    int id;
    @Column(name = "nombre")        
    String nombre;
    @Column(name = "apellido")
    String apellido;
    @Column(name = "nombreUsuario")
    String nombreusuario;
    @Column(name = "email")
    String email;
    @Column(name = "contraseña")
    String contraseña;
    @Column(name = "confirmarContraseña")
    String confirmarContraseña;
    @Column(name = "fecha")
    Date fecha;
    

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String nombreUsuario, String email, String contraseña, String confirmarContraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreusuario = nombreUsuario;
        this.email = email;
        this.contraseña = contraseña;
        this.confirmarContraseña = confirmarContraseña;
        fecha = new Date();
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreUsuario() {
        return nombreusuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreusuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getConfirmarContraseña() {
        return confirmarContraseña;
    }

    public void setConfirmarContraseña(String confirmarContraseña) {
        this.confirmarContraseña = confirmarContraseña;
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
