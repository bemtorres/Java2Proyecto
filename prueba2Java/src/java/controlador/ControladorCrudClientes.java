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
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author benja
 */
public class ControladorCrudClientes extends HttpServlet {

    private ArrayList<Cliente> arrayClientes = new ArrayList();

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
        int rut = 0, telefono = 0;

        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorEstadoVehi</title>");
            out.println("</head>");
            out.println("<body>");

            if (opcion.equals("Guardar")) {
                String rutA = request.getParameter("rut");
                char dv = request.getParameter("dv").charAt(0);
                String pNombre = request.getParameter("pNombre");
                String sNombre = request.getParameter("sNombre");
                String apPaterno = request.getParameter("apPaterno");
                String apMaterno = request.getParameter("apMaterno");
                String direccion = request.getParameter("direccion");
                String comuna ="Santiago";
                String email = request.getParameter("email");
                String telefono1 = request.getParameter("telefono");
                String[] miselect = request.getParameterValues("comuna");
                for (int i = 0; i < miselect.length; i++) {
                    comuna = miselect[i];
                }
               
                rut = Integer.parseInt(rutA);
                telefono = Integer.parseInt(telefono1);

                if (rut > 0 && !pNombre.equals("") && !sNombre.equals("") && !apPaterno.equals("") && !apMaterno.equals("")
                        && !direccion.equals("") && !comuna.equals("") && telefono >= 0 && !email.equals("")) {
                    LocalDateTime ahora = LocalDateTime.now();

                    String hoy = (ahora.getYear() + "-" + ahora.getMonthValue() + "-" + ahora.getDayOfMonth());
                    //Modelo Cliente
                    Cliente nuevoCliente = new Cliente(hoy, rut, dv, pNombre, sNombre, apPaterno, apMaterno, direccion, comuna, telefono, email);

                    int estado = new ClienteDAO().agregarDatosPersona(nuevoCliente);
                    if (estado > 0) {
                        int estado1 = new ClienteDAO().agregarDatosCliente(nuevoCliente);
                        out.println("<h1>Cliente agregado...</h1>");
                    } else {
                        out.println("<h1>Cliente NO agregado" + nuevoCliente.toString() + "...</h1>");
                    }
                } else {
                    out.println("<h1>Ingrese datos...</h1>");
                }
            }
            if (opcion.equals("Buscar")) {
                String rutA = request.getParameter("rut");
                char dv = request.getParameter("dv").charAt(0);

                rut = Integer.parseInt(rutA);

                if (rut > 0) {
                    Cliente obj = new ClienteDAO().buscarDatos(rut, dv);
                    if (obj != null) {
                        out.println("<h1>" + obj.toString() + "Cliente encontrado..</h1>");
                    } else {
                        out.println("<h1>Cliente no encontrado..</h1>");
                    }
                } else {
                    out.println("<h1>Faltan parametros...</h1>");
                }
            }
            if (opcion.equals("Modificar")) {
                String rutA = request.getParameter("rut");
                char dv = request.getParameter("dv").charAt(0);
                String pNombre = request.getParameter("pNombre");
                String sNombre = request.getParameter("sNombre");
                String apPaterno = request.getParameter("apPaterno");
                String apMaterno = request.getParameter("apMaterno");
                String direccion = request.getParameter("direccion");
                String comuna = "";
                String email = request.getParameter("email");
                String telefono1 = request.getParameter("telefono");

               String[] miselect = request.getParameterValues("comuna");
                for (int i = 0; i < miselect.length; i++) {
                    comuna = miselect[i];
                }
                

                rut = Integer.parseInt(rutA);
                telefono = Integer.parseInt(telefono1);

                Cliente nuevoClient1 = new Cliente("", rut, dv, pNombre, sNombre, apPaterno, apMaterno, direccion, comuna, telefono, email);

                int estado2 = new ClienteDAO().actualizarDatosPersonaCliente(nuevoClient1);
                if (estado2 > 0) {
                    out.println("<h1>Cliente modificado...</h1>");
                } else {
                    out.println("<h1>Cliente no encontrado...</h1>");
                }
            }
            if (opcion.equals("Eliminar")) {
                int rutA = Integer.parseInt(request.getParameter("rut"));
                char dv1 = request.getParameter("dv").charAt(0);

                int filas1 = new ClienteDAO().eliminarDatosCliente(rutA);

                if (filas1 == 1) {
                    int filas2 = new ClienteDAO().eliminarDatosPersona(rutA, dv1);
                    if (filas2 == 1) {
                        out.println("<h1>Usuario Eliminado existe...</h1>");

                    } else {
                        out.println("<h1>Usuario NO existe 2...</h1>");
                    }
                } else {
                    out.println("<h1>Usuario NO existe " + rutA + "...</h1>");
                }

            }

            if (opcion.equals("Listar")) {
                response.sendRedirect("listadoClientes.jsp");
            }

            out.println("</body>");
            out.println("</html>");
        } catch (Exception ex) {
            response.sendRedirect("errorPagina.jsp");
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
