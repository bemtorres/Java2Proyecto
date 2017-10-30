<%-- 
    Document   : menuPrincipal
    Created on : 27-oct-2017, 18:04:58
    Author     : benja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
                            <input class="waves-effect waves-light btn" type="submit" name="opcion" value="Cerrar"><i class="material-icons right"></i>
                        </form>
                    </li>    
                </ul>              
            </div>
        </nav>          
        <div class="container">
            <div class="section">
                <div class="row">
                    <div class="col s12 center ">   
                        <h3>MENU PRINCIPAL</h3>     
                        <button class="btn-large waves-effect waves-light ">
                            <a href="registroTaller.jsp" class="waves-effect waves-light center deep-orange darken-4 btn"><i class="material-icons left">build</i>Registro Taller</a>
                        </button>   
                        <button class="btn-large waves-effect waves-light">
                            <a href="registroStatus.jsp" class="waves-effect waves-light deep-orange darken-4 btn"><i class="material-icons left">build</i>Actualizar Taller</a>
                        </button> 
                        <br>
                        <br>
                        <h4>Panel Administrativo</h4>                            
                        <button class="btn-large waves-effect waves-light">
                            <a href="formularioCliente.jsp" class="waves-effect waves-light grey btn"><i class="material-icons left">account_circle</i>Clientes</a>
                        </button>
                        <br>
                        <br>
                        <button class="btn-large waves-effect waves-light">
                            <a href="menuVehiculos.jsp" class="waves-effect waves-light grey btn"><i class="material-icons left">directions_car</i><i class="material-icons right">motorcycle</i>Vehiculos</a>
                        </button>                        
                        <br>
                        <br>
                        <button class="btn-large waves-effect waves-light">
                            <a href="reportes.jsp" class="waves-effect waves-light grey btn"><i class="material-icons left">loop</i></i>Reportes</a>
                        </button>                        
                        <br>
                    </div>
                </div>
            </div>
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
