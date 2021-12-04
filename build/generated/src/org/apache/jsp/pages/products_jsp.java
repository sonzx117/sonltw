package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("    <title>Shop BALO-SSL  | Bảng tin</title>\n");
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
      out.write("                    <a class=\"nav-link\" href=\"cart\">Giỏ hàng</a>\n");
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
      out.write("        <!-- Danh sách sản phẩm -->\n");
      out.write("        <section class=\"jumbotron text-center\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"jumbotron-heading\">Danh sách Sản phẩm</h1>\n");
      out.write("                <p class=\"lead text-muted\">Các sản phẩm với chất lượng, uy tín, cam kết từ nhà Sản xuất, phân phối và\n");
      out.write("                    bảo hành\n");
      out.write("                    chính hãng.</p>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Giải thuật duyệt và render Danh sách sản phẩm theo dòng, cột của Bootstrap -->\n");
      out.write("        <div class=\"danhsachsanpham py-5 bg-light\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End block content -->\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <!-- footer -->\n");
      out.write("    <footer class=\"footer mt-auto py-3\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"product col-12 col-md-6 col-lg-4\">\n");
          out.write("                                <div class=\"card\">\n");
          out.write("                                    <img class=\"card-img-top\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Card image cap\">\n");
          out.write("                                    <div class=\"card-body\">\n");
          out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                                        <h4 class=\"card-text show_txt\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.catalog_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                        <p class=\"card-text show_txt\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                        <div class=\"row\">\n");
          out.write("                                            <div class=\"col\">\n");
          out.write("                                                <p class=\"btn btn-danger btn-block\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" $</p>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"col\">\n");
          out.write("                                                <!-- add to cart -->\n");
          out.write("                                                <a href=\"add-to-cart?productId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-success \">Add to cart</a>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
