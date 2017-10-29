<%-- 
    Document   : errorLogin
    Created on : 29-oct-2017, 14:27:31
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
                    <form action="ControladorLogin" method="POST">
                        <li class="input-field col s1">
                            <i class="material-icons prefix">account_circle</i>
                            <input id="icon_prefix" type="text" name="usuario">
                            <label for="icon_prefix">Usuario</label>
                        </li>
                        <li class="input-field col s1">                                                       
                            <i class="material-icons prefix">vpn_key</i>
                            <input id="icon_prefix"  type="password" name="clave" >
                            <label for="icon_prefix">Contraseña</label>
                        </li>                     
                        <li class="input-field col s1">
                            <button class="btn waves-effect waves-light btn">
                                <input type="submit" name="opcion" value="Ingresar"><i class="material-icons right"></i>
                            </button>
                        </li> 
                    </form>  
                </ul>              
            </div>
        </nav>
        <div>
            <h1 class="center">ERROR AL INGRESAR CLAVE</h1>
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
                    <a class="grey-text text-lighten-4 right" href="https://bemtorres.github.io"> Integrantes Carlos Orellana & Benjamin Mora</a>           
                </div>
            </div>
        </footer>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>
