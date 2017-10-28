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
import  java.time.LocalDateTime;

/**
 *
 * @author benja
 */
public class ControladorCrudClientes extends HttpServlet {

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
        String pNombre="", sNombre="",apPaterno="", apMaterno="", direccion="",comuna="", email="";
        char dv;
        int rut=0,telefono=0;
        
        rut = Integer.parseInt(request.getParameter("rut"));
        dv = request.getParameter("dv").charAt(0);
        pNombre = request.getParameter("pNombre");
        sNombre = request.getParameter("sNombre");
        apPaterno = request.getParameter("apPaterno");
        apMaterno = request.getParameter("apMaterno");
        direccion = request.getParameter("direccion");
        comuna = request.getParameter("comuna");
        email = request.getParameter("email");
        telefono = Integer.parseInt(request.getParameter("telefono"));
        
        switch(opcion){
           case "Cerrar":
                response.sendRedirect("index.jsp");
                break;  
           case "Agregar":
                LocalDateTime ahora = LocalDateTime.now(); 
                String hoy = (ahora.getYear()+"-"+ahora.getMonth()+"-"+ahora.getDayOfMonth());                
                Cliente nuevoCliente = new Cliente(hoy, rut, dv, pNombre, sNombre, apPaterno, apMaterno, direccion, comuna, telefono,email);
                
                int estado =new ClienteDAO().agregarDatosPersona(nuevoCliente);
                if(estado>0)
                {    
                    int estado1 = new ClienteDAO().agregarDatosCliente(nuevoCliente);
                }
                else
                {
                     //out.println("<h1>Usuario NO agregado...</h1>");
                }
                response.sendRedirect("index.jsp");
                break;
           case "Buscar":
                response.sendRedirect("index.jsp");
                break;
           case "Modificar":
                response.sendRedirect("index.jsp");
                break;
            case "Listar":
                response.sendRedirect("index.jsp");
                break;
            case "Cancelar":
                response.sendRedirect("menuPrincipal.jsp");
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
