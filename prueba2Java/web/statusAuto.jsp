<%-- 
    Document   : statusAuto
    Created on : 30-10-2017, 18:17:16
    Author     : carlos
--%>

<%@page import="controlador.EmpleadoDAO"%>
<%@page import="modelo.Empleado"%>
<%@page import="modelo.Cliente"%>
<%@page import="controlador.ClienteDAO"%>
<%@page import="controlador.ClienteDAO"%>
<%@page import="controlador.AutoDAO"%>
<%@page import="modelo.Auto"%>
<%@page import="controlador.RegistroTallerDAO"%>
<%@page import="modelo.FichaReparacion"%>
<%@page import="java.time.LocalDateTime"%>
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
        <form action="ControladorTallerAuto" method="Post">
            <%    
              String patente = (String)request.getAttribute("patente");      
              FichaReparacion ficha = new  RegistroTallerDAO().buscarDatosPorPatente(patente);
              Auto auto = new AutoDAO().buscarDatos(patente);  
              Cliente cliente= new ClienteDAO().buscarDatos(auto.getRut());
              //Empleado empleado = new EmpleadoDAO().buscarDatos(ficha.getRutPersona());
                         
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
            Marca: <input type="text" name="marca" value="<%= auto.getMarca()  %>" readonly><br>
            Tipo de Auto: <input type="text" name="tipoAuto" value="<%= auto.getTipo_bencina() %>" readonly><br>
            Foto: <input type="text" name="foto" value="<%= auto.getFoto() %>" readonly  ><br>
            Año: <input type="text" value="<%= auto.getAnyo() %>" readonly name="anyo"><br>
            Kilometraje: <input type="text" value="<%= auto.getKilometraje() %>" name="kilometraje"><br>
            Tipo de Bencina <input type="text" value="<%= auto.getTipo_bencina() %>" readonly name="tipoB"><br>
            <br>
            Total asientos: <input type="text" value="<%= auto.getCantAsientos() %>" readonly name="asientos"><br>
            Total airbag: <input type="text" value="<%= auto.getCantAirbags() %>" readonly name="air"><br>
            ¿Cambio automatico?: <input type="text" value="<%= auto.getCambiosAutomaticos() %>" readonly name="cambioA"><br>
            ¿Auto electrico? <input type="text" value="<%= auto.getElectrico() %>" readonly name="electrico"><br>
            ¿Direccion asistida? <input type="text" value="<%= auto.getDireccionAsistida() %>" readonly name="asistida"><br>
            ¿Portaequipaje?: <input type="text" value="<%= auto.getPortaEquipaje() %>" readonly name="porta"><br>
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
