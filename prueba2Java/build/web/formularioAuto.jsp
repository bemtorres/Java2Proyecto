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
            <%
            String rut =(String)request.getAttribute("rut");
            String dv = (String)request.getAttribute("dv");
            %>
            <h1> el rut es: <%= rut %> - <%= dv %> </h1>
            Rut: <input type="text" name="rut" maxlength="8" readonly value="<%= rut %>">-<input type="text" name="dv" maxlength="1" readonly value="<%= dv %>" >
            <br>
            <br>
            <br>
            AUTO
            <br>
            Patente: <input type="text" name="patente" maxlength="6"><br>
            Marca: <input type="text" name="marca"><br>
            Tipo de Auto: <input type="text" name="tipoAuto"><br>
            Foto: <input type="text" name="foto"><br>
            Año: <input type="number" name="anyo" value="2000" maxlength="4"><br>
            Kilometraje: <input type="number" name="kilometraje" value="0"><br>
            Tipo de Bencina <input type="text" name="tipoBencina"><br>
            <br>
            Cantidad Puertas: <input type="number" name="cantPuertas" max="5" value="0"><br>
            Total asientos: <input type="number" name="totalAsientos" max="8" value="0"><br>
            Total airbag: <input type="number" name="totalAirbag" max="2" value="0"><br>
            ¿Cambio automatico?: <input type="text" name="cambioAutomatico" ><br>
            ¿Auto electrico? <input type="text" name="autoElectrico"><br>
            ¿Direccion asistida? <input type="text" name="direccionAsistida"><br>
            ¿Portaequipaje?: <input type="text" name="portaEquipaje"><br>           
            <br>
            <br>
            <input type="submit" value="Agregar" name="opcion">            
            <input type="submit" value="Eliminar" name="opcion">    
            <input type="submit" value="Modificar" name="opcion">  
        </form>
    </body>
</html>
