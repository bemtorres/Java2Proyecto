package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">       \n");
      out.write("         <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <!--Import materialize.css-->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"\n");
      out.write("        media=\"screen,projection\"/>\n");
      out.write("        <!--Let browser know website is optimized for mobile-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>La Tuerca</title>\n");
      out.write("    </head>\n");
      out.write("     <body>      \n");
      out.write("        \n");
      out.write("        <nav class=\"teal darken-3\" role=\"navigation\">\n");
      out.write("            <div class=\"nav-wrapper container\">\n");
      out.write("                <a id=\"logo-container\" href=\"index.jsp\" class=\"brand-logo\">La Tuerca</a>                \n");
      out.write("                <ul class=\"right hide-on-med-and-down\"> \n");
      out.write("                    <form action=\"ControladorLogin\" method=\"POST\">    \n");
      out.write("                   <li class=\"input-field col s5\">\n");
      out.write("                        <i class=\"material-icons prefix\">account_circle</i>\n");
      out.write("                        <input id=\"icon_prefix\" type=\"text\" name=\"usuario\">\n");
      out.write("                        <label for=\"icon_prefix\">Usuario</label>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"input-field col s4\">                                                       \n");
      out.write("                        <i class=\"material-icons prefix\">vpn_key</i>\n");
      out.write("                        <input id=\"icon_prefix\"  type=\"password\" name=\"clave\" >\n");
      out.write("                        <label for=\"icon_prefix\">Contraseña</label>\n");
      out.write("                    </li>        \n");
      out.write("                    <li class=\"input-field col s4\">\n");
      out.write("                        <button class=\"btn waves-effect waves-light btn\">\n");
      out.write("                            <input type=\"submit\" name=\"opcion\" value=\"Ingresar\"><i class=\"material-icons right\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </li>  \n");
      out.write("                    </form> \n");
      out.write("                </ul>              \n");
      out.write("            </div>\n");
      out.write("        </nav> \n");
      out.write("        \n");
      out.write("        <div id=\"index-banner\" class=\"parallax-container\">\n");
      out.write("            <div class=\"section no-pad-bot\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <br><br>\n");
      out.write("                    <h1 class=\"header center teal-text text-lighten-2\">La Tuerca</h1>\n");
      out.write("                    <div class=\"row center\">\n");
      out.write("                        <h5 class=\"header col s12 light\">Revisa aqui el estado de su auto</h5>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row center\">  \n");
      out.write("                        <a href=\"estadoVehiculo.jsp\" id=\"download-button\" class=\"btn-large waves-effect waves-light teal lighten-1\"><i class=\"material-icons prefix\">drive_eta</i>Estado de su vehiculo</a>\n");
      out.write("                    </div>\n");
      out.write("                    <br><br>\n");
      out.write("                </div>\n");
      out.write("            </div>          \n");
      out.write("        </div>              \n");
      out.write("        <footer class=\"page-footer grey darken-3\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col l6 s12\">\n");
      out.write("                        <h5 class=\"white-text\">Acerca de</h5>\n");
      out.write("                        <p class=\"grey-text text-lighten-4\"></p>\n");
      out.write("                    </div>              \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-copyright\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    © 2017 prueba de Desarrollo en Java\n");
      out.write("                    <a class=\"grey-text text-lighten-4 right\" href=\"https://bemtorres.github.io\" target=\"_blank\"> Integrantes Carlos Orellana & Benjamin Mora</a>           \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>        \n");
      out.write("    </body>\n");
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
