package org.apache.jsp;

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
      out.write("<html lang=\"en\" >\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Login Form</title>\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("      <style>\n");
      out.write("     \n");
      out.write("      @import url(https://fonts.googleapis.com/css?family=Open+Sans);\n");
      out.write(".btn { display: inline-block; *display: inline; *zoom: 1; padding: 4px 10px 4px; margin-bottom: 0; font-size: 13px; line-height: 18px; color: #333333; text-align: center;text-shadow: 0 1px 1px rgba(255, 255, 255, 0.75); vertical-align: middle; background-color: #f5f5f5; background-image: -moz-linear-gradient(top, #ffffff, #e6e6e6); background-image: -ms-linear-gradient(top, #ffffff, #e6e6e6); background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#ffffff), to(#e6e6e6)); background-image: -webkit-linear-gradient(top, #ffffff, #e6e6e6); background-image: -o-linear-gradient(top, #ffffff, #e6e6e6); background-image: linear-gradient(top, #ffffff, #e6e6e6); background-repeat: repeat-x; filter: progid:dximagetransform.microsoft.gradient(startColorstr=#ffffff, endColorstr=#e6e6e6, GradientType=0); border-color: #e6e6e6 #e6e6e6 #e6e6e6; border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25); border: 1px solid #e6e6e6; -webkit-border-radius: 4px; -moz-border-radius: 4px; border-radius: 4px; -webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.05); -moz-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.05); box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.05); cursor: pointer; *margin-left: .3em; }\n");
      out.write(".btn:hover, .btn:active, .btn.active, .btn.disabled, .btn[disabled] { background-color: #e6e6e6; }\n");
      out.write(".btn-large { padding: 9px 14px; font-size: 15px; line-height: normal; -webkit-border-radius: 5px; -moz-border-radius: 5px; border-radius: 5px; }\n");
      out.write(".btn:hover { color: #333333; text-decoration: none; background-color: #e6e6e6; background-position: 0 -15px; -webkit-transition: background-position 0.1s linear; -moz-transition: background-position 0.1s linear; -ms-transition: background-position 0.1s linear; -o-transition: background-position 0.1s linear; transition: background-position 0.1s linear; }\n");
      out.write(".btn-primary, .btn-primary:hover { text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25); color: #ffffff; }\n");
      out.write(".btn-primary.active { color: rgba(255, 255, 255, 0.75); }\n");
      out.write(".btn-primary { background-color: #4a77d4; background-image: -moz-linear-gradient(top, #6eb6de, #4a77d4); background-image: -ms-linear-gradient(top, #6eb6de, #4a77d4); background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#6eb6de), to(#4a77d4)); background-image: -webkit-linear-gradient(top, #6eb6de, #4a77d4); background-image: -o-linear-gradient(top, #6eb6de, #4a77d4); background-image: linear-gradient(top, #6eb6de, #4a77d4); background-repeat: repeat-x; filter: progid:dximagetransform.microsoft.gradient(startColorstr=#6eb6de, endColorstr=#4a77d4, GradientType=0);  border: 1px solid #3762bc; text-shadow: 1px 1px 1px rgba(0,0,0,0.4); box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.5); }\n");
      out.write(".btn-primary:hover, .btn-primary:active, .btn-primary.active, .btn-primary.disabled, .btn-primary[disabled] { filter: none; background-color: #4a77d4; }\n");
      out.write(".btn-block { width: 100%; display:block; }\n");
      out.write("\n");
      out.write("* { -webkit-box-sizing:border-box; -moz-box-sizing:border-box; -ms-box-sizing:border-box; -o-box-sizing:border-box; box-sizing:border-box; }\n");
      out.write("\n");
      out.write("html { width: 100%; height:100%; overflow:hidden; }\n");
      out.write("\n");
      out.write("body { \n");
      out.write("\twidth: 100%;\n");
      out.write("\theight:100%;\n");
      out.write("\tfont-family: 'Open Sans', sans-serif;\n");
      out.write("\tbackground: #092756;\n");
      out.write("\tbackground: -moz-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%),-moz-linear-gradient(top,  rgba(57,173,219,.25) 0%, rgba(42,60,87,.4) 100%), -moz-linear-gradient(-45deg,  #670d10 0%, #092756 100%);\n");
      out.write("\tbackground: -webkit-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -webkit-linear-gradient(top,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -webkit-linear-gradient(-45deg,  #670d10 0%,#092756 100%);\n");
      out.write("\tbackground: -o-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -o-linear-gradient(top,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -o-linear-gradient(-45deg,  #670d10 0%,#092756 100%);\n");
      out.write("\tbackground: -ms-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -ms-linear-gradient(top,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -ms-linear-gradient(-45deg,  #670d10 0%,#092756 100%);\n");
      out.write("\tbackground: -webkit-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), linear-gradient(to bottom,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), linear-gradient(135deg,  #670d10 0%,#092756 100%);\n");
      out.write("\tfilter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#3E1D6D', endColorstr='#092756',GradientType=1 );\n");
      out.write("}\n");
      out.write(".login { \n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 30%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\tmargin: -150px 0 0 -150px;\n");
      out.write("\twidth:300px;\n");
      out.write("\theight:300px;\n");
      out.write("}\n");
      out.write(".login h1 { color: #fff; text-shadow: 0 0 10px rgba(0,0,0,0.3); letter-spacing:1px; text-align:center; }\n");
      out.write("\n");
      out.write("input { \n");
      out.write("\twidth: 100%; \n");
      out.write("\tmargin-bottom: 10px; \n");
      out.write("\tbackground: rgba(0,0,0,0.3);\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tfont-size: 13px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-shadow: 1px 1px 1px rgba(0,0,0,0.3);\n");
      out.write("\tborder: 1px solid rgba(0,0,0,0.3);\n");
      out.write("\tborder-radius: 4px;\n");
      out.write("\tbox-shadow: inset 0 -5px 45px rgba(100,100,100,0.2), 0 1px 1px rgba(255,255,255,0.2);\n");
      out.write("\t-webkit-transition: box-shadow .5s ease;\n");
      out.write("\t-moz-transition: box-shadow .5s ease;\n");
      out.write("\t-o-transition: box-shadow .5s ease;\n");
      out.write("\t-ms-transition: box-shadow .5s ease;\n");
      out.write("\ttransition: box-shadow .5s ease;\n");
      out.write("}\n");
      out.write("input:focus { box-shadow: inset 0 -5px 45px rgba(100,100,100,0.4), 0 1px 1px rgba(255,255,255,0.2); }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div class=\"login\">\n");
      out.write("\t<h1>Login</h1>\n");
      out.write("    <form method=\"post\">\n");
      out.write("    \t<input type=\"text\" name=\"userl\" placeholder=\"Username\" required=\"required\" />\n");
      out.write("        <input type=\"password\" name=\"passl\" placeholder=\"Password\" required=\"required\" />\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary btn-block btn-large\">Let me in.</button>\n");
      out.write("    </form>\n");
      out.write("  <div class=\"registry\">\n");
      out.write("\t<h1>Sign-Up</h1>\n");
      out.write("    <form method=\"post\">\n");
      out.write("    \t<input type=\"text\" name=\"u\" placeholder=\"Username\" required=\"required\" />\n");
      out.write("        <input type=\"password\" name=\"p\" placeholder=\"Password\" required=\"required\" />\n");
      out.write("        <input type=\"rpassword\" name=\"rp\" placeholder=\"Repeat Password\" required=\"required\" />\n");
      out.write("        <input type=\"E-mail\" name=\"em\" placeholder=\"E-mail\" required=\"required\" />\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary btn-block btn-large\">Register</button>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("    <script  src=\"js/index.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
