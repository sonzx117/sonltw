/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author DELL VOSTRO
 */
public class ProductDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
 
    public Product getOne(int id) {
        
        String query = "select * from product where id= ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while (rs.next()) {
              Product s = new Product();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setCatalog_name(rs.getString("catalog_name"));
                s.setPrice(rs.getFloat("price"));
                s.setTitle(rs.getString("title"));
                s.setDescription(rs.getString("description"));
                s.setImage(rs.getString("image"));
                s.setAmount(rs.getInt("amount"));
                return s;
            }
        } catch (Exception e) {
            System.out.println("Co loi o day");
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static void main(String[] args) {
        ProductDAO dao=new ProductDAO();
        Product p= dao.getOne(1);
        System.out.println(p);
    }
}
