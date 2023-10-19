/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionBuilder;
import model.Login;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author NC
 */
public class LoginDAO {

    public void SaveUser(Login login) {
//        System.out.println("--------------------------------");
//        System.out.println(login.getEmployee());
//        System.out.println(login.getUsername());
//        System.out.println(login.getPassword());
//        System.out.println(login.getIsactive());
        Session session = null;
        Transaction tr = null;
        try {
            session = ConnectionBuilder.hibSession();
            tr = session.beginTransaction();
            session.save(login);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
    }

}
