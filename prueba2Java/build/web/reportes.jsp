<%-- 
    Document   : reportes
    Created on : 27-oct-2017, 21:11:33
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
        <h1>REPORTES</h1>
        <form action="ControladorCerrarSesion" method="POST">
            <input type="submit" value="Cerrar" name="opcion">    
        </form>
        <form action='ControladorRegistro' method="Post">
              <br>  <br>  <br>  <br>  <br>  <br>
               
           <br>  <br>  <br>  <br>  <br>  <br>
           <input type="submit" value="Atras" name="opcion">     
        </form>
        <form action='ControladorTallerAuto' method="Post">
            <input type="submit" value="Cerrar" name="opcion"> 
              <br>  <br>  <br>  <br>  <br>  <br>
               
           <br>  <br>  <br>  <br>  <br>  <br>
           <input type="submit" value="Atras" name="opcion">     
        </form>
    </body>
</html>
