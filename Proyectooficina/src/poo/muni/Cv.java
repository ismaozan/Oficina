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
public class Cv {
    String experienciaLaboral;
    String Cursos;
    Postulante postulante;

    public Cv() {
    }

    public Cv(String experienciaLaboral, String Cursos, Postulante postulante) {
        this.experienciaLaboral = experienciaLaboral;
        this.Cursos = Cursos;
        this.postulante = postulante;
    }

    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public String getCursos() {
        return Cursos;
    }

    public void setCursos(String Cursos) {
        this.Cursos = Cursos;
    }

    public Postulante getPostulante() {
        return postulante;
    }

    public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }
    
    
    
}
