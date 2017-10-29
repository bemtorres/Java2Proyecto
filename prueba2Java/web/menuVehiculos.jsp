<%-- 
    Document   : menuVehiculos
    Created on : 27-oct-2017, 18:51:34
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
        <h1>MENU VEHICULOS</h1>
        <form action="ControladorCerrarSesion" method="POST">

            <input type="submit" value="Cerrar" name="opcion">    
        </form>
        <form action="ControladorMenuVehiculo" method="Post">   
        <br>
            Ingrese Cliente
        </br>    
            Rut: <input type="number" name="usuario" maxlength="8">-<input type="text" name="usuario" maxlength="1">
            <br>
            <br>
            <br>
            <br>

            Tipo de Vehiculo
            <input type="submit" value="Auto" name="opcion">    
            <input type="submit" value="Moto" name="opcion">     
            <br>       
            
            <br>

           <input type="submit" value="Atras" name="opcion">   
        </form>
    </body>
</html>
