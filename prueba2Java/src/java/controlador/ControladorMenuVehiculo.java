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
        String opcion = request.getParameter("opcion");

        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorMenuVehiculo</title>");
            out.println("</head>");
            out.println("<body>");

            if (opcion.equals("Moto")) {
                int rut = Integer.parseInt(request.getParameter("rut"));
                char dv = request.getParameter("dv").charAt(0);

                Cliente obj = new ClienteDAO().buscarDatos(rut, dv);
                if (obj != null) {
                    String rut0 = obj.getRut() + "";
                    String dv0 = obj.getDv() + "";
                    request.setAttribute("rut", rut0);
                    request.setAttribute("dv", dv0);
                    request.getRequestDispatcher("formularioAuto.jsp").forward(request, response);
                } else {
                    out.println("<h1> Errror, no se ha encontrado el cliente.</h1>");
                }
            }
            // out.println("<h1> "+obj.toString()+" </h1>");
            //break;
            if (opcion.equals("Moto")) {
                int rut = Integer.parseInt(request.getParameter("rut"));
                char dv = request.getParameter("dv").charAt(0);

                Cliente obj1 = new ClienteDAO().buscarDatos(rut, dv);

                if (obj1 != null) {
                    String rut1 = obj1.getRut() + "";
                    String dv1 = obj1.getDv() + "";
                    request.setAttribute("rut", rut1);
                    request.setAttribute("dv", dv1);
                    request.getRequestDispatcher("formularioMoto.jsp").forward(request, response);
                } else {
                    out.println("<h1> Errror, no se ha encontrado el cliente.</h1>");

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
