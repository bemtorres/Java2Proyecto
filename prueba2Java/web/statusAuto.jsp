<%-- 
    Document   : statusAuto
    Created on : 30-10-2017, 18:17:16
    Author     : carlos
--%>

<%@page import="controlador.EmpleadoDAO"%>
<%@page import="modelo.Empleado"%>
<%@page import="modelo.Cliente"%>
<%@page import="controlador.ClienteDAO"%>
<%@page import="controlador.ClienteDAO"%>
<%@page import="controlador.AutoDAO"%>
<%@page import="modelo.Auto"%>
<%@page import="controlador.RegistroTallerDAO"%>
<%@page import="modelo.FichaReparacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ControladorCerrarSesion" method="POST">
            <input type="submit" value="Cerrar" name="opcion">    
        </form>
        <form action="" method="Post">
            <%    
              String patente = (String)request.getAttribute("patente");      
              FichaReparacion ficha = new  RegistroTallerDAO().buscarDatosPorPatente(patente);
              Auto auto = new AutoDAO().buscarDatos(patente);  
              Cliente cliente= new ClienteDAO().buscarDatos(auto.getRut());
             // Empleado empleado = new EmpleadoDAO().buscarDatos(ficha.getRutPersona());
              
              //Ficha 
              String idficha = ficha.getIdFicha()+ "";
              String rutEmplado = ficha.getRutPersona() + "";
              String fechaIngreso = ficha.getFechaIngreso()+ "";
              String fechaSalida = ficha.getFechaSalida()+ "";
              String motivos = ficha.getMotivos();
              String detalles = ficha.getDetalles();
              String horaTrabajo = ficha.getHorasTrabajo() +"";
              String total = ficha.getTotal() + "" ;
              //Auto
              String cantPuertas = auto.getCantPuertas() +"";
              String cantAsientos = auto.getCantAsientos()+"";
              String cantAirbag = auto.getCantAirbags()+"";
              String cambioAutomatico = auto.getCambiosAutomaticos();
              String electrico = auto.getElectrico();
              String direAsistida = auto.getDireccionAsistida();
              String portaEquipaje = auto.getPortaEquipaje();              
              String marca = auto.getMarca();
              String foto = auto.getFoto();
              String anyo = auto.getAnyo()+"";
              String kilometraje = auto.getKilometraje()+"";
              String tipobencina = auto.getTipo_bencina();
              String tipoAuto = auto.getTipoAuto();
              //Cliente
              String rutCliente = cliente.getRut()+"";
              String dv = cliente.getDv()+"";
              String nombreCompleto = cliente.getPrimerNombre()+" "+ cliente.getSegundoNombre()+" "+cliente.getApellidoPaterno()+" "+cliente.getApellidoMaterno();
              String telefono = cliente.getTelefono() + " ";
              String email = cliente.getEmail();
           %> 
              
            
            SERVICIO
            <br>
            Rut: <input type="text" name="rut" value="<%= rutCliente %>" readonly>-<input type="text" value="<%= dv %>" readonly name="dv"> 
            Nombre Cliente: <%= nombreCompleto %>
            Telefono:  <%= telefono %>
            Email:  <%= email %>
            <br>
            <br>           
            <br>
            AUTO
            <br>
            Patente: <input type="text" name="patente" value="<%= patente %>" readonly><br>
            Fecha Ingreso: <input type="date" value="<%= fechaIngreso  %>" readonly name="fechaIngreso"><br>         
            Motivos: <input type="text" name="motivos" readonly values="<%= motivos %>" ><br>
            <br>
           
            Marca: <input type="text" name="marca" value="<%= marca  %>" readonly><br>
            Tipo de Auto: <input type="text" name="tipoAuto" value="<%= tipoAuto %>" readonly><br>
            Foto: <input type="text" name="foto" value="<%= foto %>" readonly  ><br>
            Año: <input type="text" value="<%= anyo %>" readonly name="anyo"><br>
            Kilometraje: <input type="text" value="<%= kilometraje %>" name="kilometraje"><br>
            Tipo de Bencina <input type="text" value="<%= tipobencina %>" readonly name="tipoB"><br>
            <br>
            Total asientos: <input type="text" value="<%= cantAsientos %>" readonly name="asientos"><br>
            Total airbag: <input type="text" value="<%= cantAirbag %>" readonly name="air"><br>
            ¿Cambio automatico?: <input type="text" value="<%= cambioAutomatico %>" readonly name="cambioA"><br>
            ¿Auto electrico? <input type="text" value="<%= electrico %>" readonly name="electrico"><br>
            ¿Direccion asistida? <input type="text" value="<%= direAsistida  %>" readonly name="asistida"><br>
            ¿Portaequipaje?: <input type="text" value="<%= portaEquipaje %>" readonly name="porta"><br>
            <br>
            <br>            
            <br>              
            <br>
            <br>            
            Fecha Salida: <input type="date" value=""  name="fechaIngreso">
            <br>
            Mecanico a cargo: 
            Detalles: <input type="text" name="motivos" readonly values="<%= detalles %>" ><br>
            Horas Trabajadas: <input type="text" name="motivos" readonly values="<%= horaTrabajo %>" ><br>
            Total: <%= total %>
            <br>
            <br>
            
            <br>
            <input type="submit" value="Guardar" name="opcion">    
        </form>
    </body>
</html>
