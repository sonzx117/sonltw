/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
//import entity.Category;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trinh
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
 
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from product";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               list.add(new Product(rs.getInt(1),
               rs.getString(2),
               rs.getString(3), 
               rs.getFloat(4),
               rs.getString(5),
               rs.getString(6),
               rs.getString(7),
               rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
//   public static void main(String[] args) {
//        DAO dao = new DAO();
//        List<Product> list= dao.getAllProduct();
//        for (Product o : list) {
//            System.out.println(o);
//        }
//   }
   
}
