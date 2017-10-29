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
import modelo.FichaReparacion;

/**
 *
 * @author benja
 */
public class ControladorTallerAuto extends HttpServlet {

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
        switch (opcion) {

            case "Guardar":
                /* id_ficha    INT NOT NULL AUTO_INCREMENT,
                 rut_persona INT NOT NULL ,
                 patente VARCHAR (10) NOT NULL ,
                 id_est_fich  INT NOT NULL ,
                 fech_ingreso DATE NOT NULL ,
                 fech_salida  DATE NOT NULL ,
                 motivos VARCHAR (250) NOT NULL ,
                 detalles VARCHAR (250) NOT NULL ,
                 hor_trabajo INT NOT NULL ,
                 total       INT NOT NULL,
                 PRIMARY KEY (id_ficha)*/
                int rut_persona = Integer.parseInt(request.getParameter("rut"));
                String patente = request.getParameter("patente");
                int id_est_fich = 1;
                String fechaIngreso = request.getParameter("fechaIngreso");

                String motivo = request.getParameter("motivos");
                String detalles = "Cero Observaciones ... ";
                int hor_trabajo = 0;
                int total = 0;

                FichaReparacion ficha = new FichaReparacion(0, rut_persona, patente, id_est_fich, fechaIngreso, fechaIngreso,motivo ,detalles, hor_trabajo, total);

                int estado = new RegistroTallerDAO().agregarDatos(ficha);
                if (estado > 0) {
                    out.println("<h1>Datos Agregado agregado...</h1>");
                } else {
                    out.println("<h1>No Agregado NO agregado...</h1>");
                }
                break;
        }
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorRegistro</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorRegistro at " + request.getContextPath() + "</h1>");
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
