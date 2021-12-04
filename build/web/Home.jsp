<%-- 
    Document   : index
    Created on : Dec 1, 2021, 4:07:37 PM
    Author     : DELL VOSTRO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="vi" class="h-100">
    <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Shop BALO-SSL </title>

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
        <!-- Carousel - Slider -->
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1" class=""></li>
                <li data-target="#myCarousel" data-slide-to="2" class=""></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="assets/img/slider/slideshow1.jpg">
                    <div class="container">
                        <div class="carousel-caption text-left">
                            <h1>BALO-SSL - Nơi mua sắm tuyệt vời</h1>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="assets/img/slider/slide-4.jpg">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Hàng triệu sản phẩm - Lựa chọn mỏi tay</h1>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="assets/img/slider/slide-5.jpg">
                    <div class="container">
                        <div class="carousel-caption text-right">
                            <h1>Chất lượng là Hàng đầu.</h1>
                        </div>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>

        <!-- Tính năng Marketing -->
        <div class="container marketing">
            <!-- Three columns of text below the carousel -->
            <div class="row">
                <div class="col-lg-4">
                    <img class="bd-placeholder-img rounded-circle" width="140" height="140"
                        src="assets/img/icon/icon-1.png">
                    <h2>Đặt hàng</h2>
                    <p>Chọn sản phẩm bạn yêu thích, và Đặt hàng.</p>
                </div><!-- /.col-lg-4 -->
                <div class="col-lg-4">
                    <img class="bd-placeholder-img rounded-circle" width="140" height="140"
                        src="assets/img/icon/icon-2.png">
                    <h2>Tạo đơn hàng</h2>
                    <p>Theo dõi đơn hàng của bạn.</p>
                </div><!-- /.col-lg-4 -->
                <div class="col-lg-4">
                    <img class="bd-placeholder-img rounded-circle" width="140" height="140"
                        src="assets/img/icon/icon-3.png">
                    <h2>Giao hàng</h2>
                    <p>Giao hàng tận nơi.</p>
                </div><!-- /.col-lg-4 -->
            </div><!-- /.row -->
        </div>
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1" class=""></li>
                <li data-target="#myCarousel" data-slide-to="2" class=""></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="assets/img/slider/slide1.jpg">
                    <div class="container">
                        <div class="carousel-caption text-left">
                            <h1>BALO-SSL - Nơi mua sắm tuyệt vời</h1>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="assets/img/slider/slide2.jpg">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Hàng triệu sản phẩm - Lựa chọn mỏi tay</h1>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="assets/img/slider/slide3.jpg">
                    <div class="container">
                        <div class="carousel-caption text-right">
                            <h1>Chất lượng là Hàng đầu.</h1>
                        </div>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>

        <!-- Danh sách sản phẩm -->
        <section class="jumbotron text-center">
            <div class="container">
                <h1 class="jumbotron-heading">Danh sách Sản phẩm</h1>
                <p class="lead text-muted">Các sản phẩm với chất lượng, uy tín, cam kết từ nhà Sản xuất, phân phối và
                    bảo hành
                    chính hãng.</p>
            </div>
        </section>
        
        <!-- Giải thuật duyệt và render Danh sách sản phẩm theo dòng, cột của Bootstrap -->
        <div class="danhsachsanpham py-5 bg-light">
            <div class="container">
                <div class="row">
                    <c:forEach items="${listp}" var="o">
                        <div class="product col-12 col-md-6 col-lg-4">
                                <div class="card">
                                    <img class="card-img-top" src="${o.image}" alt="Card image cap">
                                    <div class="card-body">
                                        <h4 class="card-title show_txt"><a href="detail?pid=${o.id}" title="View Product">${o.name}</a></h4>
                                        <h4 class="card-text show_txt">${o.catalog_name}</h4>
                                        <p class="card-text show_txt">${o.title}</p>
                                        <div class="row">
                                            <div class="col">
                                                <p class="btn btn-danger btn-block">${o.price} $</p>
                                            </div>
                                            <div class="col">
                                                <a href="add-to-cart?productId=${o.id}" class="btn btn-success ">Add to cart</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach> 
                </div>
            </div>
        </div>

        <!-- End block content -->
    </main>
    <!-- footer -->
     <jsp:include page="Footer.jsp"></jsp:include>
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
