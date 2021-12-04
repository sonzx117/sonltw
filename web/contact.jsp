<%-- 
    Document   : contact
    Created on : Oct 29, 2021, 7:40:07 PM
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
            <h1 class="text-center">Liên hệ với BALO-SSL</h1>
            <div class="row">
                <div class="col col-md-6">
                    <img src="assets/img/marketing/marketing-1.png">
                </div>
                <div class="col col-md-6">
                    <form method="post" action="#">
                        <div class="form-group">
                            <label for="email">Email của bạn</label>
                            <input type="email" class="form-control" id="email" name="email"
                                placeholder="Email của bạn">
                        </div>
                        <div class="form-group">
                            <label for="title">Tiêu đề của bạn</label>
                            <input type="text" class="form-control" id="title" name="title"
                                placeholder="Tiêu đề của bạn">
                        </div>
                        <div class="form-group">
                            <label for="message">Lời nhắn của bạn</label>
                            <textarea name="message" class="form-control"></textarea>
                        </div>
                        <button class="btn btn-primary" onclick="testAlertDialog()">Gởi lời nhắn</button>
                    </form>
                </div>
            </div>
            <div class="row mt-2">
                <div class="col col-md-12">
                    <iframe
                        src="assets/img/slider/BANNER-BALO-4.jpg"
                        width="100%" height="490" frameborder="0" style="border:0" allowfullscreen=""></iframe>
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
    <script src="assets/js/hopthoai.js"></script>

</body>

</html>
