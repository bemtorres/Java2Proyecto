<%-- 
    Document   : listarEstadoVehiculo
    Created on : 30-oct-2017, 4:08:23
    Author     : benja
--%>

<%@page import="modelo.FichaReparacion"%>
<%@page import="modelo.Auto"%>
<%@page import="controlador.MotoDAO"%>
<%@page import="modelo.Moto"%>
<%@page import="controlador.AutoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        <title>JSP Page</title>
    </head>
    <body>
         <nav class="teal darken-3" role="navigation">
            <div class="nav-wrapper container">
                <a id="logo-container" href="index.jsp" class="brand-logo">La Tuerca</a>
                <ul class="right hide-on-med-and-down">                                                 
                    <li class="input-field col s1">   
                        <form action="ControladorCerrarSesion" method="POST">                             
                            <input class="btn waves-effect waves-light btn" type="submit" name="opcion" value="Cerrar"><i class="material-icons right"></i>
                        </form>
                    </li>    
                </ul>              
            </div>
        </nav>        
        <table id="listadoVehiculos" class="striped">  
            <thead>
            <h1 class="center"> Lista de Autos<i class="material-icons ">directions_car</i></h1>
            <th> Patente </th>
            <th> Marca </th> 
            <th> Rut </th> 
            <th> Foto </th> 
            <th> Año </th> 
            <th> Kilometraje </th>
            <th> Tipo Bencina </th>
            <th> Cantidad Puertas </th>
            <th> Cantidad Asientos </th>
            <th> Tipo Auto </th>
            <th> Cambios Automaticos </th>
            <th> Eléctrico </th>
        </thead> 
        <tbody>

            <% 
             String patente =(String)request.getAttribute("patente");
             Auto auto = new AutoDAO().buscarDatos(patente);
             Moto moto = new MotoDAO().buscarDatos(patente);
             
            FichaReparacion ficha = new FichaReparacion
             
            for (Auto auto : arrayAutos) {%>
            <tr>                 
                <td><%= auto.getPatente()%></td>
                <td><%= auto.getMarca()%></td>
                <td><%= auto.getRut()%></td>
                <td><%= auto.getFoto()%></td>
                <td><%= auto.getAnyo()%></td>
                <td><%= auto.getKilometraje()%></td>
                <td><%= auto.getTipo_bencina()%></td>
                <td><%= auto.getCantPuertas()%></td>
                <td><%= auto.getCantAsientos()%></td>
                <td><%= auto.getTipoAuto()%></td>
                <td><%= auto.getCambiosAutomaticos()%></td>
                <td><%= auto.getElectrico()%></td>
            </tr>       
        </tbody>
        <%
            }
        %> 
    </table>
        
        
        
        <div class="input-field col s8">
            <a href="menuVehiculos.jsp" class="waves-effect waves-light red btn"><i class="material-icons left">arrow_back</i>Atrás</a>
        </div>
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
