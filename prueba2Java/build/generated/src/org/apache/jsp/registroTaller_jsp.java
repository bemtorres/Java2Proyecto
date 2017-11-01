package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registroTaller_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <!--Import Google Icon Font-->\r\n");
      out.write("        <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <!--Import materialize.css-->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"\r\n");
      out.write("              media=\"screen,projection\"/>\r\n");
      out.write("        <!--Let browser know website is optimized for mobile-->\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>La Tuerca</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"teal darken-3\" role=\"navigation\">\r\n");
      out.write("            <div class=\"nav-wrapper container\">\r\n");
      out.write("                <a id=\"logo-container\" href=\"index.jsp\" class=\"brand-logo\">La Tuerca</a>\r\n");
      out.write("                <ul class=\"right hide-on-med-and-down\">                                                 \r\n");
      out.write("                    <li class=\"input-field col s1\">   \r\n");
      out.write("                        <form action=\"ControladorCerrarSesion\" method=\"POST\">  \r\n");
      out.write("                            <li class=\"input-field col s2\">   \r\n");
      out.write("                                <button class=\"btn waves-effect waves-light btn-large\" type=\"submit\" name=\"opcion\" value=\"Cerrar\">Cerrar<i class=\"material-icons right\"></i></button>\r\n");
      out.write("                            </li> \r\n");
      out.write("                        </form>\r\n");
      out.write("                    </li>    \r\n");
      out.write("                </ul>              \r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"section\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col s12 center \"> \r\n");
      out.write("                        <h4>Estado Vehiculo</h4> \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col s12\">\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <h5>Busque su vehiculo &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Ingrese Rut </h5>\r\n");
      out.write("                        <form action=\"ControladorRegistroFicha\" method=\"Post\">\r\n");
      out.write("                            <div class=\"input-field col s4\">\r\n");
      out.write("                                <i class=\"material-icons prefix\">directions_car</i>\r\n");
      out.write("                                <input type=\"text\" maxlength=\"6\" required=\"required\" name=\"patente\">\r\n");
      out.write("\r\n");
      out.write("                                <label for=\"icon_prefix\">Ingrese pantente del vehiculo</label>\r\n");
      out.write("                            </div>   \r\n");
      out.write("                            <div class=\"input-field col s2\">                               \r\n");
      out.write("                                <input id=\"rut\" type=\"number\" name=\"rut\"  value=\"0\" class=\"validate\">\r\n");
      out.write("                                <label for=\"last_name\">Rut</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"input-field col s1\">                               \r\n");
      out.write("                                <input id=\"dv\" type=\"text\" name=\"dv\" maxlength=\"1\"  class=\"validate\">\r\n");
      out.write("                                <label for=\"last_name\">Dv</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <button class=\"btn-large waves-effect waves-light cyan\" type=\"submit\" name=\"opcion\" value=\"Agregar\">Revisar<i class=\"material-icons right\">motorcycle</i></button>\r\n");
      out.write("                                </div>  \r\n");
      out.write("                            </div> \r\n");
      out.write("                        </form>\r\n");
      out.write("                        <div class=\"input-field col s8\">\r\n");
      out.write("                            <a href=\"menuPrincipal.jsp\" class=\"waves-effect waves-light red btn\"><i class=\"material-icons left\">arrow_back</i>Atrás</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>         \r\n");
      out.write("\r\n");
      out.write("        <footer class=\"page-footer teal grey darken-3\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col l6 s12\">\r\n");
      out.write("                        <h5 class=\"white-text\">Acerca de</h5>\r\n");
      out.write("                        <p class=\"grey-text text-lighten-4\"></p>\r\n");
      out.write("                    </div>              \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-copyright\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    © 2017 prueba de Desarrollo en Java\r\n");
      out.write("                    <a class=\"grey-text text-lighten-4 right\" href=\"https://bemtorres.github.io\" target=\"_blank\"> Integrantes Carlos Orellana & Benjamin Mora</a>           \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>   \r\n");
      out.write("    </body>\r\n");
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
