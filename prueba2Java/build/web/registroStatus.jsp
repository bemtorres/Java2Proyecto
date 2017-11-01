<%-- 
    Document   : registroStatus
    Created on : 29-oct-2017, 16:43:17
    Author     : benja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"
              media="screen,projection"/>
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>La Tuerca</title>
    </head>

    <body>
        <nav class="teal darken-3" role="navigation">
            <div class="nav-wrapper container">
                <a id="logo-container" href="index.jsp" class="brand-logo">La Tuerca</a>
                <ul class="right hide-on-med-and-down">                                                 
                    <li class="input-field col s1">   
                        <form action="ControladorCerrarSesion" method="POST">  
                            <li class="input-field col s2">   
                                <button class="btn waves-effect waves-light btn-large" type="submit" name="opcion" value="Cerrar">Cerrar<i class="material-icons right"></i></button>
                            </li> 
                        </form>
                    </li>    
                </ul>              
            </div>
        </nav>

        <div class="container">
            <div class="section">
                <div class="row">
                    <div class="col s12 center "> 
                        <h4>Estado Vehiculo</h4> 
                    </div>
                    <div class="col s12">
                        <br>                        
                        <h5>Busque su vehiculo</h5>
                        <form action="ControladorStatus" method="Post">
                             <% 
                                 String estado = "";
                                 if ((String)request.getAttribute("estado")==null) {
                                         estado = "*Ingrese patente";
                                 }
                                 else{
                                     estado = (String)request.getAttribute("estado");
                                 }
                                 
                             %>
                            <div class="input-field col s8">
                                <i class="material-icons prefix">directions_car</i>
                                <input type="text" maxlength="6" required="required" name="patente">                                
                                <label for="icon_prefix">Ingrese pantente del vehiculo</label>
                                 <h6 class="red-text" ><%= estado %></h6>
                            </div>
                           
                           
                            <div class="row">
                                    <div class="row">
                                         <button class="btn-large waves-effect waves-light cyan" type="submit" name="opcion" value="Buscar">Buscar<i class="material-icons right">motorcycle</i></button>
                                    </div>  
                                </div> 
                        </form>
                        <div class="input-field col s8">
                            <a href="menuPrincipal.jsp" class="waves-effect waves-light red btn"><i class="material-icons left">arrow_back</i>Atrás</a>
                        </div>
                    </div>

                </div>
            </div>
        </div>         




        <footer class="page-footer teal grey darken-3">
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
