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
import modelo.Cliente;

/**
 *
 * @author benja
 */
public class ControladorMenuVehiculo extends HttpServlet {

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
        int rut = 0;
        String estado;
        String opcion = request.getParameter("opcion");
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorMenuVehiculo</title>");
            out.println("</head>");
            out.println("<body>");
            if (opcion.equals("MOTO")) {
                String rutA = request.getParameter("rut");
                char dv = request.getParameter("dv").charAt(0);
                rut = Integer.parseInt(rutA);

                if (rut > 0) {
                    Cliente obj = new ClienteDAO().buscarDatos(rut, dv);
                    if (obj != null) {
                         String rutS = obj.getRut()+"";
                        String dvS = obj.getDv()+ "";
                        request.setAttribute("rut", rutS);
                        request.setAttribute("dv", dvS);
                        request.getRequestDispatcher("formularioMoto.jsp").forward(request, response);
                    } else {
                        estado = "*El Cliente no existe";
                         request.setAttribute("estado", estado);
                        request.getRequestDispatcher("menuVehiculos.jsp").forward(request, response);

                    }
                } else {
                     estado = "*Rellene con los datos indicados";
                         request.setAttribute("estado", estado);
                        request.getRequestDispatcher("menuVehiculos.jsp").forward(request, response);
                }
            }
            if (opcion.equals("AUTO")) {
                String rutA = request.getParameter("rut");
                char dv = request.getParameter("dv").charAt(0);
                rut = Integer.parseInt(rutA);
                if (rut > 0) {
                    Cliente obj = new ClienteDAO().buscarDatos(rut, dv);
                    if (obj != null) {
                        String rutS = obj.getRut()+"";
                        String dvS = obj.getDv()+ "";
                        request.setAttribute("rut", rutS);
                        request.setAttribute("dv", dvS);
                        request.getRequestDispatcher("formularioAuto.jsp").forward(request, response);
                    } else {
                         estado = "*El Cliente no existe";
                         request.setAttribute("estado", estado);
                        request.getRequestDispatcher("menuVehiculos.jsp").forward(request, response);
                    }
                } else {
                   estado = "*Rellene con los datos indicados";
                         request.setAttribute("estado", estado);
                        request.getRequestDispatcher("menuVehiculos.jsp").forward(request, response);
                }

            }

            out.println(
                    "<h1>Servlet ControladorMenuVehiculo at " + request.getContextPath() + "</h1>");
            out.println(
                    "</body>");
            out.println(
                    "</html>");

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
