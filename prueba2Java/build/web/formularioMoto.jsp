<%-- 
    Document   : formularioMoto
    Created on : 27-oct-2017, 18:55:08
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
        <h1>FORMULARIO MOTO</h1>
        <form action="ControladorCrudMoto" method="Post">
            <input type="submit" value="Cerrar" name="opcion"> <br>  
            Rut: <input type="number" name="usuario">-<input type="text" name="usuario">
            <input type="submit" value="Buscar" name="opcion"> 
            <br>
            <br>
            <br>
            MOTO
            <br>
            Patente: <input type="text" name="pNombre"><br>
            Marca: <input type="text" name="sNombre"><br>
            Tipo de Moto: <input type="text" name="sNombre"><br>
            Foto: <input type="text" name="apPaterno"><br>
            Año: <input type="text" name="apMaterno"><br>
            Kilometraje: <input type="number" name="direccion"><br>
            Tipo de Bencina <input type="text" name="comuna"><br>
            <br>
            <br> 
            <input type="submit" value="Agregar" name="opcion">    
            <input type="submit" value="Buscar" name="opcion">           
            <input type="submit" value="Eliminar" name="opcion">    
            <input type="submit" value="Modificar" name="opcion">          
            <input type="submit" value="Listar" name="opcion">                
            <input type="submit" value="Cancelar" name="opcion">    
        </form>
    </body>
</html>
