/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.67
 * Generated at: 2022-12-04 06:09:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/bottomTab.jsp", Long.valueOf(1670133908000L));
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
      out.write("<html lang=\"ko\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\">\n");
      out.write("<title>category</title>\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/bitcafe/resources/css/store/menu.css\"><!-- reset, bottomTab.css -->\n");
      out.write("<link rel=\"icon\" href=\"/bitcafe/resources/img/order.png\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"box_wrap\">	\n");
      out.write("<div class=\"container\" ><!-- container start -->\n");
      out.write("	<header id=\"menuHeader\">\n");
      out.write("			<div class=\"row\" id=\"storeList_head\">\n");
      out.write("			<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.categoryNum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"categoryNum_hidden\">\n");
      out.write("			<div class=\"col-2\" id=\"storeList_head_goback\" onclick=\"goback_store_info()\"><img alt=\"goback\" src=\"/bitcafe/resources/img/goback.png\" id=\"goback_icon\"></div>\n");
      out.write("			<div class=\"col-8\"><div class=\"storeViewHead\" id=\"categoryHead\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.categoryName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div></div>\n");
      out.write("		</div>\n");
      out.write("	</header>\n");
      out.write("	<div id=\"menuStart\">\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("</div><!-- container end -->\n");
      out.write("</div>\n");
      out.write("	");
      out.write("<footer class=\"menu\">\n");
      out.write("	<a class=\"footer-item\" id=\"homeTab\" href='/bitcafe?num=1'>\n");
      out.write("		<span>\n");
      out.write("			<svg version=\"1.0\" xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("			width=\"900.000000pt\" height=\"900.000000pt\" viewBox=\"0 0 900.000000 900.000000\"\n");
      out.write("			preserveAspectRatio=\"xMidYMid meet\">\n");
      out.write("				<g transform=\"translate(0.000000,900.000000) scale(0.100000,-0.100000)\"\n");
      out.write("				fill=\"#000000\" stroke=\"none\">\n");
      out.write("				<path d=\"M4337 8986 c-3 -8 -23 -18 -44 -21 -38 -6 -89 -24 -153 -54 -135 -62\n");
      out.write("				-122 -50 -2072 -1999 -1949 -1950 -1937 -1937 -1999 -2072 -57 -122 -69 -185\n");
      out.write("				-69 -350 0 -138 8 -196 38 -275 93 -249 282 -433 527 -513 64 -21 209 -42 315\n");
      out.write("				-45 l65 -2 6 -1410 c5 -1218 7 -1419 21 -1475 45 -193 121 -337 247 -472 110\n");
      out.write("				-117 245 -205 389 -255 125 -42 141 -43 1004 -43 821 0 828 0 865 21 55 30 92\n");
      out.write("				68 119 121 l24 47 0 1109 c0 1178 0 1166 47 1262 40 81 109 156 178 193 109\n");
      out.write("				58 96 57 645 57 549 0 534 1 646 -57 52 -27 145 -128 171 -185 55 -117 53 -75\n");
      out.write("				53 -1270 0 -1073 1 -1107 19 -1149 11 -24 37 -60 58 -80 78 -74 13 -69 932\n");
      out.write("				-69 864 0 878 1 1005 44 280 95 518 342 605 627 48 158 46 93 51 1579 l5 1405\n");
      out.write("				75 2 c282 8 485 90 648 261 98 103 181 256 209 387 5 23 14 39 21 37 9 -1 12\n");
      out.write("				36 12 148 0 112 -3 149 -12 147 -7 -1 -16 15 -21 38 -16 74 -69 199 -115 270\n");
      out.write("				-35 55 -459 484 -1941 1967 -1949 1949 -1936 1937 -2071 1999 -64 30 -115 48\n");
      out.write("				-153 54 -21 3 -41 13 -44 21 -4 11 -33 14 -153 14 -120 0 -149 -3 -153 -14z\"/>\n");
      out.write("				</g>\n");
      out.write("			</svg>\n");
      out.write("		</span>\n");
      out.write("		Home\n");
      out.write("	</a>\n");
      out.write("	<a class=\"footer-item\" id=\"orderTab\" href='/bitcafe/order?num=2'>\n");
      out.write("		<span>\n");
      out.write("			<svg version=\"1.0\" xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("			 width=\"900.000000pt\" height=\"900.000000pt\" viewBox=\"0 0 900.000000 900.000000\"\n");
      out.write("			 preserveAspectRatio=\"xMidYMid meet\">\n");
      out.write("				<g transform=\"translate(0.000000,900.000000) scale(0.100000,-0.100000)\"\n");
      out.write("				fill=\"#000000\" stroke=\"none\">\n");
      out.write("					<path d=\"M1893 8988 c1 -6 -14 -20 -34 -29 -20 -10 -57 -41 -82 -69 -38 -45\n");
      out.write("					-46 -60 -51 -109 -4 -32 -4 -82 0 -113 5 -47 14 -63 60 -119 150 -179 151\n");
      out.write("					-180 210 -299 36 -73 37 -77 37 -190 -1 -102 -3 -120 -24 -157 -55 -96 -102\n");
      out.write("					-153 -191 -230 -176 -153 -265 -262 -341 -414 -26 -53 -47 -104 -47 -112 0 -8\n");
      out.write("					-8 -32 -17 -53 -25 -58 -26 -404 0 -451 9 -18 17 -45 17 -61 0 -15 7 -37 15\n");
      out.write("					-48 8 -10 15 -25 15 -31 0 -27 76 -173 134 -258 33 -49 104 -133 156 -185 90\n");
      out.write("					-91 98 -96 163 -113 66 -17 131 -15 143 4 3 5 14 9 25 9 29 0 116 86 139 138\n");
      out.write("					13 28 20 67 20 103 0 74 -29 131 -110 217 -66 71 -148 189 -171 247 -9 22 -22\n");
      out.write("					56 -30 75 -27 70 -15 226 22 290 5 8 12 22 16 30 20 46 74 104 238 255 92 84\n");
      out.write("					245 270 245 296 0 7 6 20 13 28 7 9 21 36 31 61 10 25 22 53 28 64 5 10 13 39\n");
      out.write("					18 65 5 25 13 64 19 86 14 52 14 238 0 290 -6 22 -14 60 -19 85 -11 60 -96\n");
      out.write("					259 -143 335 -77 125 -270 335 -307 335 -13 0 -24 8 -27 20 -5 18 -14 20 -89\n");
      out.write("					20 -60 0 -83 -3 -81 -12z\"/>\n");
      out.write("					<path d=\"M3572 8980 c-7 -11 -18 -20 -25 -20 -23 0 -97 -70 -120 -114 -18 -33\n");
      out.write("					-22 -57 -21 -127 0 -98 2 -102 137 -258 42 -50 77 -95 77 -100 0 -4 7 -14 15\n");
      out.write("					-21 8 -7 15 -20 15 -29 0 -9 5 -22 12 -29 16 -16 37 -75 54 -157 12 -54 13\n");
      out.write("					-78 5 -106 -6 -20 -11 -45 -11 -55 0 -10 -14 -46 -30 -79 -24 -48 -69 -99\n");
      out.write("					-225 -254 -107 -106 -195 -198 -195 -203 0 -6 -12 -27 -27 -47 -56 -73 -87\n");
      out.write("					-136 -129 -261 -18 -54 -37 -186 -37 -255 1 -77 18 -208 31 -232 7 -12 12 -31\n");
      out.write("					12 -42 0 -11 7 -37 16 -58 9 -21 23 -51 29 -68 27 -64 36 -82 65 -130 16 -27\n");
      out.write("					33 -57 37 -65 25 -55 200 -251 253 -284 37 -24 131 -56 160 -56 40 0 133 45\n");
      out.write("					170 82 56 56 80 112 80 186 0 80 -18 118 -105 219 -91 107 -116 140 -137 177\n");
      out.write("					-84 154 -105 267 -70 371 38 114 87 174 307 375 162 149 258 309 316 529 24\n");
      out.write("					95 26 288 3 370 -8 31 -22 81 -31 111 -25 90 -120 274 -190 368 -81 108 -216\n");
      out.write("					242 -244 242 -12 0 -23 8 -26 20 -5 18 -14 20 -82 20 -65 0 -78 -3 -89 -20z\"/>\n");
      out.write("					<path d=\"M5260 8986 c0 -8 -10 -18 -22 -22 -39 -11 -105 -71 -128 -116 -30\n");
      out.write("					-58 -33 -188 -4 -239 10 -19 22 -36 25 -39 17 -13 162 -188 172 -207 61 -111\n");
      out.write("					80 -158 93 -226 32 -166 -27 -298 -203 -454 -182 -161 -277 -274 -342 -408\n");
      out.write("					-62 -127 -76 -172 -93 -295 -12 -93 -2 -285 18 -324 8 -16 14 -43 14 -61 0\n");
      out.write("					-17 7 -40 15 -51 8 -10 15 -25 15 -33 0 -28 104 -219 157 -291 140 -187 208\n");
      out.write("					-248 312 -276 60 -17 65 -17 119 1 75 25 126 66 162 129 26 44 30 62 30 124 0\n");
      out.write("					84 -16 122 -80 192 -47 51 -153 188 -163 210 -4 8 -11 22 -16 30 -27 45 -56\n");
      out.write("					135 -68 208 -6 35 21 150 46 197 33 63 102 144 187 220 156 139 232 227 311\n");
      out.write("					360 29 49 73 158 80 200 3 17 11 36 17 44 7 9 12 77 14 181 3 138 1 173 -12\n");
      out.write("					198 -9 17 -16 42 -16 56 0 51 -79 234 -142 329 -21 32 -38 62 -38 66 0 11\n");
      out.write("					-151 181 -199 224 -24 21 -56 43 -72 49 -16 5 -29 16 -29 24 0 11 -18 14 -80\n");
      out.write("					14 -63 0 -80 -3 -80 -14z\"/>\n");
      out.write("					<path d=\"M172 5099 c-52 -24 -105 -76 -132 -129 -20 -39 -20 -52 -17 -943 3\n");
      out.write("					-764 6 -919 20 -1012 8 -60 20 -126 26 -145 6 -19 11 -52 11 -73 0 -21 5 -48\n");
      out.write("					12 -60 6 -12 15 -42 19 -67 4 -25 13 -65 20 -90 11 -42 16 -59 49 -150 6 -19\n");
      out.write("					14 -46 17 -60 2 -14 11 -40 19 -57 23 -54 40 -96 59 -143 23 -57 140 -295 165\n");
      out.write("					-335 10 -16 31 -52 45 -80 15 -27 38 -64 51 -82 13 -17 24 -34 24 -37 0 -10\n");
      out.write("					79 -122 99 -140 11 -11 21 -24 21 -30 0 -6 33 -50 73 -97 39 -47 81 -97 92\n");
      out.write("					-111 59 -76 330 -341 405 -398 25 -18 50 -39 55 -45 14 -17 243 -182 316 -229\n");
      out.write("					33 -21 58 -43 56 -50 -3 -8 -197 -13 -723 -17 -395 -3 -735 -9 -754 -14 -33\n");
      out.write("					-7 -100 -52 -128 -85 -7 -8 -21 -32 -32 -52 -27 -50 -28 -175 -3 -221 29 -53\n");
      out.write("					86 -108 131 -128 43 -19 131 -19 3496 -19 3268 0 3454 1 3488 17 48 25 91 63\n");
      out.write("					110 98 31 60 48 106 48 134 0 34 -28 121 -46 142 -8 8 -14 20 -14 26 0 16 -91\n");
      out.write("					77 -130 87 -19 5 -361 12 -759 15 -509 4 -725 9 -728 17 -2 6 25 28 59 49 35\n");
      out.write("					22 89 57 120 80 31 22 82 58 113 80 31 22 70 52 86 66 17 15 51 44 77 65 133\n");
      out.write("					110 243 219 381 379 85 97 260 325 274 355 4 8 16 29 27 45 11 17 23 37 27 45\n");
      out.write("					4 8 19 33 35 54 15 21 28 42 28 47 0 4 20 42 45 83 25 42 45 83 45 90 0 7 7\n");
      out.write("					19 15 26 8 7 15 16 15 21 0 5 13 37 29 72 16 34 37 82 46 107 17 44 26 66 59\n");
      out.write("					143 9 21 16 48 16 60 0 12 6 31 14 42 7 11 16 34 18 50 3 17 10 44 16 60 13\n");
      out.write("					36 30 106 41 160 5 22 13 53 20 68 6 16 11 50 11 76 0 27 7 68 15 91 8 23 15\n");
      out.write("					68 15 99 0 31 7 115 15 186 12 103 15 288 15 885 0 694 -1 760 -17 814 -22 71\n");
      out.write("					-78 134 -148 165 l-48 21 -3441 -1 c-3394 -1 -3442 -1 -3484 -20z\"/>\n");
      out.write("					<path d=\"M7853 4629 c-10 -10 -13 -75 -13 -258 0 -136 4 -250 8 -256 12 -17\n");
      out.write("					69 -45 90 -45 11 0 25 -7 32 -15 7 -8 17 -15 22 -15 22 0 131 -76 186 -129\n");
      out.write("					126 -123 213 -273 244 -421 47 -228 -7 -474 -146 -662 -45 -60 -170 -178 -215\n");
      out.write("					-202 -68 -37 -173 -86 -184 -86 -8 0 -33 -6 -58 -14 -24 -8 -56 -17 -70 -20\n");
      out.write("					-17 -4 -30 -16 -36 -33 -6 -16 -16 -44 -22 -63 -7 -19 -17 -51 -21 -70 -19\n");
      out.write("					-77 -39 -138 -64 -194 -14 -32 -26 -64 -26 -71 0 -8 -8 -26 -17 -43 -9 -16\n");
      out.write("					-13 -36 -10 -46 6 -15 19 -17 114 -13 119 4 291 31 307 47 5 5 24 10 41 10 16\n");
      out.write("					0 39 7 49 15 11 8 26 15 33 15 13 0 130 51 163 71 8 5 21 12 29 16 50 23 221\n");
      out.write("					153 281 213 67 68 169 198 202 259 65 119 98 187 98 201 0 9 5 21 10 26 12 12\n");
      out.write("					33 86 60 209 25 115 28 409 5 495 -8 30 -15 69 -15 85 0 17 -7 39 -15 49 -8\n");
      out.write("					11 -15 32 -15 46 0 14 -7 35 -15 46 -8 10 -15 25 -15 33 0 19 -67 154 -106\n");
      out.write("					216 -92 144 -234 297 -344 371 -25 17 -63 43 -85 58 -49 34 -238 126 -259 126\n");
      out.write("					-8 0 -30 6 -48 14 -29 12 -64 22 -143 42 -11 3 -26 0 -32 -7z\"/>\n");
      out.write("				</g>\n");
      out.write("			</svg>\n");
      out.write("		</span>\n");
      out.write("		Order\n");
      out.write("	</a>\n");
      out.write("	<a class=\"footer-item\" id=\"cartTab\" href='/bitcafe/cart?num=3'>\n");
      out.write("		<span>\n");
      out.write("			<svg version=\"1.0\" xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("			 width=\"900.000000pt\" height=\"900.000000pt\" viewBox=\"0 0 900.000000 900.000000\"\n");
      out.write("			 preserveAspectRatio=\"xMidYMid meet\">\n");
      out.write("			<g transform=\"translate(0.000000,900.000000) scale(0.100000,-0.100000)\"\n");
      out.write("			fill=\"#000000\" stroke=\"none\">\n");
      out.write("				<path d=\"M166 8427 c-48 -14 -129 -90 -150 -142 -21 -48 -21 -161 -1 -209 21\n");
      out.write("				-51 95 -122 141 -137 30 -10 202 -14 753 -17 456 -2 719 -6 727 -13 6 -5 15\n");
      out.write("				-22 18 -37 14 -57 26 -109 40 -177 7 -38 19 -83 25 -98 6 -16 11 -47 11 -70 1\n");
      out.write("				-23 7 -53 15 -67 8 -14 14 -39 15 -56 0 -17 7 -51 15 -74 8 -23 15 -55 15 -70\n");
      out.write("				0 -15 7 -44 15 -63 8 -20 15 -52 15 -71 0 -19 5 -47 11 -63 7 -15 15 -48 19\n");
      out.write("				-73 8 -49 24 -117 46 -194 8 -26 14 -62 14 -80 0 -17 7 -44 15 -60 8 -15 15\n");
      out.write("				-45 15 -66 0 -22 5 -51 11 -67 7 -15 15 -48 20 -73 10 -61 27 -134 45 -196 8\n");
      out.write("				-28 14 -63 14 -79 0 -15 7 -48 15 -74 8 -25 22 -82 31 -126 9 -44 23 -100 30\n");
      out.write("				-124 8 -25 14 -61 14 -80 1 -20 7 -47 15 -61 8 -14 14 -40 15 -59 0 -19 6 -57\n");
      out.write("				14 -85 24 -87 38 -149 46 -202 4 -28 13 -61 19 -72 6 -11 11 -36 11 -54 0 -18\n");
      out.write("				6 -53 14 -78 8 -25 22 -81 31 -125 9 -44 23 -102 31 -129 8 -26 14 -60 14 -75\n");
      out.write("				0 -14 6 -46 14 -71 13 -42 23 -84 46 -200 5 -25 14 -65 20 -90 23 -93 33 -136\n");
      out.write("				40 -187 5 -28 13 -66 18 -85 6 -18 18 -69 28 -113 9 -44 23 -100 30 -124 8\n");
      out.write("				-25 14 -59 14 -78 0 -18 6 -50 14 -70 14 -38 27 -103 29 -156 2 -24 -5 -32\n");
      out.write("				-38 -50 -154 -84 -271 -204 -342 -352 -41 -83 -53 -116 -53 -139 0 -13 -7 -40\n");
      out.write("				-15 -59 -17 -42 -20 -206 -4 -277 28 -125 48 -183 83 -238 13 -20 26 -47 30\n");
      out.write("				-60 12 -37 196 -216 251 -244 28 -14 64 -32 80 -41 56 -28 106 -47 126 -47 11\n");
      out.write("				0 30 -6 42 -12 15 -9 101 -14 277 -18 165 -3 253 -9 250 -15 -3 -5 -32 -18\n");
      out.write("				-65 -28 -60 -19 -146 -55 -155 -66 -3 -4 -22 -15 -42 -26 -37 -19 -154 -125\n");
      out.write("				-193 -175 -50 -63 -125 -205 -125 -236 0 -8 -7 -29 -16 -45 -22 -44 -22 -364\n");
      out.write("				0 -408 9 -16 16 -37 16 -46 0 -26 68 -155 113 -215 63 -83 151 -166 213 -200\n");
      out.write("				21 -12 59 -32 83 -46 24 -13 53 -24 63 -24 10 0 32 -7 48 -15 50 -26 215 -40\n");
      out.write("				319 -27 184 22 320 87 455 217 51 49 116 127 116 139 0 4 11 24 25 46 27 42\n");
      out.write("				51 103 65 160 5 19 14 52 20 74 14 47 8 272 -10 336 -27 97 -76 196 -142 285\n");
      out.write("				-95 129 -235 224 -406 276 -49 15 -69 25 -60 30 18 12 3379 11 3397 0 12 -8 8\n");
      out.write("				-11 -15 -16 -16 -3 -44 -13 -62 -21 -18 -8 -40 -14 -50 -14 -9 -1 -35 -12 -57\n");
      out.write("				-25 -22 -14 -53 -31 -70 -39 -43 -20 -70 -42 -145 -116 -83 -83 -100 -107\n");
      out.write("				-156 -222 -159 -325 -59 -739 230 -952 39 -29 78 -55 86 -59 8 -4 35 -18 59\n");
      out.write("				-32 24 -14 54 -25 65 -25 12 0 31 -6 42 -14 11 -8 68 -20 127 -27 117 -14 274\n");
      out.write("				-1 327 26 16 8 38 15 48 15 10 0 39 11 63 25 24 14 51 28 59 32 8 3 50 33 92\n");
      out.write("				65 68 51 165 162 191 218 4 8 18 35 32 59 14 24 25 54 25 65 0 12 6 31 14 42\n");
      out.write("				8 11 20 69 27 128 14 119 1 280 -26 333 -8 16 -15 35 -15 44 0 9 -11 36 -25\n");
      out.write("				60 -14 24 -28 51 -31 59 -34 76 -195 242 -269 277 -16 7 -50 25 -74 38 -24 14\n");
      out.write("				-50 25 -57 25 -7 0 -28 6 -46 14 -18 8 -46 18 -62 21 -71 15 10 25 206 25 175\n");
      out.write("				0 213 3 245 17 52 24 113 72 113 89 0 8 4 14 9 14 5 0 17 23 26 51 37 110 0\n");
      out.write("				231 -89 297 l-50 37 -2431 5 c-2093 5 -2439 8 -2495 20 -58 13 -71 21 -127 76\n");
      out.write("				-60 60 -61 64 -68 128 -16 149 19 221 145 296 22 13 322 16 2480 20 l2455 5\n");
      out.write("				50 29 c70 40 110 87 135 159 11 34 26 76 32 92 5 17 14 48 18 70 4 22 12 54\n");
      out.write("				18 70 6 17 18 57 27 90 9 33 21 74 27 90 5 17 14 48 18 70 4 22 12 54 18 70 6\n");
      out.write("				17 18 57 27 90 10 33 24 77 31 98 8 20 14 48 14 60 0 13 5 28 10 33 6 6 15 33\n");
      out.write("				19 60 8 46 13 62 42 147 6 17 14 48 17 67 2 19 11 44 18 55 8 11 14 32 14 48\n");
      out.write("				0 16 6 43 14 60 12 31 27 80 46 157 7 33 12 48 41 133 6 17 15 50 19 72 4 22\n");
      out.write("				12 54 18 70 6 17 18 57 27 90 9 33 21 74 27 90 5 17 14 48 18 70 4 22 12 54\n");
      out.write("				18 70 6 17 18 57 27 90 10 33 21 71 27 84 5 14 13 43 18 65 4 23 13 55 18 71\n");
      out.write("				6 17 18 57 27 90 9 33 21 74 27 90 6 17 13 46 16 65 2 19 11 44 18 55 8 11 14\n");
      out.write("				32 14 48 0 16 6 43 14 60 13 32 31 93 45 157 4 19 13 45 19 57 7 12 12 35 12\n");
      out.write("				50 0 16 4 33 10 39 5 5 14 30 19 54 5 25 14 59 19 75 6 17 18 57 27 90 9 33\n");
      out.write("				21 74 27 90 5 17 14 48 18 70 4 22 12 54 18 70 16 47 40 127 46 158 4 15 13\n");
      out.write("				27 21 27 12 0 15 17 15 85 0 66 -3 85 -14 85 -7 0 -19 12 -25 28 -15 34 -67\n");
      out.write("				92 -106 118 -30 19 -84 19 -3283 24 -3213 5 -3254 5 -3268 25 -17 22 -34 80\n");
      out.write("				-34 113 0 12 -7 39 -15 59 -8 19 -15 51 -15 70 0 18 -7 50 -15 70 -8 19 -15\n");
      out.write("				48 -15 63 0 15 -7 47 -15 70 -8 23 -15 54 -15 67 0 14 -6 46 -14 72 -14 42\n");
      out.write("				-20 72 -45 201 -13 62 -44 131 -75 165 -26 27 -43 40 -96 67 -33 17 -1723 22\n");
      out.write("				-1784 5z\"/>\n");
      out.write("			</g>\n");
      out.write("			</svg>\n");
      out.write("		</span>\n");
      out.write("		Cart\n");
      out.write("	</a>\n");
      out.write("	<a class=\"footer-item\" id=\"othersTab\" href='/bitcafe/others?num=4'>\n");
      out.write("		<span>\n");
      out.write("			<svg version=\"1.0\" xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("				 width=\"900.000000pt\" height=\"900.000000pt\" viewBox=\"0 0 900.000000 900.000000\"\n");
      out.write("				 preserveAspectRatio=\"xMidYMid meet\">\n");
      out.write("				<g transform=\"translate(0.000000,900.000000) scale(0.100000,-0.100000)\"\n");
      out.write("				fill=\"#000000\" stroke=\"none\">\n");
      out.write("				<path d=\"M715 5370 c-227 -52 -404 -164 -544 -347 -66 -87 -129 -219 -154\n");
      out.write("				-323 -13 -58 -13 -362 0 -420 67 -285 297 -536 583 -639 122 -44 309 -62 410\n");
      out.write("				-41 25 6 65 14 90 19 107 21 222 78 345 170 73 55 83 65 148 149 134 174 191\n");
      out.write("				340 191 552 0 212 -57 378 -191 552 -65 84 -75 94 -148 149 -123 92 -238 149\n");
      out.write("				-345 170 -25 5 -65 13 -90 19 -69 14 -206 10 -295 -10z\"/>\n");
      out.write("				<path d=\"M4360 5379 c-19 -5 -55 -13 -80 -18 -128 -25 -323 -133 -426 -235\n");
      out.write("				-32 -33 -110 -139 -134 -182 -12 -21 -31 -55 -42 -74 -12 -19 -24 -48 -29 -65\n");
      out.write("				-4 -16 -12 -43 -18 -60 -53 -155 -53 -355 0 -510 6 -16 14 -43 18 -60 5 -16\n");
      out.write("				17 -46 29 -65 11 -19 30 -53 42 -74 24 -43 102 -149 134 -182 33 -32 139 -110\n");
      out.write("				182 -134 21 -12 55 -31 74 -42 19 -12 49 -24 65 -29 17 -4 44 -12 60 -18 111\n");
      out.write("				-38 277 -51 375 -31 25 6 65 14 90 19 129 25 323 133 426 235 32 33 110 139\n");
      out.write("				134 182 12 21 31 55 42 74 12 19 24 49 29 65 4 17 12 44 18 60 53 155 53 355\n");
      out.write("				0 510 -6 17 -14 44 -18 60 -5 17 -17 46 -29 65 -11 19 -30 53 -42 74 -24 43\n");
      out.write("				-102 149 -134 182 -33 32 -139 110 -182 134 -21 12 -55 31 -74 42 -19 12 -48\n");
      out.write("				24 -65 29 -16 4 -43 12 -60 18 -110 37 -299 52 -385 30z\"/>\n");
      out.write("				<path d=\"M7965 5379 c-22 -5 -60 -13 -85 -18 -108 -22 -222 -78 -345 -170 -73\n");
      out.write("				-55 -83 -65 -148 -149 -134 -174 -191 -340 -191 -552 0 -212 57 -378 191 -552\n");
      out.write("				65 -84 75 -94 148 -149 123 -92 238 -149 345 -170 25 -5 65 -13 90 -19 59 -12\n");
      out.write("				195 -12 245 1 22 5 60 13 85 18 210 41 452 222 566 423 46 82 83 176 94 237 4\n");
      out.write("				24 15 50 24 56 14 10 16 35 16 164 0 91 -4 150 -9 146 -13 -8 -24 12 -32 60\n");
      out.write("				-16 94 -82 229 -162 331 -92 120 -198 204 -342 272 -144 68 -361 99 -490 71z\"/>\n");
      out.write("				</g>\n");
      out.write("			</svg>\n");
      out.write("		</span>\n");
      out.write("		Others\n");
      out.write("	</a>\n");
      out.write("</footer>");
      out.write("<!-- bottomTab.jsp -->\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/bitcafe/resources/js/bottomTab.js\"></script><!-- bottomTab.js -->\n");
      out.write("<script type=\"text/javascript\" src=\"/bitcafe/resources/js/menu.js\"></script>\n");
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
