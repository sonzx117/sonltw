<%-- 
    Document   : Menu
    Created on : Dec 2, 2021, 12:27:12 PM
    Author     : DELL VOSTRO
--%>
<%@page import="context.DBContext" %>
<%@page import="entity.Account"%>
<%@page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
	<%
	Account auth = (Account) request.getSession().getAttribute("auth");
	if (auth != null) {
		response.sendRedirect("Home.jsp");
	}
	%>
<!-- header -->
<nav class="navbar navbar-expand-md navbar-dark sticky-top bg-dark">
    <div class="container">
        <a class="navbar-brand" href="Home">BALO-SSL</a>
        <div class="navbar-collapse collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="Home">Trang chủ <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Quản trị</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Product">Sản phẩm</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="about.jsp">Giới thiệu</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="contact.jsp">Liên hệ</a>
                </li>
            </ul>
            <form class="form-inline mt-2 mt-md-0" method="get" action="Product">
                <input class="form-control mr-sm-2" type="text" placeholder="Tìm kiếm" aria-label="Search"
                       name="keyword_tensanpham">
                <button class="btn btn-outline-success my-2 my-sm-0"  type="submit" >Tìm kiếm</button>
            </form>
        </div>
        <ul class="navbar-nav px-3">
            <li class="nav-item">
                <a class="nav-link" href="cart">Cart <span class="badge badge-danger">${carts.size()}</span> </a></li>           
            <%        
                if (auth != null) {
            %>
            <li class="nav-item">
                <a class="nav-link" href="Logout">Logout</a></li>
            <%
            } else {
            %>
            <li class="nav-item">
                <a class="nav-link" href="login">Login</a></li>
            <%
            }
            %>

        </ul>
    </div>
</nav>
<!-- header -->