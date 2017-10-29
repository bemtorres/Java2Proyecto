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
        <form action="ControladorCerrarSesion" method="POST">
            <input type="submit" value="Cerrar" name="opcion">    
        </form>
        <form action="ControladorTallerMoto" method="Post"> 
            <%    
              String marca = (String) request.getAttribute("marca");
              String foto = (String) request.getAttribute("foto");
              String anuo = (String) request.getAttribute("anyo");
              String kilo = (String) request.getAttribute("kilometraje");
              String tipoB = (String) request.getAttribute("tipo_bencina");
              String tipoM = (String) request.getAttribute("tipo_moto");
              String patente = (String) request.getAttribute("patente");
              String rut = (String) request.getAttribute("rut"); 
              String dv = (String) request.getAttribute("dv");  %> 
             Rut: <input type="text" name="usuario" value="<%= rut %>" readonly>-<input type="text" value="<%= dv %>" readonly name="usuario"> 
            <br>
            <br>
            <br>
            Moto
            <br>
            Patente: <input type="text" name="patente" value="<%= patente %>" readonly><br>
            Marca: <input type="text" name="marca" value="<%= marca %>" readonly><br>
            Tipo de Moto: <input type="text" name="tipoAuto" value="<%= tipoM %>" readonly><br>
            Foto: <input type="text" name="foto" value="<%= foto %>" readonly  ><br>
            Año: <input type="text" value="<%= anuo %>" readonly name="anyo"><br>
            Kilometraje: <input type="text" value="<%= kilo %>" readonly name="kilometraje"><br>
            Tipo de Bencina <input type="text" value="<%= tipoB %>" readonly name="tipo_bencina"><br>
            <br>
            <br>
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
            Total de horas de trabajo: <input type="number" value="0" name="direccion"><br>
            Total <input type="number" value="0" name="comuna"><br>
            <br>
            <br>
            <input type="submit" value="Guardar" name="opcion">    
            <input type="submit" value="Actualizar" name="opcion"> 
            <input type="submit" value="Cancelar" name="opcion">   
        </form>
    </body>
</html>
