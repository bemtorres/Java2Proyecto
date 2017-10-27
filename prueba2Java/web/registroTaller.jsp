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
        <form action="ControladorRegistro" method="Post">
            <input type="submit" value="Cerrar" name="opcion"> 
              <br>  <br>  <br>  <br>  <br>  <br>
            Patente: <input type="text" name="usuario"><br>
            
            <input type="submit" value="Agregar" name="opcion">    
            <br>  <br>  <br>  <br>  <br>  <br>
            Tipo de Vehiculo
            <input type="submit" value="Auto" name="opcion">    
            <input type="submit" value="Moto" name="opcion">           
          
        </form>
    </body>
</html>
