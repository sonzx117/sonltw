/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Cart;
import entity.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

/**
 *
 * @author DELL VOSTRO
 */
public class OderDao {

    public OderDao() {
    }

    public int getLastOrderID() {
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "Select MAX(id) from [Cart]";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public int insertOrder(Order order) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "INSERT INTO [dbo].[Cart]\n"
                    + "           ([id]\n"
                    + "           ,[Customer_name]\n"
                    + "           ,[phone]\n"
                    + "           ,[email]\n"
                    + "           ,[address]\n"
                    + "           ,[amount])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, order.getid());
            ps.setString(2, order.getCustomer());
            ps.setString(3, order.getPhone());
            ps.setString(4, order.getEmail());
            ps.setString(5, order.getAdd());
            ps.setInt(6, order.getAmount());
            ps.executeUpdate();
            return 1;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public boolean insertOrderDetail(Map<Integer, Cart> cartMap, int orderId) {
        int numRow = 0;
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "INSERT INTO [dbo].[Cart_detail]\n"
                    + "           ([id]\n"
                    + "           ,[product_id]\n"
                    + "           ,[quantity])\n"
                    + "     VALUES\n"
                    + "           (?,?,?)";
            int[] a = {};
            PreparedStatement ps = conn.prepareStatement(sql);
            for (Map.Entry<Integer, Cart> entry : cartMap.entrySet()) {
                Integer productId = entry.getKey();
                Cart cart = entry.getValue();
                ps.setInt(1, orderId);
                ps.setInt(2, cart.getProduct().getId());
                ps.setInt(3, cart.getQuantity());
                ps.addBatch();
            }
            a = ps.executeBatch();
            numRow = a.length;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return numRow > 0;
    }
}
