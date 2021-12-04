package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"../vendor/bootstrap/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("    <!-- Font awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../vendor/font-awesome/css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- Custom css - Các file css do chúng ta tự viết -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/app.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- header -->\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header.jsp", out, false);
      out.write("\n");
      out.write("    <!-- end header -->\n");
      out.write("\n");
      out.write("    <main role=\"main\">\n");
      out.write("        <!-- Block content - Đục lỗ trên giao diện bố cục chung, đặt tên là `content` -->\n");
      out.write("        <form name=\"frmdangnhap\"  action=\"login\" method=\"post\">\n");
      out.write("            <div class=\"container mt-4\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"card-group\">\n");
      out.write("                            <div class=\"card p-4\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h1>Đăng nhập</h1>\n");
      out.write("                                    <p class=\"text-muted\">Nhập thông tin Tài khoản</p>\n");
      out.write("                                    <div class=\"input-group mb-3\">\n");
      out.write("                                        <div class=\"input-group-prepend\">\n");
      out.write("                                            <span class=\"input-group-text\">\n");
      out.write("                                                <i class=\"icon-user\"></i>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" name=\"email\"\n");
      out.write("                                            placeholder=\"Email\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"input-group mb-4\">\n");
      out.write("                                        <div class=\"input-group-prepend\">\n");
      out.write("                                            <span class=\"input-group-text\">\n");
      out.write("                                                <i class=\"icon-lock\"></i>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <input class=\"form-control\" type=\"password\" name=\"password\"\n");
      out.write("                                            placeholder=\"Mật khẩu\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-6\">\n");
      out.write("                                            <button class=\"btn btn-primary px-4\" type=\"submit\"><i>Đăng nhập</i></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card text-white bg-primary py-5 d-md-down-none\" style=\"width:44%\">\n");
      out.write("                                <div class=\"card-body text-center\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <h2>Đăng ký</h2>\n");
      out.write("                                        <p>Đăng ký để làm thành viên của cửa hàng BALO-SSL. Bạn sẽ được một số quyền\n");
      out.write("                                            lợi nhất\n");
      out.write("                                            định khi làm thành viên của Chúng tôi.</p>\n");
      out.write("                                        <a class=\"btn btn-primary active mt-3\" href=\"register.jsp\">Đăng ký ngay!</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <!-- End block content -->\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <!-- footer -->\n");
      out.write("    \n");
      out.write("    <!-- end footer -->\n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"../vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"../vendor/popperjs/popper.min.js\"></script>\n");
      out.write("    <script src=\"../vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom script - Các file js do mình tự viết -->\n");
      out.write("    <script src=\"../assets/js/app.js\"></script>\n");
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
