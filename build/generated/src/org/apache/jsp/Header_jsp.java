package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- header -->\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-dark sticky-top bg-dark\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\">BALO-SSL</a>\n");
      out.write("            <div class=\"navbar-collapse collapse\" id=\"navbarCollapse\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.jsp\">Trang chủ <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Quản trị</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Product\">Sản phẩm</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"pages/about.jsp\">Giới thiệu</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"pages/contact.jsp\">Liên hệ</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline mt-2 mt-md-0\" method=\"get\" action=\"pages/search.jsp\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Tìm kiếm\" aria-label=\"Search\"\n");
      out.write("                        name=\"keyword_tensanpham\">\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Tìm kiếm</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"navbar-nav px-3\">\n");
      out.write("                <li class=\"nav-item text-nowrap\">\n");
      out.write("                    <a class=\"nav-link\" href=\"pages/cart.jsp\">Giỏ hàng</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"cart.jsp\">Cart <span class=\"badge badge-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span> </a></li>\n");
      out.write("                                \n");
      out.write("                <li class=\"nav-item text-nowrap\">\n");
      out.write("                    <!-- Nếu chưa đăng nhập thì hiển thị nút Đăng nhập -->\n");
      out.write("                    <a class=\"nav-link\" href=\"pages/login.jsp\">Đăng nhập</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("<!-- header -->");
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
