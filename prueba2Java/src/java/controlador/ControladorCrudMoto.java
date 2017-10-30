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
import modelo.Moto;
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
        
        
        try  {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorEstadoVehi</title>");            
            out.println("</head>");
            out.println("<body>");
            
            if(opcion.equals("Agregar")){
                int rut = Integer.parseInt(request.getParameter("rut"));
                String patente = request.getParameter("patente");
                String marca = request.getParameter("marca");
                String foto = request.getParameter("foto");
                int anyo = Integer.parseInt(request.getParameter("anyo"));
                int kilometraje = Integer.parseInt(request.getParameter("kilometraje"));
                String tipo_bencina = request.getParameter("tipoBencina");
                String tipomoto =  request.getParameter("tipoMoto");
                
                Moto motito= new Moto(tipomoto, patente, marca, rut, foto, anyo, kilometraje, tipo_bencina);
                
                int estado = new MotoDAO().agregarDatosVehiculo(motito);
                
                if (estado > 0) {
                        int estado1 = new MotoDAO().agregarDatosMoto(motito);
                        out.println("<h1>Moto agregada...</h1>");
                    } else {
                        out.println("<h1>Moto no agregada...</h1>");
                    }
            }
            
            if(opcion.equals("Eliminar"))
            {
                String patenteE = request.getParameter("patente");
                int filas1 = new MotoDAO().eliminarDatosVehiculo(patenteE);

                if (filas1 == 1) {
                    int filas2 = new MotoDAO().eliminarDatos(patenteE);
                    if (filas2 == 1) {
                        out.println("<h1>Moto Eliminado existe...</h1>");

                    } else {
                        out.println("<h1>Moto NO existe 2...</h1>");
                    }
                } else {
                    out.println("<h1>Usuario NO existe " + patenteE + "...</h1>");
                }
            }
            
            if(opcion.equals("Buscar"))
            {
                String patenteB = request.getParameter("patente");
                
                if(!patenteB.equals(""))
                {
                    Moto obj = new MotoDAO().buscarDatos(patenteB);
                    if(obj != null)
                    {
                        out.println("<h1>" + obj.toString() + "Moto encontrado..</h1>");
                    }else
                    {
                        out.println("<h1>Moto no encontrado..</h1>");
                    }  
                }else{
                    out.println("<h1>Faltan parametros...</h1>");
                }
            }
            
            if(opcion.equals("Modificar"))
            {
                int rut = Integer.parseInt(request.getParameter("rut"));
                String patente = request.getParameter("patente");
                String marca = request.getParameter("marca");
                String foto = request.getParameter("foto");
                int anyo = Integer.parseInt(request.getParameter("anyo"));
                int kilometraje = Integer.parseInt(request.getParameter("kilometraje"));
                String tipo_bencina = request.getParameter("tipoBencina");
                String tipomoto =  request.getParameter("tipoMoto");
                
                Moto moto = new Moto(tipomoto, patente, marca, rut, foto, anyo, kilometraje, tipo_bencina);
                int estado2 =new  MotoDAO().actualizarDatosMoto(moto);
                if(estado2 > 0)
                {
                    out.println("<h1>Moto modificado...</h1>");
                }else {
                    out.println("<h1>Cliente no encontrado...</h1>");
                }
            }
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

    private Object MotoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
