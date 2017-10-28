<%-- 
    Document   : index
    Created on : 27-oct-2017, 16:58:24
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
        <h1>Hello World!</h1>
        <form action="ControladorLogin" method="Post">
         Usuario: <input type="text" name="usuario"><br>
         Password: <input type="password" name="clave"><br> 
         <input type="submit" value="Ingresar" name="opcion">    
         <input type="submit" value="Estado Vehiculo" name="opcion">     
        </form>
    </body>
</html>
