<%-- 
    Document   : statusMoto
    Created on : 30-10-2017, 21:05:42
    Author     : carlos
--%>

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
        <form action="ControladorTallerMoto" method="Post">
            <%    
              String idFicha = (String) request.getAttribute("idFicha"); 
              //String dv = (String) request.getAttribute("dv");
              //el rut del cliente + dv 
              
              
              int idFicha1 =  Integer.parseInt(idFicha);
              
              FichaReparacion ficha= new RegistroTallerDAO().buscarDatosPorId(idFicha1);
              Moto moto = new MotoDAO().buscarDatos(ficha.getPatente());
              Cliente cliente= new ClienteDAO().buscarDatos(moto.getRut());
              Empleado empleado = new EmpleadoDAO().buscarDatos(ficha.getRutPersona());
            %> 
              
            
            SERVICIO
            <br>
            Rut: <input type="text" name="rut" value="<%= cliente.getRut() %>" readonly>-<input type="text" value="<%= cliente.getDv() %>" readonly name="dv"> 
            <br>
            <br>
            <br>
            AUTO
            <br>
            Patente: <input type="text" name="patente" value="<%= ficha.getPatente() %>" readonly><br>
            Marca: <input type="text" name="marca" value="<%= moto.getMarca()  %>" readonly><br>
            Tipo de Moto: <input type="text" name="tipoAuto" value="<%= moto.getTipo_bencina() %>" readonly><br>
            Foto: <input type="text" name="foto" value="<%= moto.getFoto() %>" readonly  ><br>
            Año: <input type="text" value="<%= moto.getAnyo() %>" readonly name="anyo"><br>
            Kilometraje: <input type="text" value="<%= moto.getKilometraje() %>" name="kilometraje"><br>
            Tipo de Bencina <input type="text" value="<%= moto.getTipo_bencina() %>" readonly name="tipoB"><br>
            <br>
            Tipo Moto <input type="text" value="<%= moto.getTipomoto() %>" readonly name="TipoM">
            <br>
            <br>            
            <br>
            <% LocalDateTime ahora = LocalDateTime.now();                    
                    String hoy = (ahora.getYear()+"-"+ahora.getMonthValue()+"-"+ahora.getDayOfMonth());   %>
            Fecha Ingreso: <input type="date" value="<%= hoy  %>" readonly name="fechaIngreso"><br>         
            Motivos: <input type="text" name="motivos" readonly values="<%= ficha.getMotivos() %>" ><br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <input type="submit" value="Guardar" name="opcion">    
        </form>   
    </body>
</html>
