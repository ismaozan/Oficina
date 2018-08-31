/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
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

     private final SessionFactory sessionFactory;
     private final Connection connection;

    public UsuarioDao(SessionFactory sessionFactory,Connection connection) {
        this.sessionFactory = sessionFactory;
        this.connection=connection;
    }

   
    
   

    public boolean GuardarUsuario(Usuario usuario) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(usuario);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;

        } finally {
            session.close();
        }
    }

    public boolean isUsuarioExistente(String nombreUsuario) {
        String lastName = "";
        try {
            
            Statement stmt = connection.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT nombreUsuario FROM usuario WHERE nombreUsuario = '" + nombreUsuario + "'");
            while (rs.next()) {
                lastName = rs.getString("nombreUsuario");
                if (lastName.equals(nombreUsuario));{
                return false;
            }
        }
        connection.close();
    }
    catch (Exception e ) {
    System.err.print("Got an exception!");
        System.err.print(e.getMessage());

    }

return true;
        }
    }

