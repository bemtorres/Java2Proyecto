<%-- 
    Document   : tallerAuto
    Created on : 27-oct-2017, 20:19:37
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
        <h1>Taller Auto</h1>
        <form action="ControladorCerrarSesion" method="POST">
            <input type="submit" value="Cerrar" name="opcion">    
        </form>
        <form action="ControladorTallerAuto" method="Post">
            Rut: <input type="number" name="usuario">-<input type="text" name="usuario">
            <input type="submit" value="Buscar" name="opcion"> 
            <br>
            <br>
            <br>
            AUTO
            <br>
            Patente: <input type="text" name="pNombre"><br>
            Marca: <input type="text" name="sNombre"><br>
            Tipo de Auto: <input type="text" name="sNombre"><br>
            Foto: <input type="text" name="apPaterno"><br>
            Año: <input type="text" name="apMaterno"><br>
            Kilometraje: <input type="number" name="direccion"><br>
            Tipo de Bencina <input type="text" name="comuna"><br>
            <br>
            Total asientos: <input type="text" name="pNombre"><br>
            Total airbag: <input type="text" name="sNombre"><br>
            ¿Cambio automatico?: <input type="text" name="sNombre"><br>
            ¿Auto electrico? <input type="text" name="apPaterno"><br>
            ¿Direccion asistida? <input type="text" name="apMaterno"><br>
            ¿Portaequipaje?: <input type="number" name="direccion"><br>
            <br>
            SERVICIO
            <br>            
            <br>
            Fecha Ingreso: <input type="date" name="pNombre"><br>         
            Motivos: <input type="text" name="sNombre"><br>
            <br>
            <br>
            <br>
            Detalles tecnicos
            <br>
            Fecha Salida: <input type="date" name="sNombre"><br>
            Detalles: <input type="text" name="apPaterno"><br>
            Repuestos Utilizados: <input type="text" name="apMaterno"><br>
            Total de horas de trabajo: <input type="number" name="direccion"><br>
            Total <input type="number" name="comuna"><br>
            <br>
            <br>
            <input type="submit" value="Guardar" name="opcion">    
            <input type="submit" value="Actualizar" name="opcion"> 
            <input type="submit" value="Cancelar" name="opcion">   
        </form>        
    </body>
</html>
