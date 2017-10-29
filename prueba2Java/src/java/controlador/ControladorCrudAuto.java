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
        int anyo = 0, kilometraje = 0, cantPuertas = 0, cantAsientos = 0, cantAirbags = 0;
        
        
        switch(opcion){
            
           case "Cerrar":
               //editar
                response.sendRedirect("index.jsp");
                break;  
           case "Agregar":
               //editar
               String patente = request.getParameter("patente");
               String marca = request.getParameter("marca");
               String foto = request.getParameter("foto");
               anyo = Integer.parseInt(request.getParameter("anyo"));
               kilometraje = Integer.parseInt(request.getParameter("kilometraje"));
               String tipo_bencina = request.getParameter("tipoBencina");
               cantPuertas = Integer.parseInt(request.getParameter("cantPuertas"));
               cantAsientos = Integer.parseInt(request.getParameter("totalAsiento"));
               String tipoAuto = request.getParameter("tipoAuto");
               cantAirbags = Integer.parseInt(request.getParameter("totalAirbag"));
               String cambiosAutomaticos = request.getParameter("cambioAutomatico");
               String electrico = request.getParameter("autoElectrico");
               String direccionAsistida = request.getParameter("direccionAsistida");
               String portaEquipaje = request.getParameter("portaEquipaje");
               
               Auto autito = new Auto(cantPuertas, cantAsientos, tipoAuto, cantAirbags, cambiosAutomaticos, electrico, direccionAsistida, portaEquipaje, patente, marca, foto, anyo, kilometraje, tipo_bencina);
               //agregarlo a "AutoDAO"
               //AutoDAO.Agregar(autito); 
                response.sendRedirect("index.jsp");
                break;
           case "Buscar":
               //editar
               String patenteB= request.getParameter("patente");
               
               //AutoDAO.Buscar(patenteB);//se pierde
               //Auto autoB ;//se declara el "autoB" que es temporal, solo para la accion
               //Auto autoB = AutoDAO.Buscar(patenteB);//capta en "autoB"
               
               
                response.sendRedirect("index.jsp");
                break;
           case "Modificar":
               //editar
               String patenteM = request.getParameter("patente");
               //Auto autoM = AutoDao.Modificar(patenteM);
               
                response.sendRedirect("index.jsp");
                break;
            case "Listar":
                //editar
                //AutoDAo.Listar();
                
                
                
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
