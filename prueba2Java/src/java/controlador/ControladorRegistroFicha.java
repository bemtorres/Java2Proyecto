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
import modelo.Empleado;
import modelo.Moto;
import org.hibernate.validator.constraints.EAN;

/**
 *
 * @author benja
 */
public class ControladorRegistroFicha extends HttpServlet {

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
        String patente = request.getParameter("pantente");
        int rut = Integer.parseInt(request.getParameter("rut"));
        char dv = request.getParameter("dv").charAt(0);

        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorRegistroFicha</title>");
            out.println("</head>");
            out.println("<body>");
            if (opcion.equals("Agregar")) {
                Empleado obj = new EmpleadoDAO().buscarDatos(rut);
                Auto auto = null;
                Moto moto = null;

                auto = new ControladorDAOTaller().buscarDatosAuto(patente, rut, dv);
                moto = new ControladorDAOTaller().buscarDatosMoto(patente, rut, dv);

                if (auto != null) {

                    String marca = auto.getMarca();
                    String foto = auto.getFoto();
                    int anyo = auto.getAnyo();
                    int kilometraje = auto.getKilometraje();
                    String tipo_bencina = auto.getTipo_bencina();
                    int cantPuertas = auto.getCantPuertas();
                    int cantAsientos = auto.getCantAsientos();
                    String tipoAuto = auto.getTipoAuto();
                    int cantAirbags = auto.getCantAirbags();
                    String cambiosAutomaticos = auto.getCambiosAutomaticos();
                    String electrico = auto.getElectrico();
                    String direccionAsistida = auto.getDireccionAsistida();
                    String portaEquipaje = auto.getPortaEquipaje();

                    String rut0 = auto.getRut() + "";

                    request.setAttribute("rut", rut0);
                    request.setAttribute("rut", rut0);
                    request.setAttribute("rut", rut0);
                    request.setAttribute("rut", rut0);
                    request.setAttribute("rut", rut0);
                    request.setAttribute("rut", rut0);
                    request.setAttribute("rut", rut0);
                    request.setAttribute("rut", rut0);
                    
                    

                    request.getRequestDispatcher("tallerAuto.jsp").forward(request, response);
                }

                if (moto != null) {
                    request.getRequestDispatcher("tallerAuto.jsp").forward(request, response);
                }

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
