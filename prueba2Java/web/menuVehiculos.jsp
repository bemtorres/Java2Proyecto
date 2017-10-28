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
        <form action="ControladorMenuVehiculo" method="Post">    
             <input type="submit" value="Cerrar" name="opcion">  
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
