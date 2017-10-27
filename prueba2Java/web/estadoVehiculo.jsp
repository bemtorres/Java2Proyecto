<%-- 
    Document   : estadoVehiculo
    Created on : 27-oct-2017, 18:09:57
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
         <h1>Estado vehiculos</h1>
        <form action="ControladorEstadoVehi" method="Post">
         patente: <input type="text" name="usuario"><br>         
         <input type="submit" value="Ingresar" name="opcion">    
         <input type="submit" value="Atras" name="opcion">     
        </form>
    </body>
</html>
