/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import poo.muni.Usuario;

/**
 *
 * @author Capacitacion6
 */
public class UsuarioDao {
    
    private static SessionFactory sessionFactory;
    
    public UsuarioDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
        
    }
    
    public boolean GuardarUsuario(Usuario usuario){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        
        try {
                tx = session.beginTransaction();
                session.save(usuario);
                tx.commit();
                return true;
        }
        catch    (HibernateException e)
        {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
            return false;
                
        }
        finally
        {
            session.close();
        }
        
        
    }
}

