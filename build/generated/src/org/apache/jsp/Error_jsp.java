package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Error_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    \r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/forgetpassword.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write(" \r\n");
      out.write("  <body data-spy=\"scroll\" data-target=\"#my-navbar\">\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"profile.html\">PeopleTalk</a>\r\n");
      out.write("\t\t\t<div class=\"navbar-collapse collapse\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                                    <li><div class=\"navbar-text\"><p>Welcome: xyz</p></div></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"profile.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"Logout.html\">Logout</a><li>\r\n");
      out.write("\t\t\t\t</ul>\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav><!-- end of navbar-->\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<section>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Exception Aaya Re!!</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("                                                    <p>ghrtjytjytjytj</p>\r\n");
      out.write("\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t</br>\r\n");
      out.write("                                                <form action=\"profile.jsp\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                        <div class=\"col-lg-10 col-lg-offset-5\">\r\n");
      out.write("                                                                <button type=\"submit\" class=\"btn btn-primary\">Home</button>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                </div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--footer-->\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"navbar navbar-inverse navbar-fixed-bottom\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-text pull-left\">\r\n");
      out.write("\t\t\t\t<p>Design and Develop by INCAPP</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-2.2.2.min.js\"></script>\r\n");
      out.write("    <script src=\"js/validator.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" >\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" >\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" >\r\n");
      out.write("<title>PeopleTalk</title>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"css/custom.css\" rel=\"stylesheet\" />\t\r\n");
      out.write("<link href=\"datetimepicker/css/datetimepicker.min.css\" rel=\"stylesheet\"  />\r\n");
      out.write("</head>\r\n");
      out.write(" \r\n");
      out.write("  <body data-spy=\"scroll\" data-target=\"#my-navbar\">\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" id=\"my-navbar\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a href=\"home.jsp\" class=\"navbar-brand\">PeopleTalk</a>\r\n");
      out.write("\t\t\t</div><!--end header-->\r\n");
      out.write("\t\t</div><!--end container-->\r\n");
      out.write("\t</nav><!--end navbar-->\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<section>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Exception Aaya Re!!</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("                                                    <p>fdhrthrthrthrt</p>\r\n");
      out.write("\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t</br>\r\n");
      out.write("                                                <form action=\"home.jsp\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                        <div class=\"col-lg-10 col-lg-offset-5\">\r\n");
      out.write("                                                                <button type=\"submit\" class=\"btn btn-primary\">Home</button>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                </div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--footer-->\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"navbar navbar-inverse navbar-fixed-bottom\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-text pull-left\">\r\n");
      out.write("\t\t\t\t<p>Design and Develop by INCAPP</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-2.2.2.min.js\"></script>\r\n");
      out.write("    <script src=\"js/validator.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
