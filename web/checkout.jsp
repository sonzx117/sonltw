<%-- 
    Document   : checkout
    Created on : Oct 29, 2021, 7:39:50 PM
    Author     : DELL VOSTRO
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi" class="h-100">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Shop BALO-SSL | Bảng tin</title>

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css" type="text/css">
        <!-- Font awesome -->
        <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css" type="text/css">

        <!-- Custom css - Các file css do chúng ta tự viết -->
        <!--<link rel="stylesheet" href="assets/css/app.css" type="text/css">-->
        <link rel="stylesheet" href="assets/css/app.css" type="text/css">
    </head>

    <body>
        <!-- header -->
        <jsp:include page="Header.jsp"></jsp:include>
            <!-- end header -->

            <main role="main">
                <!-- Block content - Đục lỗ trên giao diện bố cục chung, đặt tên là `content` -->
                <div class="container mt-4">
                    
                    <div class="py-5 text-center">
                        <i class="fa fa-credit-card fa-4x" aria-hidden="true"></i>
                        <h2>Thanh toán</h2>
                        <p class="lead">Vui lòng kiểm tra thông tin Khách hàng, thông tin Giỏ hàng trước khi Đặt hàng.</p>
                    </div>
                    <div class="row">
                        <div class="col-md-4 order-md-2 mb-4">
                        
                            <h4 class="d-flex justify-content-between align-items-center mb-3">
                                <span class="text-muted">Giỏ hàng</span>
                                <span class="badge badge-secondary badge-pill"></span>
                            </h4>
                            <c:forEach items="${carts}" var="o">
                                <ul class="list-group mb-3">

                                    <li class="list-group-item d-flex justify-content-between lh-condensed">
                                        <div>
                                            <h6 class="my-0">${o.value.product.getName()}</h6>
                                            <small class="text-muted">${o.value.quantity}</small>
                                        </div>
                                        <span class="text-muted"> $ ${o.value.product.price * o.value.quantity}</span>
                                    </li>

                                </ul>
                            </c:forEach>
                            <!--tong tien-->
                            <li class="list-group-item d-flex justify-content-between">
                                <span>Tổng thành tiền</span>
                                <strong> $ ${totalMoney}</strong>
                            </li>
                            </ul>

                        </div>
                        <form action="checkout" method="post">
                            <div class="col-md-8 order-md-1">
                                <h4 class="mb-3">Thông tin khách hàng</h4>

                                <div class="row">
                                    <div class="col-md-12">
                                        <label for="kh_ten">Họ tên</label>
                                        <input type="text" class="form-control" name="name" id="kh_ten"
                                               value="" >
                                    </div>
                                    <div class="col-md-12">
                                        <label for="kh_diachi">Địa chỉ</label>
                                        <input type="text" class="form-control" name="address" id="kh_diachi"
                                               value="" >
                                    </div>
                                    <div class="col-md-12">
                                        <label for="kh_dienthoai">Điện thoại</label>
                                        <input type="text" class="form-control" name="phone" id="kh_dienthoai"
                                               value="" >
                                    </div>
                                    <div class="col-md-12">
                                        <label for="kh_email">Email</label>
                                        <input type="text" class="form-control" name="email" id="kh_email"
                                               value="">
                                    </div>
                                </div>
                                <hr class="mb-4">
                                <button class="btn btn-primary btn-lg btn-block" type="submit" name="btnDatHang">Đặt
                                    hàng</button>
                            </div>                      
                        </form>
                    </div>

                </div>
                <!-- End block content -->
            </main>

            <!-- footer -->
            <footer class="footer mt-auto py-3">

            </footer>
            <!-- end footer -->

            <!-- Optional JavaScript -->
            <!-- jQuery first, then Popper.js, then Bootstrap JS -->
            <script src="vendor/jquery/jquery.min.js"></script>
            <script src="vendor/popperjs/popper.min.js"></script>
            <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

            <!-- Custom script - Các file js do mình tự viết -->
            <script src="assets/js/app.js"></script>

        </body>

    </html>