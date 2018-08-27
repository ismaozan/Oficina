/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.controller;
import org.hibernate.SessionFactory;
import poo.muni.Usuario;
import poo.muni.ui.AltaUsuario;
import poo.muni.dao.UsuarioDao;

/**
 *
 * @author Capacitacion6
 */

public class GestorDeEmpleo {
private UsuarioDao usuarioDao;

    public GestorDeEmpleo(SessionFactory sessionFactory) {
        this.usuarioDao = new UsuarioDao(sessionFactory);
    }
    
    
    public void run (){
        new AltaUsuario(this).setVisible(true);
    }
            
    public boolean GuardarUsuario(String nombre, String apellido, String nombreusuario, String email, String contraseña) {
       
       Usuario usuario=new Usuario(1,nombre, apellido, nombreusuario, email, contraseña,contraseña );
       
       return (usuarioDao.GuardarUsuario(usuario));
       
      
       
       
    }       
            
}


        
        