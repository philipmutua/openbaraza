/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.23
 * Generated at: 2014-04-14 07:19:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logonError_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/resources/include/init.jsp", Long.valueOf(1349369513000L));
    _jspx_dependants.put("/resources/include/footer.jsp", Long.valueOf(1327427220000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html\">\n");
      out.write("<html lang=\"en-us\">\n");
      out.write(" <head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<title>Open Baraza</title>\n");
      out.write("\t<meta name=\"description\" content=\"Open Baraza\">\n");
      out.write("\t<meta name=\"author\" content=\"Dew CIS Solutions LTD\">\n");
      out.write("\t<!-- Apple iOS and Android stuff -->\n");
      out.write("\t<meta name=\"apple-mobile-web-app-capable\" content=\"no\">\n");
      out.write("\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" href=\"apple-touch-icon-precomposed.png\">\n");
      out.write("\t\n");
      out.write("\t<!-- Apple iOS and Android stuff - don't remove! -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,user-scalable=no,maximum-scale=1\">\n");
      out.write("\t\n");
      out.write("    <link href=\"resources/themes/default/kendo.common.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"resources/themes/default/kendo.default.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"resources/themes/default/main.css\" rel=\"stylesheet\" >\n");
      out.write("\t\n");
      out.write("    <script src=\"resources/js/kendoui/jquery.min.js\" ></script>\n");
      out.write("    <script src=\"resources/js/kendoui/kendo.all.js\" ></script>\n");
      out.write("\t<script src=\"resources/js/jquery-ui-1.8.16.custom.min.js\"></script>\n");
      out.write("\t<script src=\"resources/js/custom.js\"></script>\t\n");
      out.write("\t\n");
      out.write("\t<!-- some basic functions -->\n");
      out.write("\t<script src=\"resources/js/functions.js\"></script>\n");
      out.write("\t\t\n");
      out.write("\t<!-- all Third Party Plugins and Whitelabel Plugins -->\n");
      out.write("\t<script src=\"resources/js/plugins.js\"></script>\n");
      out.write("\t<script src=\"resources/js/editor.js\"></script>\n");
      out.write("\t<script src=\"resources/js/calendar.js\"></script>\n");
      out.write("\t<script src=\"resources/js/flot.js\"></script>\n");
      out.write("\t<script src=\"resources/js/elfinder.js\"></script>\n");
      out.write("\t<script src=\"resources/js/datatables.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Alert.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Autocomplete.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Breadcrumb.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Calendar.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Chart.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Color.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Date.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Editor.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Dialog.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Fileexplorer.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Form.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Gallery.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Number.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Slider.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Store.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Time.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Valid.js\"></script>\n");
      out.write("\t<script src=\"resources/js/wl_Widget.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- configuration to overwrite settings -->\n");
      out.write("\t<script src=\"resources/js/config.js\"></script>\n");
      out.write("\t<script src=\"resources/js/script.js\"></script>\n");
      out.write("\t\t\t\t\n");
      out.write("  \n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"pageoptions\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"register.jsp\">Register</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"dashboard.jsp\">My Account</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div id=\"logo\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");

			request.getSession().invalidate();
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div class=\"alert warning\">Invalid user name or password.</div>\r\n");
      out.write("\t<div class=\"g12\">\r\n");
      out.write("\t\t<p>Please enter a user name or password that is authorized to access this application</p>\r\n");
      out.write("\t\t<a class=\"btn i_refresh_4 icon\" href=\"index.jsp\">Try Again</a>\r\n");
      out.write("\t\t<a class=\"btn i_key icon\" href=\"application.jsp?view=2:0\">Recover Lost Password</a>\r\n");
      out.write("\t\t<a class=\"btn i_user icon\" href=\"application.jsp?view=1:0\">Register New Account</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("    \r\n");
      out.write("\t<footer>&copy; 2012 - Dew CIS Solutions LTD, All Rights Reserved</footer>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /logonError.jsp(19,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("url");
    // /logonError.jsp(19,2) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/index.jsp");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
