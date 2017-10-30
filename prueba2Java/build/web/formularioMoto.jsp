<%-- 
    Document   : formularioMoto
    Created on : 27-oct-2017, 18:55:08
    Author     : benja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>FORMULARIO MOTO</h1>
        <form action="ControladorCerrarSesion" method="POST">
            <%
                String rut = (String) request.getAttribute("rut");
                String dv = (String) request.getAttribute("dv");
            %>
            <h1> el rut es: <%= rut%> - <%= dv%> </h1>
            <input type="submit" value="Cerrar" name="opcion">    
        </form>
        <form action="ControladorCrudMoto" method="Post">            
            Rut: <input type="text" name="rut" maxlength="8" readonly value="<%= rut%>">-<input type="text" name="dv" maxlength="1" readonly value="<%= dv%>" >
            <input type="submit" value="Buscar" name="opcion"> 
            <br>
            <br>
            <br>
            MOTO
            <br>
            Patente: <input type="text" name="patente"><br>
            Marca: <input type="text" name="marca"><br>
            Tipo de Moto: <input type="text" name="tipoMoto"><br>
            Foto: <input type="text" name="foto"><br>
            Año: <input type="number" name="anyo"><br>
            Kilometraje: <input type="number" name="kilometraje"><br>
            Tipo de Bencina <input type="text" name="tipoBencina"><br>
            <br>
            <br> 
            <input type="submit" value="Agregar" name="opcion">    
            <input type="submit" value="Buscar" name="opcion">           
            <input type="submit" value="Eliminar" name="opcion">    
            <input type="submit" value="Modificar" name="opcion">          
            <input type="submit" value="Listar" name="opcion">                
            <input type="submit" value="Cancelar" name="opcion">    
        </form>
    </body>
</html>
