<%-- 
    Document   : registroTaller
    Created on : 27-oct-2017, 18:45:07
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
        <h1>REGISTRO TALLER</h1>
        <form action="ControladorCerrarSesion" method="POST">
            <input type="submit" value="Cerrar" name="opcion">    
        </form>
        <form action="ControladorRegistroFicha" method="Post">
            <br>  <br>  <br>  <br>  <br>  <br>
            Rut: <input type="number" value="0" name="rut" min="1111111" max="99999999" required="required">-<input type="text" name="dv" maxlength="1">
            <br>
            Patente: <input type="text" maxlength="6" name="patente"><br>
            <input type="submit" value="Agregar" name="opcion">        
        </form>
        <a href='menuPrincipal.jsp'>volver</a>
    </body>
</html>
