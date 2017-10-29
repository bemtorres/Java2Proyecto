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

/**
 *
 * @author benja
 */
public class ControladorCrudMoto extends HttpServlet {

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
        switch(opcion){
           case "Cerrar":
               //editar
                response.sendRedirect("index.jsp");
                break;  
           case "Agregar":
               //editar
                String patente = request.getParameter("patente");
                String marca = request.getParameter("marca");
                String foto = request.getParameter("");
                int anyo = Integer.parseInt(request.getParameter(""));
                int kilometraje = Integer.parseInt(request.getParameter("kilometraje"));
                String tipo_bencina = request.getParameter("tipoBencina");
                String tipomoto =  request.getParameter("tipoMoto");
                  
                response.sendRedirect("index.jsp");
                break;
           case "Buscar":
               //editar
               
                //Mato motoB = MotoDAO.Buscar(patenteB);//capta en "motoB"
               
                response.sendRedirect("index.jsp");
                break;
           case "Modificar":
               //editar
               
               String patenteM = request.getParameter("patente");
               //Moto motoM = MotoDao.Modificar(patenteM);
               
                response.sendRedirect("index.jsp");
                break;
            case "Listar":
                //editar
                response.sendRedirect("index.jsp");
                break;
            case "Cancelar":
                //editar
                response.sendRedirect("menuVehiculos.jsp");
                break;
               
        }
        try  {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorEstadoVehi</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorEstadoVehi at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        finally {            
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
