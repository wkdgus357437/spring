/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.67
 * Generated at: 2022-12-02 00:53:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menuInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/admin/page.jsp", Long.valueOf(1669791845000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Bitcafe 관리자 페이지</title>\n");
      out.write("<link rel=\"icon\" href=\"/bitcafe/resources/img/order.png\">\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/bitcafe/resources/css/admincss/main.css\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("div#menuNameDiv, div#menuContentDiv, div#menuPriceDiv {\n");
      out.write("   color: red;\n");
      out.write("   font-size: 20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wrap\">\n");
      out.write("   ");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"header\">\n");
      out.write("   <a href=\"/bitcafe/orderMenuList?num=1\">\n");
      out.write("      <strong>BitCafe</strong>\n");
      out.write("   </a>\n");
      out.write("   <div id=\"admin\">\n");
      out.write("      <div id=\"welcome\">관리자(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(")님 환영합니다!</div>\n");
      out.write("      <input type=\"button\" value=\"로그아웃\" id=\"logoutBtn\"/>\n");
      out.write("   </div>\n");
      out.write("</div><!-- header -->\n");
      out.write("\n");
      out.write("<div id=\"container\">\n");
      out.write("   <div id=\"nav\">\n");
      out.write("      <ul>\n");
      out.write("         <li class=\"menu\" id=\"orderMenuList\"><a href=\"/bitcafe/orderMenuList?num=1\">주문내역</a></li>\n");
      out.write("         <li class=\"menu\" id=\"orderCount\"><a href=\"/bitcafe/orderCount?num=2\">매출확인</a></li>\n");
      out.write("         <li class=\"menu\" id=\"menuInsert\"><a href=\"/bitcafe/menuInsert?num=3\">메뉴추가</a></li>\n");
      out.write("         <li class=\"menu\" id=\"menuDelete\"><a href=\"/bitcafe/menuEdit?num=4\">메뉴편집</a></li>\n");
      out.write("      </ul>\n");
      out.write("   </div><!-- nav -->\n");
      out.write("</div><!-- container -->");
      out.write("\n");
      out.write("   <div id=\"content\" class=\"row\">\n");
      out.write("   <div class=\"col-10\">\n");
      out.write("   <form name=\"menuInsertForm\" id=\"menuInsertForm\" method=\"\">\n");
      out.write("      <table cellpadding=\"5\" cellspacing=\"0\" class=\"table table-sm\" id=\"menuInsertTable\">\n");
      out.write("         <!-- <tr>\n");
      out.write("            <th>메뉴이미지</th>\n");
      out.write("            <td>\n");
      out.write("               <img id=\"showImg\" width=\"150\" height=\"150\"><br><br>\n");
      out.write("               <input type=\"file\" name=\"img\" id=\"img\">\n");
      out.write("            </td>\n");
      out.write("         </tr> -->\n");
      out.write("         <tr>\n");
      out.write("            <th>메뉴이름</th>\n");
      out.write("            <td>\n");
      out.write("               <input type=\"text\" placeholder=\"메뉴이름 입력\" name=\"menuName\" id=\"menuName\" maxlength=\"30\"/>\n");
      out.write("               <div id=\"menuNameDiv\"></div>\n");
      out.write("            </td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("            <th>메뉴설명</th>\n");
      out.write("            <td>\n");
      out.write("               <textarea placeholder=\"메뉴설명 입력\" name=\"menuContent\" id=\"menuContent\" cols=\"50\" rows=\"5\"></textarea>\n");
      out.write("               <div id=\"menuContentDiv\"></div>\n");
      out.write("            </td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("            <th>메뉴가격</th>\n");
      out.write("            <td>\n");
      out.write("               <input type=\"text\" name=\"menuPrice\" id=\"menuPrice\" maxlength=\"8\"/>원\n");
      out.write("               <div id=\"menuPriceDiv\"></div>\n");
      out.write("            </td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("            <th>카테고리 선택</th>\n");
      out.write("            <td>\n");
      out.write("               <select name=\"categoryNum\" id=\"categoryNum\">\n");
      out.write("                  <option value=\"\">카테고리</option>\n");
      out.write("               </select>\n");
      out.write("            </td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td colspan=\"2\" align=\"center\">\n");
      out.write("               <input type=\"button\" class=\"menuInsert btn btn-primary\" value=\"메뉴추가\">\n");
      out.write("               <input type=\"reset\" value=\"다시작성\" class=\"btn btn-primary\">\n");
      out.write("            </td>\n");
      out.write("         </tr>\n");
      out.write("      </table>\n");
      out.write("   </form>\n");
      out.write("   </div>\n");
      out.write("   </div><!-- content -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/bitcafe/resources/js/admin.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/bitcafe/resources/js/menuInsert.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/bitcafe/resources/js/imgUpload.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}