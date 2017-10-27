<%-- 
    Document   : menuPrincipal
    Created on : 27-oct-2017, 18:04:58
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
        <form action="ControladorMenu" method="Post">
            
         <input type="submit" value="Cerrar" name="opcion">    
         <input type="submit" value="Nueva Orden" name="opcion">   
         <input type="submit" value="Clientes" name="opcion">    
         <input type="submit" value="Vehiculos" name="opcion">           
         <input type="submit" value="Reportes" name="opcion">      
        </form>
    </body>
</html>
