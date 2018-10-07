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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Login CRUD web</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/gobal.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<form action=\"main?acao=login\" method=\"post\">\n");
      out.write("    <div class=\"main\">\n");
      out.write("            <div class=\"erroDiv\">\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msgErro != null ? msgErro : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\t<fieldset id=\"fieldset_login\">\n");
      out.write("\t\t<legend>Login do Sistema</legend>\n");
      out.write("\t<div class=\"campo\">\n");
      out.write("\t\t<label for=\"login\">Login</label>\n");
      out.write("\t\t<input type=\"text\" id=\"login\" name=\"login\" maxlength=\"15\"/>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"campo\">\n");
      out.write("\t\t<label for=\"senha\">Senha</label>\n");
      out.write("\t\t<input type=\"password\" id=\"senha\" name=\"senha\" maxlength=\"15\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"campo\">\n");
      out.write("\t\t<input type=\"submit\" value=\"logar\"/>\n");
      out.write("\t</div>\n");
      out.write("\t</fieldset>\n");
      out.write("</form>\t\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
