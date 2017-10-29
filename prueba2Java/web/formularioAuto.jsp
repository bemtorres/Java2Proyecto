<%-- 
    Document   : formularioAuto
    Created on : 27-oct-2017, 18:55:19
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
         <h1>FORMULARIO AUTO</h1>
         <form action="ControladorCerrarSesion" method="POST">
            <input type="submit" value="Cerrar" name="opcion">    
        </form>
         <form action="ControladorCrudAuto" method="Post">
            
            Rut: <input type="number" name="usuario">-<input type="text" name="usuario">
            <input type="submit" value="Buscar" name="opcion"> 
            <br>
            <br>
            <br>
            AUTO
            <br>
            Patente: <input type="text" name="patente"><br>
            Marca: <input type="text" name="marca"><br>
            Tipo de Auto: <input type="text" name="tipoAuto"><br>
            Foto: <input type="text" name="foto"><br>
            Año: <input type="text" name="anyo"><br>
            Kilometraje: <input type="number" name="kilometraje"><br>
            Tipo de Bencina <input type="text" name="tipoBencina"><br>
            <br>
            Cantidad Puertas: <input type="text" name="cantPuertas"><br>
            Total asientos: <input type="text" name="totalAsientos"><br>
            Total airbag: <input type="text" name="totalAirbag"><br>
            ¿Cambio automatico?: <input type="text" name="cambioAutomatico"><br>
            ¿Auto electrico? <input type="text" name="autoElectrico"><br>
            ¿Direccion asistida? <input type="text" name="direccionAsistida"><br>
            ¿Portaequipaje?: <input type="number" name="portaEquipaje"><br>           
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
