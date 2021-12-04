package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_002dproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>Shop BALO-SSL </title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("    <!-- Font awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/font-awesome/css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- Custom css - Các file css do chúng ta tự viết -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/app.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/product-detail.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <main role=\"main\">\n");
      out.write("        <!-- Block content - Đục lỗ trên giao diện bố cục chung, đặt tên là `content` -->\n");
      out.write("        <div class=\"container mt-4\">\n");
      out.write("            <div id=\"thongbao\" class=\"alert alert-danger d-none face\" role=\"alert\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">×</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"container-fliud\">\n");
      out.write("                    <form name=\"frmsanphamchitiet\" id=\"frmsanphamchitiet\" method=\"post\"\n");
      out.write("                        action=\"/php/twig/frontend/giohang/themvaogiohang\">\n");
      out.write("                        <input type=\"hidden\" name=\"sp_ma\" id=\"sp_ma\" value=\"5\">\n");
      out.write("                        <input type=\"hidden\" name=\"sp_ten\" id=\"sp_ten\" value=\"Samsung Galaxy Tab 10.1 3G 16G\">\n");
      out.write("                        <input type=\"hidden\" name=\"sp_gia\" id=\"sp_gia\" value=\"10990000.00\">\n");
      out.write("                        <input type=\"hidden\" name=\"hinhdaidien\" id=\"hinhdaidien\" value=\"samsung-galaxy-tab-10.jpg\">\n");
      out.write("\n");
      out.write("                        <div class=\"wrapper row\">\n");
      out.write("                            <div class=\"preview col-md-6\">\n");
      out.write("                                <div class=\"preview-pic tab-content\">\n");
      out.write("                                    <div class=\"tab-pane\" id=\"pic-1\">\n");
      out.write("                                        <img src=\"../assets/img/product/samsung-galaxy-tab-10.jpg\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"tab-pane\" id=\"pic-2\">\n");
      out.write("                                        <img src=\"../assets/img/product/samsung-galaxy-tab.jpg\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"tab-pane active\" id=\"pic-3\">\n");
      out.write("                                        <img src=\"../assets/img/product/samsung-galaxy-tab-4.jpg\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <ul class=\"preview-thumbnail nav nav-tabs\">\n");
      out.write("                                    <li class=\"active\">\n");
      out.write("                                        <a data-target=\"#pic-1\" data-toggle=\"tab\" class=\"\">\n");
      out.write("                                            <img src=\"../assets/img/product/samsung-galaxy-tab-10.jpg\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"\">\n");
      out.write("                                        <a data-target=\"#pic-2\" data-toggle=\"tab\" class=\"\">\n");
      out.write("                                            <img src=\"../assets/img/product/samsung-galaxy-tab.jpg\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"\">\n");
      out.write("                                        <a data-target=\"#pic-3\" data-toggle=\"tab\" class=\"active\">\n");
      out.write("                                            <img src=\"../assets/img/product/samsung-galaxy-tab-4.jpg\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"details col-md-6\">\n");
      out.write("                                <h3 class=\"product-title\">Samsung Galaxy Tab 10.1 3G 16G</h3>\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <div class=\"stars\">\n");
      out.write("                                        <span class=\"fa fa-star checked\"></span>\n");
      out.write("                                        <span class=\"fa fa-star checked\"></span>\n");
      out.write("                                        <span class=\"fa fa-star checked\"></span>\n");
      out.write("                                        <span class=\"fa fa-star\"></span>\n");
      out.write("                                        <span class=\"fa fa-star\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <span class=\"review-no\">999 reviews</span>\n");
      out.write("                                </div>\n");
      out.write("                                <p class=\"product-description\">Màn hình 10.1 inch cảm ứng đa điểm</p>\n");
      out.write("                                <h4 class=\"price\">Giá hiện tại: <span>10,990,000.00 vnđ</span></h4>\n");
      out.write("                                <p class=\"vote\"><strong>100%</strong> hàng <strong>Chất lượng</strong>, đảm bảo\n");
      out.write("                                    <strong>Uy tín</strong>!</p>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"soluong\">Số lượng đặt mua:</label>\n");
      out.write("                                    <input type=\"number\" class=\"form-control\" id=\"soluong\" name=\"soluong\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"action\">\n");
      out.write("                                    <a class=\"add-to-cart btn btn-default\" id=\"btnThemVaoGioHang\">Add To Cart</a>\n");
      out.write("                                    <a class=\"like btn btn-default\" href=\"#\"><span class=\"fa fa-heart\"></span></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- End block content -->\n");
      out.write("    </main>\n");
      out.write("         <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/popperjs/popper.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom script - Các file js do mình tự viết -->\n");
      out.write("    <script src=\"assets/js/app.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
