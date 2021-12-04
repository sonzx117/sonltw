package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"vi\" class=\"h-100\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>Shop BALO-SSL | Bảng tin</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("    <!-- Font awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/font-awesome/css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- Custom css - Các file css do chúng ta tự viết -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/app.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- header -->\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-dark sticky-top bg-dark\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"../index.jsp\"> BALO-SSL</a>\n");
      out.write("            <div class=\"navbar-collapse collapse\" id=\"navbarCollapse\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"../index.jsp\">Trang chủ <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Quản trị</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"products.jsp\">Sản phẩm</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"about.jsp\">Giới thiệu</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"contact.jsp\">Liên hệ</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline mt-2 mt-md-0\" method=\"get\" action=\"search.jsp\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Tìm kiếm\" aria-label=\"Search\"\n");
      out.write("                        name=\"keyword_tensanpham\">\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Tìm kiếm</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"navbar-nav px-3\">\n");
      out.write("                <li class=\"nav-item text-nowrap\">\n");
      out.write("                    <a class=\"nav-link\" href=\"cart.jsp\">Giỏ hàng</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item text-nowrap\">\n");
      out.write("                    <!-- Nếu chưa đăng nhập thì hiển thị nút Đăng nhập -->\n");
      out.write("                    <a class=\"nav-link\" href=\"login.jsp\">Đăng nhập</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <!-- end header -->\n");
      out.write("\n");
      out.write("    <main role=\"main\">\n");
      out.write("        <!-- Block content - Đục lỗ trên giao diện bố cục chung, đặt tên là `content` -->\n");
      out.write("        <div class=\"container mt-4\">\n");
      out.write("            <div id=\"thongbao\" class=\"alert alert-danger d-none face\" role=\"alert\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">×</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <h1 class=\"text-center\">Giỏ hàng</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col col-md-12\">\n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>STT</th>\n");
      out.write("                                <th>Ảnh đại diện</th>\n");
      out.write("                                <th>Tên sản phẩm</th>\n");
      out.write("                                <th>Số lượng</th>\n");
      out.write("                                <th>Đơn giá</th>\n");
      out.write("                                <th>Thành tiền</th>\n");
      out.write("                                <th>Hành động</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody id=\"datarow\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>1</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <img src=\"../assets/img/product/tui1.jpg\" class=\"hinhdaidien\">\n");
      out.write("                                </td>\n");
      out.write("                                <td>Túi Xách B1</td>\n");
      out.write("                                <td class=\"text-right\">2</td>\n");
      out.write("                                <td class=\"text-right\">14,990,000.00</td>\n");
      out.write("                                <td class=\"text-right\">29,980,000.00</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <!-- Nút xóa, bấm vào sẽ xóa thông tin dựa vào khóa chính `sp_ma` -->\n");
      out.write("                                    <a id=\"delete_1\" data-sp-ma=\"2\" class=\"btn btn-danger btn-delete-sanpham\">\n");
      out.write("                                        <i class=\"fa fa-trash\" aria-hidden=\"false\"></i> Xóa\n");
      out.write("                                    </a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>2</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <img src=\"../assets/img/product/1_61.jpg\" class=\"hinhdaidien\">\n");
      out.write("                                </td>\n");
      out.write("                                <td>Balo A1</td>\n");
      out.write("                                <td class=\"text-right\">4</td>\n");
      out.write("                                <td class=\"text-right\">12,000,000.00</td>\n");
      out.write("                                <td class=\"text-right\">48,000,000.00</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <!-- Nút xóa, bấm vào sẽ xóa thông tin dựa vào khóa chính `sp_ma` -->\n");
      out.write("                                    <a id=\"delete_2\" data-sp-ma=\"6\" class=\"btn btn-danger btn-delete-sanpham\">\n");
      out.write("                                        <i class=\"fa fa-trash\" aria-hidden=\"true\"></i> Xóa\n");
      out.write("                                    </a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>3</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <img src=\"../assets/img/product/13_61.png\" class=\"hinhdaidien\">\n");
      out.write("                                </td>\n");
      out.write("                                <td>Balo A2</td>\n");
      out.write("                                <td class=\"text-right\">5</td>\n");
      out.write("                                <td class=\"text-right\">11,800,000.00</td>\n");
      out.write("                                <td class=\"text-right\">59,000,000.00</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <!-- Nút xóa, bấm vào sẽ xóa thông tin dựa vào khóa chính `sp_ma` -->\n");
      out.write("                                    <a id=\"delete_3\" data-sp-ma=\"4\" class=\"btn btn-danger btn-delete-sanpham\">\n");
      out.write("                                        <i class=\"fa fa-trash\" aria-hidden=\"true\"></i> Xóa\n");
      out.write("                                    </a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                    <a href=\"../index.jsp\" class=\"btn btn-warning btn-md\"><i class=\"fa fa-arrow-left\"\n");
      out.write("                            aria-hidden=\"true\"></i>&nbsp;Quay\n");
      out.write("                        về trang chủ</a>\n");
      out.write("                    <a href=\"checkout.jsp\" class=\"btn btn-primary btn-md\"><i\n");
      out.write("                            class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i>&nbsp;Thanh toán</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End block content -->\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <!-- footer -->\n");
      out.write("    <footer class=\"footer mt-auto py-3\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <p class=\"float-right\">\n");
      out.write("                <a href=\"#\">Về đầu trang</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- end footer -->\n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/popperjs/popper.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom script - Các file js do mình tự viết -->\n");
      out.write("    <script src=\"assets/js/app.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
