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
       <h1>MENU PRINCIPAL</h1>
       <form action="ControladorCerrarSesion" method="POST">
            <input type="submit" value="Cerrar" name="opcion">    
        </form>
        <form action="ControladorMenu" method="Post">       
            <h1>Panel taller</h1>
         <input type="submit" value="Nueva Orden" name="opcion">          
         <input type="submit" value="Orden Status" name="opcion"> 
         <br>
         <br>
         <h1>Panel administrado</h1>
         <br>
         <input type="submit" value="Clientes" name="opcion">    
         <input type="submit" value="Vehiculos" name="opcion">           
         <input type="submit" value="Reportes" name="opcion">   
                
        </form>
    </body>
</html>
