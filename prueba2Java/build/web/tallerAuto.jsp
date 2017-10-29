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
            <%    
              String marca = (String) request.getAttribute("marca");
              String foto = (String) request.getAttribute("foto");
              String anuo = (String) request.getAttribute("anyo");
              String kilo = (String) request.getAttribute("kilometraje");
              String tipoB = (String) request.getAttribute("tipo_bencina");
              String canP = (String) request.getAttribute("cantPuertas");
              String canA = (String) request.getAttribute("cantiAsientos");
              String tipoA = (String) request.getAttribute("tipoAuto");
              String canAir = (String) request.getAttribute("cantAirbags");
              String cambi = (String) request.getAttribute("cambiosAutomaticos");
              String elec = (String) request.getAttribute("electrico");
              String dire = (String) request.getAttribute("direccionAsistida");
              String porta = (String) request.getAttribute("portaEquipaje");
              String patente = (String) request.getAttribute("patente");
              String rut = (String) request.getAttribute("rut"); 
              String dv = (String) request.getAttribute("dv");  %> 
            
            SERVICIO
            <br>
            Rut: <input type="text" name="usuario" value="<%= rut %>" readonly>-<input type="text" value="<%= dv %>" readonly name="usuario"> 
            <br>
            <br>
            <br>
            AUTO
            <br>
            Patente: <input type="text" name="patente" value="<%= patente %>" readonly><br>
            Marca: <input type="text" name="marca" value="<%= marca %>" readonly><br>
            Tipo de Auto: <input type="text" name="tipoAuto" value="<%= tipoA %>" readonly><br>
            Foto: <input type="text" name="foto" value="<%= foto %>" readonly  ><br>
            Año: <input type="text" value="<%= anuo %>" readonly name="anyo"><br>
            Kilometraje: <input type="text" value="<%= kilo %>" readonly name="kilometraje"><br>
            Tipo de Bencina <input type="text" value="<%= tipoB %>" readonly name="tipo_bencina"><br>
            <br>
            Total asientos: <input type="text" value="<%= canA %>" readonly name="asientos"><br>
            Total airbag: <input type="text" value="<%= canAir %>" readonly name="air"><br>
            ¿Cambio automatico?: <input type="text" value="<%= cambi %>" readonly name="cambioA"><br>
            ¿Auto electrico? <input type="text" value="<%= elec %>" readonly name="electrico"><br>
            ¿Direccion asistida? <input type="text" value="<%= dire %>" readonly name="asistida"><br>
            ¿Portaequipaje?: <input type="text" value="<%= porta %>" readonly name="portaequipaje"><br>
            <br>
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
        </form>      
            <a href="registroTaller.jsp">volver</a>
    </body>
</html>
