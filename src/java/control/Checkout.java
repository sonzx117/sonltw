/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.OderDao;
import entity.Cart;
import entity.Order;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL VOSTRO
 */
public class Checkout extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Map<Integer, Cart> carts = (Map<Integer, Cart>) session.getAttribute("carts");
        if (carts == null) {
            carts = new LinkedHashMap<>();
        }
        
        //tính tổng tiền
        double totalMoney = 0;
        
        for (Map.Entry<Integer, Cart> entry : carts.entrySet()) {
            Integer productId = entry.getKey();
            Cart cart = entry.getValue();
            totalMoney += cart.getQuantity() * cart.getProduct().getPrice();
        }
//        totalMoney=Double.parseDouble(request.getParameter("tong"));
        System.out.println("totalMoney:"+totalMoney);
        request.setAttribute("carts", carts);
        request.setAttribute("totalMoney", totalMoney);
        request.getRequestDispatcher("checkout.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Map<Integer, Cart> carts = (Map<Integer, Cart>) session.getAttribute("carts");
        if (carts == null) {
            carts = new LinkedHashMap<>();
        }
        //tính tổng tiền
        double totalMoney = 0;
        int count=0;
        for (Map.Entry<Integer, Cart> entry : carts.entrySet()) {
            Integer productId = entry.getKey();
            Cart cart = entry.getValue();
            count++;
            totalMoney += cart.getQuantity() * cart.getProduct().getPrice();
        }
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String email=request.getParameter("email");
        OderDao dao=new OderDao();
        int id=dao.getLastOrderID();
        id++;
        Order order=new Order(id, name, phone, email, name, count);
        if(dao.insertOrder(order)==1){
            boolean checkOrderDetail = dao.insertOrderDetail(carts, id);
            System.out.println("DAT HANG THANH CONG");
        }else
        {
            System.out.println("DAT HANG KHONG THANH CONG");
        }
//        boolean checkOrderDetail = new OrderDetailDAO().insert(carts, orderId);
        
        session.removeAttribute("carts");
        response.sendRedirect("Home");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
