package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Shop BALO-SSL | Bảng tin</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <!-- Font awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/font-awesome/css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- Custom css - Các file css do chúng ta tự viết -->\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"assets/css/app.css\" type=\"text/css\">-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/app.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- header -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header.jsp", out, false);
      out.write("\n");
      out.write("            <!-- end header -->\n");
      out.write("\n");
      out.write("            <main role=\"main\">\n");
      out.write("                <!-- Block content - Đục lỗ trên giao diện bố cục chung, đặt tên là `content` -->\n");
      out.write("                <div class=\"container mt-4\">\n");
      out.write("                    <!--                    <form class=\"needs-validation\" name=\"frmthanhtoan\" method=\"post\"\n");
      out.write("                                              action=\"#\">-->\n");
      out.write("                    <input type=\"hidden\" name=\"kh_tendangnhap\" value=\"dnpcuong\">\n");
      out.write("                    <div class=\"py-5 text-center\">\n");
      out.write("                        <i class=\"fa fa-credit-card fa-4x\" aria-hidden=\"true\"></i>\n");
      out.write("                        <h2>Thanh toán</h2>\n");
      out.write("                        <p class=\"lead\">Vui lòng kiểm tra thông tin Khách hàng, thông tin Giỏ hàng trước khi Đặt hàng.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4 order-md-2 mb-4\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <!--tong tien-->\n");
      out.write("                        <li class=\"list-group-item d-flex justify-content-between\">\n");
      out.write("                            <span>Tổng thành tiền</span>\n");
      out.write("                            <strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoney}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong>\n");
      out.write("                        </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <form action=\"checkout\" method=\"post\">\n");
      out.write("                        <div class=\"col-md-8 order-md-1\">\n");
      out.write("                            <h4 class=\"mb-3\">Thông tin khách hàng</h4>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label for=\"kh_ten\">Họ tên</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"name\" id=\"kh_ten\"\n");
      out.write("                                           value=\"\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label for=\"kh_diachi\">Địa chỉ</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"address\" id=\"kh_diachi\"\n");
      out.write("                                           value=\"\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label for=\"kh_dienthoai\">Điện thoại</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"phone\" id=\"kh_dienthoai\"\n");
      out.write("                                           value=\"\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label for=\"kh_email\">Email</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"email\" id=\"kh_email\"\n");
      out.write("                                           value=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <hr class=\"mb-4\">\n");
      out.write("                            <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\" name=\"btnDatHang\">Đặt\n");
      out.write("                                hàng</button>\n");
      out.write("                        </div> \n");
      out.write("                    </form>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- End block content -->\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <!-- footer -->\n");
      out.write("        <footer class=\"footer mt-auto py-3\">\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("        <!-- end footer -->\n");
      out.write("\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/popperjs/popper.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom script - Các file js do mình tự viết -->\n");
      out.write("        <script src=\"assets/js/app.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${carts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <h4 class=\"d-flex justify-content-between align-items-center mb-3\">\n");
          out.write("                                <span class=\"text-muted\">Giỏ hàng</span>\n");
          out.write("                                <span class=\"badge badge-secondary badge-pill\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.value.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                            </h4>\n");
          out.write("                            <ul class=\"list-group mb-3\">\n");
          out.write("\n");
          out.write("                                <li class=\"list-group-item d-flex justify-content-between lh-condensed\">\n");
          out.write("                                    <div>\n");
          out.write("                                        <h6 class=\"my-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.value.product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\n");
          out.write("                                        <small class=\"text-muted\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.value.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\n");
          out.write("                                    </div>\n");
          out.write("                                    <span class=\"text-muted\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.value.product.price * o.value.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                </li>\n");
          out.write("\n");
          out.write("                            </ul>\n");
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
