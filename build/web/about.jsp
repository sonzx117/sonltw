<%-- 
    Document   : about
    Created on : Oct 29, 2021, 7:39:25 PM
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
    <link rel="stylesheet" href="assets/css/app.css" type="text/css">
</head>

<body>
    <!-- header -->
   <jsp:include page="Header.jsp"></jsp:include>
    <!-- end header -->

    <main role="main">
        <!-- Block content - Đục lỗ trên giao diện bố cục chung, đặt tên là `content` -->
        <div class="container mt-2">
            <h1 class="text-center">BALO-SSL - Nơi bạn có thể thoải mái mua sắm</h1>
            <div class="row">
                <div class="col col-md-12">
                    <h5 class="text-center">Cung cấp kiến thức balo, túi xách</h5>
                    <h5 class="text-center">Giúp các bạn có được kiến thức về mua hàng, cách phân biệt hàng fake.
                        Giúp bạn sở hữu những sản phẩm tốt nhât.
                    </h5>
                    <div class="text-center">
                        <a href="Home" class="btn btn-primary btn-lg">Bắt đầu mua sắm <i
                                class="fa fa-forward" aria-hidden="true"></i></a>
                    </div>
                </div>
            </div>
            <div class="row mt-2">
                <div class="col col-md-12">
                    <iframe
                        src="assets/img/slider/hinhweb.png"
                        width="100%" height="450" frameborder="0" style="border:0" allowfullscreen=""></iframe>
                </div>
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
