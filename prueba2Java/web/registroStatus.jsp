<%-- 
    Document   : registroStatus
    Created on : 29-oct-2017, 16:43:17
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
        <h1>REGISTRO ESTADO SERVICIO ALMACENADO</h1>
        <form action="ControladorCerrarSesion" method="POST">
            <input type="submit" value="Cerrar" name="opcion">    
        </form>
        <form action="ControladorStatus" method="Post">            
            Patente: <input type="text" maxlength="6" name="patente">
            <input type="submit" value="Buscar" name="opcion">        
        </form>
        <a href='menuPrincipal.jsp'>volver</a>
    </body>
</html>
