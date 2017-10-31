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
import modelo.Cliente;
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
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorRegistroFicha</title>");
            out.println("</head>");
            out.println("<body>");
            if (opcion.equals("Agregar")) {
                String patente = request.getParameter("patente");
                int rut = Integer.parseInt(request.getParameter("rut"));
                char dv = request.getParameter("dv").charAt(0);
                Cliente obj = new ClienteDAO().buscarDatos(rut);
                Auto auto = null;
                Moto moto = null;

                auto = new ControladorDAOTaller().buscarDatosAuto(patente, rut, dv);

                if (auto != null) {
                    String rut0 = rut + "";
                    String dv0 = dv + "";
                    String marca = auto.getMarca();
                    String foto = auto.getFoto();
                    String anyo = auto.getAnyo() + "";
                    String kilometraje = auto.getKilometraje() + "";
                    String tipo_bencina = auto.getTipo_bencina();
                    String cantPuertas = auto.getCantPuertas() + "";
                    String cantAsientos = auto.getCantAsientos() + "";
                    String tipoAuto = auto.getTipoAuto();
                    String cantAirbags = auto.getCantAirbags() + "";
                    String cambiosAutomaticos = auto.getCambiosAutomaticos();
                    String electrico = auto.getElectrico();
                    String direccionAsistida = auto.getDireccionAsistida();
                    String portaEquipaje = auto.getPortaEquipaje();

                    // out.println("<h1>"+auto.toString()+"</h1>");
                    request.setAttribute("marca", marca);
                    request.setAttribute("foto", foto);
                    request.setAttribute("anyo", anyo);
                    request.setAttribute("kilometraje", kilometraje);
                    request.setAttribute("tipo_bencina", tipo_bencina);
                    request.setAttribute("cantPuertas", cantPuertas);
                    request.setAttribute("cantiAsientos", cantAsientos);
                    request.setAttribute("tipoAuto", tipoAuto);
                    request.setAttribute("cantAirbags", cantAirbags);
                    request.setAttribute("cambiosAutomaticos", cambiosAutomaticos);
                    request.setAttribute("electrico", electrico);
                    request.setAttribute("direccionAsistida", direccionAsistida);
                    request.setAttribute("portaEquipaje", portaEquipaje);
                    request.setAttribute("patente", patente);
                    request.setAttribute("rut", rut0);
                    request.setAttribute("dv", dv0);
                    request.getRequestDispatcher("tallerAuto.jsp").forward(request, response);

                }
                moto = new ControladorDAOTaller().buscarDatosMoto(patente, rut, dv);
                if (moto != null) {
                    String rut0 = rut + "";
                    String dv0 = dv + "";
                    String marca = moto.getMarca();
                    String foto = moto.getFoto();
                    String anyo = moto.getAnyo() + "";
                    String kilometraje = moto.getKilometraje() + "";
                    String tipo_bencina = moto.getTipo_bencina();
                    String tipo_moto = moto.getTipomoto();

                    //out.println("<h1>"+moto.toString()+"</h1>");
                    request.setAttribute("marca", marca);
                    request.setAttribute("foto", foto);
                    request.setAttribute("anyo", anyo);
                    request.setAttribute("kilometraje", kilometraje);
                    request.setAttribute("tipo_bencina", tipo_bencina);
                    request.setAttribute("tipo_moto", tipo_moto);
                    request.setAttribute("patente", patente);
                    request.setAttribute("rut", rut0);
                    request.setAttribute("dv", dv0);
                    request.getRequestDispatcher("tallerMoto.jsp").forward(request, response);
                }         

            }
            if (opcion.equals("Actualizar")) {
                
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
