<%-- 
    Document   : estadoVehiculo
    Created on : 27-oct-2017, 18:09:57
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
            </div>
        </nav>   
        <div class="container">
            <div class="section">
                <div class="row">
                    <div class="col s12 center "> 
                        <h4>Estado Vehiculo</h4> 
                    </div>
                    <div class="col s6">
                        <br>
                        <h5>Busque su vehiculo</h5>
                        <form action="ControladorEstadoVehi" method="Post">
                            <div class="input-field col s8">
                                <i class="material-icons prefix">directions_car</i>
                                <input id="icon_prefix"  type="text" maxlength="6" name="patente" >
                                <label for="icon_prefix">Ingrese pantente del vehiculo</label>
                            </div>                                
                            <div class="input-field col s8">  
                                <input class="btn-large waves-effect waves-light cyan" type="submit" name="opcion" value="Buscar"><i class="material-icons blue-grey"></i>
                            </div> 
                        </form>
                        <div class="input-field col s8">
                            <a href="index.jsp" class="waves-effect waves-light red btn"><i class="material-icons left">arrow_back</i>Atrás</a>
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
