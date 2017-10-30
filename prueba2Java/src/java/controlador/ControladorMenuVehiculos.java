package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import controlador.ClienteDAO;
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
public class ControladorMenuVehiculos extends HttpServlet {

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
        int rut = 0;
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorMenuVehiculos</title>");
            out.println("</head>");
            out.println("<body>");
            switch (opcion) {
                case "Moto":
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

                    /*   Cliente obj1 = new ClienteDAO().buscarDatos(rut, dv);
                    if (obj1 != null) {
                        request.setAttribute("rut", rut);
                        request.setAttribute("dv", dv);
                        request.getRequestDispatcher("formularioMoto.jsp").forward(request, response);
                    } else {
                        out.println("<h1> Errror, no se ha encontrado el cliente 123 " + obj1.toString() + "</h1>");
                    }*/
                    break;
                case "Auto":
                    String rutb = request.getParameter("rut");
                    char dv1 = request.getParameter("dv").charAt(0);

                    rut = Integer.parseInt(rutb);

                    if (rut > 0) {
                        Cliente obj1 = new ClienteDAO().buscarDatos(rut, dv1);
                        if (obj1 != null) {
                            out.println("<h1>" + obj1.toString() + "Cliente encontrado..</h1>");
                        } else {
                            out.println("<h1>Cliente no encontrado..</h1>");
                        }
                    } else {
                        out.println("<h1>Faltan parametros...</h1>");
                    }
                    /* int rut3 = Integer.parseInt(rut5);
                    char dv3 = dv5.charAt(0);
                    Cliente obj = new ClienteDAO().buscarDatos(rut3, dv3);
                    if (obj != null) {
                        request.setAttribute("rut", rut3);
                        request.setAttribute("dv", dv3);
                        request.getRequestDispatcher("formularioAuto.jsp").forward(request, response);
                    } else {
                        out.println("<h1> Errror, no se ha encontrado el cliente. 123</h1>");
                    }*/
                    break;

            }
            out.println("<h1>Servlet ControladorMenuVehiculos at " + request.getContextPath() + "</h1>");
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
