<%-- 
    Document   : listadoClientes
    Created on : 28-oct-2017, 17:15:38
    Author     : benja
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.ClienteDAO"%>
<%@page import="modelo.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Resumen de Ventas</h1>
        <table id="listadoClientres">
            <tr>
                <td>Fecha Asociacion </td>            
                <td>Rut</td>
                <td>Nombre Completo</td>
                <td>Direccion</td>
                <td>Comuna</td>
                <td>Telefono</td>
                <td>Email</td>
            </tr>
            <% ArrayList<Cliente>  arrayClientes = new  ArrayList(); %>
            <% arrayClientes =new  ClienteDAO().mostrarDatos();
               
            for(Cliente cli: arrayClientes){%>
            <tr>                 
                <% String rut = cli.getRut()+"-"+cli.getDv();
                   String nombreCompleto = cli.getPrimerNombre()+" "+ cli.getSegundoNombre()+" "+ cli.getApellidoPaterno()+" "+cli.getApellidoMaterno();
                %>
                <td><%=cli.getFechaAsociacion()%></td>
                <td><%=rut%></td>
                <td><%=nombreCompleto%></td>
                <td><%=cli.getDireccion()%></td>
                <td><%=cli.getComuna()%></td>
                <td><%=cli.getTelefono()%></td>
                <td><%=cli.getEmail()%></td>
            </tr>
            <%
            }
         %>         
        </table>    
        <a href="formularioCliente.jsp">volver</a>
    </body>
</html>
