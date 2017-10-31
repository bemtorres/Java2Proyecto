<%-- 
    Document   : statusMoto
    Created on : 30-10-2017, 21:05:42
    Author     : carlos
--%>

<%@page import="modelo.Vehiculo"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="controlador.EmpleadoDAO"%>
<%@page import="modelo.Empleado"%>
<%@page import="controlador.ClienteDAO"%>
<%@page import="modelo.Cliente"%>
<%@page import="controlador.RegistroTallerDAO"%>
<%@page import="modelo.Moto"%>
<%@page import="controlador.MotoDAO"%>
<%@page import="modelo.FichaReparacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ControladorCerrarSesion" method="POST">
            <input type="submit" value="Cerrar" name="opcion">    
        </form>
        <form action="" method="Post">
            <%    
              String patente = (String)request.getAttribute("patente");      
              FichaReparacion ficha = new  RegistroTallerDAO().buscarDatosPorPatente(patente);  
             // Empleado empleado = new EmpleadoDAO().buscarDatos(ficha.getRutPersona());
             //ficha
             String idFicha = ficha.getIdFicha()+"";
             String rutEmpleado = ficha.getRutPersona()+"";
             String fechaIngreso = ficha.getFechaIngreso()+"";
             String fechaSalida = ficha.getFechaSalida()+"";
             String motivos = ficha.getMotivos()+"";
             String detalles= ficha.getDetalles()+"";
             String horaTrabajo = ficha.getHorasTrabajo()+"";
             String total = ficha.getTotal()+"";
             //moto
             %>
            SERVICIO
            <br>
            <br>
            <br>
            MOTO
            <br>
            Patente: <input type="text" name="patente" value="<%= patente %>" readonly><br>
            <br>
            Fecha Ingreso: <input type="date" value="<%= fechaIngreso  %>" readonly name="fechaIngreso"><br>  
            
            Motivos: <input type="text" name="motivos" value="<%= motivos %>" readonly><br>
            <br>
            <br>
            <br>            
            <br>
            Detalles: <input type="text" name="detalles"  value="<%= detalles %>" required="requiered">  <br>
            Hora Trabajadas:<input type="number" value="<%= horaTrabajo %>" name="hor_trabajo" min="0" max="30" required="requiered">
            <br>
            Total: <%= total %>
            <br> 
            <br>
            <br>
            <br>
            <br>
            <input type="submit" value="Guardar" name="opcion">    
        </form>   
    </body>
</html>
