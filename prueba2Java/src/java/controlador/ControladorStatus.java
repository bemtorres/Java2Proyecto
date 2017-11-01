/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Auto;
import modelo.Cliente;
import modelo.Empleado;
import modelo.EstadoFicha;
import modelo.FichaReparacion;
import modelo.Moto;
import modelo.Vehiculo;

/**
 *
 * @author benja
 */
public class ControladorStatus extends HttpServlet {

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
        String patente = "";
        patente = request.getParameter("patente");
        FichaReparacion fichaReparacion = null;
        Auto auto = null;
        Moto moto = null;
        String estado;
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorLogin</title>");
            out.println("</head>");
            out.println("<body>");

            if (opcion.equals("Buscar")) {

                //1.- Buscar si hay una ficha de reparacion del auto
                fichaReparacion = new RegistroTallerDAO().buscarDatosPorPatente(patente);

                if (fichaReparacion != null) {                    //2.-Busco al Vehiculo                         
                    //out.println("<h1> error chingado " + fichaReparacion.toString() + "</h1>");
                   auto = new ControladorDAOTaller().buscarDatosAuto(patente);
                   String idFicha = fichaReparacion.getIdFicha() + "";

                    if (auto != null) {
                        //3.- Encuentro el auto
                        request.setAttribute("patente", patente);
                        request.getRequestDispatcher("statusAuto.jsp").forward(request, response);
                       // out.println("<h1> error chingado " + auto.toString() + "</h1>"); 
                    }
                    moto = new ControladorDAOTaller().buscarDatosMoto(patente);
                    if (moto != null) {
                        //3.- Encuentro la moto
                       // out.println("<h1> error chingado " + moto.toString() + "</h1>"); 
                        request.setAttribute("patente", patente);
                        request.getRequestDispatcher("statusMoto.jsp").forward(request, response);
                        //out.println("<h1> error chingado " + moto.toString() + "</h1>");
                    }
                }
                else{
                    estado = "*Patente no encontrada";
                    request.setAttribute("estado", estado);
                    request.getRequestDispatcher("registroStatus.jsp").forward(request, response);
                }
            }

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
