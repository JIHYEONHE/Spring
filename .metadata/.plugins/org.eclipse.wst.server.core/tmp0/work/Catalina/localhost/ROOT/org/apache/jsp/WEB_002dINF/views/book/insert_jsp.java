/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2022-11-14 08:17:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/eGovFrameDev-3.10.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/egovProj/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1666247066688L));
    _jspx_dependants.put("jar:file:/C:/eGovFrameDev-3.10.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/egovProj/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/js/jquery-3.6.0.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("<div class=\"col-md-6\" style=\"width=100%;\">\r\n");
      out.write("\t<form method=\"post\" action=\"/book/insertPost\">\r\n");
      out.write("   <div class=\"card card-primary\" style=\"width:100%;\">\r\n");
      out.write("   \t<div class=\"card-header\">\r\n");
      out.write("\t\t<h3 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bodyInsert}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write(" <div class=\"card-body\">\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("            <label>제목 :</label>\r\n");
      out.write("            <div class=\"input-group date\" id=\"reservationdatetime\" data-target-input=\"nearest\">\r\n");
      out.write("               <input type=\"text\" class=\"form-control rounded-0\" name=\"title\" required />\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("            <label>카테고리 :</label>\r\n");
      out.write("            <div class=\"input-group date\" id=\"reservationdatetime\" data-target-input=\"nearest\">\r\n");
      out.write("               <input type=\"text\" class=\"form-control rounded-0\" name=\"category\" required />\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("            <label>가격 :</label>\r\n");
      out.write("            <div class=\"input-group date\" id=\"reservationdatetime\" data-target-input=\"nearest\">\r\n");
      out.write("               <input type=\"text\" id=\"txtPrice\" class=\"form-control rounded-0\" name=\"price\" required />\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("            <label>내용 :</label>\r\n");
      out.write("            <div class=\"input-group date\" id=\"reservationdatetime\" data-target-input=\"nearest\">\r\n");
      out.write("            \t<textarea id=\"content\" name=\"content\" class=\"form-control\" rows=\"4\" style=\"height: 124px;\"></textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("      </div>\r\n");
      out.write("\t\t<div class=\"card-footer\" style=\"display:flex; justify-content:flex-end;\">\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-primary\">등록</button>\r\n");
      out.write("\t\t\t<a href=\"/book/list\"><button type=\"button\" class=\"btn btn-success\" >취소</button></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   $(function() {\r\n");
      out.write("      // 숫자입력 validate\r\n");
      out.write("      $(\"#txtPrice\").on(\"keyup\", function() {\r\n");
      out.write("         $(this).val($(this).val().replace(/[^0-9]/g, \"\"));\r\n");
      out.write("      });\r\n");
      out.write("   });\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tCKEDITOR.replace(\"content\");\n");
      out.write("</script>\r\n");
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
