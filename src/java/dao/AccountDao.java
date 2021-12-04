/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author DELL VOSTRO
 */
public class AccountDao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public  Account login(String email, String password) {
         
        try {
            String query = "select *from account where email=? and password=?";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1,email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
              Account a = new Account(rs.getInt(1),
              rs.getString(2),
              rs.getString(3),
              rs.getString(4));
              return a;
            }
        } catch (Exception e) {
        }
        return null;  
    }
    public Account checkAccountExist(String email) {
        String query = "select * from account\n"
                + "where [email] = ?\n";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                         rs.getString(2),
                         rs.getString(3),
                         rs.getString(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void singup(String email, String password, String name) {
        String query = "insert into account\n"
                + "values(?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            ps.setString(3,name);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
}
