/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Auto;

/**
 *
 * @author benja
 */
public class ControladorCrudAuto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String opcion = request.getParameter("opcion");

        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorEstadoVehi</title>");
            out.println("</head>");
            out.println("<body>");
            if (opcion.equals("Agregar")) {

                int rut = Integer.parseInt(request.getParameter("rut"));
                String patente = request.getParameter("patente");
                String marca = request.getParameter("marca");
                String foto = request.getParameter("foto");
                int anyo = Integer.parseInt(request.getParameter("anyo"));
                int kilometraje = Integer.parseInt(request.getParameter("kilometraje"));
                String tipo_bencina = request.getParameter("tipoBencina");
                int cantPuertas = Integer.parseInt(request.getParameter("cantPuertas"));
                int cantAsientos = Integer.parseInt(request.getParameter("totalAsientos"));
                String tipoAuto = request.getParameter("tipoAuto");
                int cantAirbags = Integer.parseInt(request.getParameter("totalAirbag"));
                String cambiosAutomaticos = request.getParameter("cambioAutomatico");
                String electrico = request.getParameter("autoElectrico");
                String direccionAsistida = request.getParameter("direccionAsistida");
                String portaEquipaje = request.getParameter("portaEquipaje");

                Auto autito = new Auto(cantPuertas, cantAsientos, tipoAuto, cantAirbags, cambiosAutomaticos, electrico, direccionAsistida, portaEquipaje, patente, marca, rut, foto, anyo, kilometraje, tipo_bencina);

                int estado = new AutoDAO().agregarDatosVehiculo(autito);

                if (estado > 0) {
                    int estado1 = new AutoDAO().agregarDatosAuto(autito);
                    out.println("<h1>Auto agregado...</h1>");
                } else {
                    out.println("<h1>Auto NO agregado...</h1>");
                }
            }

            if (opcion.equals("Elimnar")) {

                String patenteE = request.getParameter("patente");
                int filas1 = new AutoDAO().eliminarDatosVehiculo(patenteE);

                if (filas1 == 1) {
                    int filas2 = new AutoDAO().eliminarDatos(patenteE);
                    if (filas2 == 1) {
                        out.println("<h1>Auto Eliminado existe...</h1>");

                    } else {
                        out.println("<h1>Auto NO existe 2...</h1>");
                    }
                } else {
                    out.println("<h1>Usuario NO existe " + patenteE + "...</h1>");
                }

            }
            if (opcion.equals("Modificar")) {
                int rut = Integer.parseInt(request.getParameter("rut"));
                String patente = request.getParameter("patente");
                String marca = request.getParameter("marca");
                String foto = request.getParameter("foto");
                int anyo = Integer.parseInt(request.getParameter("anyo"));
                int kilometraje = Integer.parseInt(request.getParameter("kilometraje"));
                String tipo_bencina = request.getParameter("tipoBencina");
                int cantPuertas = Integer.parseInt(request.getParameter("cantPuertas"));
                int cantAsientos = Integer.parseInt(request.getParameter("totalAsientos"));
                String tipoAuto = request.getParameter("tipoAuto");
                int cantAirbags = Integer.parseInt(request.getParameter("totalAirbag"));
                String cambiosAutomaticos = request.getParameter("cambioAutomatico");
                String electrico = request.getParameter("autoElectrico");
                String direccionAsistida = request.getParameter("direccionAsistida");
                String portaEquipaje = request.getParameter("portaEquipaje");
                
                Auto autito = new Auto(cantPuertas, cantAsientos, tipoAuto, cantAirbags, cambiosAutomaticos, electrico, direccionAsistida, portaEquipaje, patente, marca, rut, foto, anyo, kilometraje, tipo_bencina);
                int estado2 = new AutoDAO().actualizarDatosAuto(autito);
                if(estado2 > 0 )
                {
                    out.println("<h1>Cliente modificado...</h1>");
                }else{
                    out.println("<h1>Cliente no encontrado...</h1>");
                }
            }
            if (opcion.equals("Buscar")) {

                String patenteB = request.getParameter("patente");

                if (!patenteB.equals("")) {
                    Auto obj = new AutoDAO().buscarDatos(patenteB);
                    if (obj != null) {
                        out.println("<h1>" + obj.toString() + "Cliente encontrado..</h1>");
                    } else {
                        out.println("<h1>Auto no encontrado..</h1>");
                    }
                } else {
                    out.println("<h1>Faltan parametros...</h1>");
                }
            }

            out.println("<h1>Servlet ControladorEstadoVehi at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
