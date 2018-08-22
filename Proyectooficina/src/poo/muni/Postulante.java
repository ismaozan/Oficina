/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;



/**
 *
 * @author Capacitacion6
 */
public class Postulante extends Persona{
  
    NivelEducativo nivelEducativo;
    Programa programa ;
    Perfil perfil ;
    String apellido;
    int dni;
    int edad;
    String sexo;
    String movilidad;
    String documentacionAdicional;
    String disponibilidadHoraria;

    public Postulante() {
    }

    public Postulante(NivelEducativo nivelEducativo, Programa programa, Perfil perfil, String apellido, int dni, int edad, String sexo, String movilidad, String documentacionAdicional, String disponibilidadHoraria, String nombre, String cuil_cuit, String domicilio, int telefono, String email) {
        super(nombre, cuil_cuit, domicilio, telefono, email);
        this.nivelEducativo = nivelEducativo;
        this.programa = programa;
        this.perfil = perfil;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
        this.movilidad = movilidad;
        this.documentacionAdicional = documentacionAdicional;
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public NivelEducativo getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(NivelEducativo nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }

    public String getDocumentacionAdicional() {
        return documentacionAdicional;
    }

    public void setDocumentacionAdicional(String documentacionAdicional) {
        this.documentacionAdicional = documentacionAdicional;
    }

    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }

    public void setDisponibilidadHoraria(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

   
    
}
