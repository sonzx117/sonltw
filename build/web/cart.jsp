<%-- 
    Document   : cart
    Created on : Oct 29, 2021, 7:39:38 PM
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
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css" type="text/css">
        <!-- Font awesome -->
        <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css" type="text/css">

        <!-- Custom css - Các file css do chúng ta tự viết -->
        <link rel="stylesheet" href="assets/css/app.css" type="text/css">
    </head>

    <body>
        <!-- header -->
        <jsp:include page="Header.jsp"></jsp:include>
            <!-- end header -->
            <main role="main">
                <!-- Block content - Đục lỗ trên giao diện bố cục chung, đặt tên là `content` -->
                <div class="container mt-4">
                    <div id="thongbao" class="alert alert-danger d-none face" role="alert">
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>

                    <h1 class="text-center">Giỏ hàng</h1>
                <c:choose>
                    <c:when test="${sessionScope.carts==null}"><h1>KHÔNG CÓ SẢN PHẨM NÀO</h1></c:when>
                    <c:otherwise>
                        <div class="row">
                            <div class="col col-md-12">
                                <table class="table table-bordered">
                                    <thead>
                                        <tr>
                                            <th>STT</th>
                                            <th>Ảnh đại diện</th>
                                            <th>Tên sản phẩm</th>
                                            <th>Số lượng</th>
                                            <th>Đơn giá</th>
                                            <th>Thành tiền</th>
                                            <th>Hành động</th>
                                        </tr>
                                    </thead>
                                    <tbody id="datarow">
                                        <c:forEach items="${carts}" var="o">
                                            <tr>
                                                <td>${o.value.product.id}</td>
                                                <td>
                                                    <img src="${o.value.product.getImage()}" width="100" class="hinhdaidien" >
                                                </td>
                                                <td>${o.value.product.getName()}</td>
                                                <td class="text-right">${o.value.quantity}</td>
                                                <td class="text-right">${o.value.product.price}</td>
                                                <td class="text-right">${o.value.product.price * o.value.quantity}</td>
                                                <td>
                                                    <!-- Nút xóa, bấm vào sẽ xóa thông tin dựa vào khóa chính `sp_ma` -->
                                                    <a href="remove?productId=${o.value.product.id}" class="btn btn-danger btn-delete-sanpham">
                                                        <i class="fa fa-trash" aria-hidden="false"></i> Xóa
                                                    </a>
                                                </td>
                                            </tr>
                                        </c:forEach>

                                    </tbody>
                                </table>
                                <a href="Home" class="btn btn-warning btn-md"><i class="fa fa-arrow-left"
                                                                                        aria-hidden="true"></i>&nbsp;Quay
                                    về trang chủ</a>
                                <a href="checkout" class="btn btn-primary btn-md"><i
                                        class="fa fa-shopping-cart" aria-hidden="true"></i>&nbsp;Thanh toán</a>
                            </div>
                        </div>
                    </c:otherwise>
                </c:choose>
            </div>
            <!-- End block content -->
        </main>

        <!-- footer -->
       
        <!-- end footer -->

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/popperjs/popper.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <!-- Custom script - Các file js do mình tự viết -->
        <script src="assets/js/app.js"></script>

    </body>

</html>