<%-- 
    Document   : tallerMoto
    Created on : 27-oct-2017, 20:21:11
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
        <h1>TALLER MOTO</h1>
        <form action="ControladorCrudClientes" method="Post">
         <input type="submit" value="Cerrar" name="opcion">    
         Rut: <input type="number" name="usuario"><br>
         Dv: <input type="text" name="usuario"><br>
         Primero Nombre: <input type="text" name="pNombre"><br>
         Segundo Nombre: <input type="text" name="sNombre"><br>
         Apellido Paterno: <input type="text" name="apPaterno"><br>
         Apellido Materno: <input type="text" name="apMaterno"><br>
         Dirección: <input type="text" name="direccion"><br>
         Comuna: <input type="text" name="comuna"><br>
         Telefono: <input type="tel" name="telefono"><br>
         Email: <input type="email" name="email"><br>
         
         <input type="submit" value="Agregar" name="opcion">    
         <input type="submit" value="Buscar" name="opcion">           
         <input type="submit" value="Eliminar" name="opcion">    
         <input type="submit" value="Modificar" name="opcion">          
         <input type="submit" value="Listar" name="opcion">                
         <input type="submit" value="Cancelar" name="opcion"> 
        </form>
    </body>
</html>
