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
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"
              media="screen,projection"/>
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="images/favicon-32x32.png" sizes="32x32">
        <title>La Tuerca</title>
    </head>
    <body>
        <form action="ControladorCerrarSesion" method="POST">
            <input type="submit" value="Cerrar" name="opcion">    
        </form>
        <form action="" method="Post">
            <%
                String patente = (String) request.getAttribute("patente");
                FichaReparacion ficha = new RegistroTallerDAO().buscarDatosPorPatente(patente);
                Auto auto = new AutoDAO().buscarDatos(patente);

                //Ficha 
                String idficha = ficha.getIdFicha() + "";
                String rutEmplado = ficha.getRutPersona() + "";
                String fechaIngreso = ficha.getFechaIngreso() + "";
                String fechaSalida = ficha.getFechaSalida() + "";
                String motivos = ficha.getMotivos();
                String detalles = ficha.getDetalles();
                String horaTrabajo = ficha.getHorasTrabajo() + "";
                String total = ficha.getTotal() + "";
                //Auto
                String cantPuertas = auto.getCantPuertas() + "";
                String cantAsientos = auto.getCantAsientos() + "";
                String cantAirbag = auto.getCantAirbags() + "";
                String cambioAutomatico = auto.getCambiosAutomaticos();
                String electrico = auto.getElectrico();
                String direAsistida = auto.getDireccionAsistida();
                String portaEquipaje = auto.getPortaEquipaje();
                String marca = auto.getMarca();
                String foto = auto.getFoto();
                String anyo = auto.getAnyo() + "";
                String kilometraje = auto.getKilometraje() + "";
                String tipobencina = auto.getTipo_bencina();
                String tipoAuto = auto.getTipoAuto();

            %> 


            SERVICIO
            <%= idficha%>
            SERVICIO
            <br>
           
            <br>
            <br>           
            <br>
            AUTO
            <br>
            Patente: <input type="text" name="patente" value="<%= patente%>" readonly><br>
            Fecha Ingreso: <input type="date" name="fechaIngreso" value="<%= fechaIngreso%>" readonly ><br>         
            Motivos: <input type="text" name="motivos"  value="<%= motivos%>" readonly ><br>
            <br>

            AUTO
            <br>
            Patente: <input type="text" name="patente" value="<%= patente %>" readonly><br>
            <br>
            <br>            
            <br>              
            <br>
            <br>            
            Fecha Salida: <input type="date" value=""  name="fechaIngreso">
            <br>
            Mecanico a cargo: 
            Detalles: <input type="text" name="detalles" required="required" value="<%= detalles%>" ><br>
            Horas Trabajadas: <input type="number" name="motivos" min="0" max="30" value="<%= horaTrabajo%> "required="required" > <br>
            Total: <%= total%>
            <br>
            <br> 

            <br>
            <input type="submit" value="Guardar" name="opcion">    
        </form>
        <footer class="page-footer grey darken-3">
            <div class="container">
                <div class="row">
                    <div class="col l6 s12">
                        <h5 class="white-text">Acerca de</h5>
                        <p class="grey-text text-lighten-4"></p>
                    </div>              
                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    © 2017 prueba de Desarrollo en Java
                    <a class="grey-text text-lighten-4 right" href="https://bemtorres.github.io" target="_blank"> Integrantes Carlos Orellana & Benjamin Mora</a>           
                </div>
            </div>
        </footer>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>      
    </body>
</html>
