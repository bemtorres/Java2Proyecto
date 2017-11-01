<%-- 
    Document   : menuVehiculos
    Created on : 27-oct-2017, 18:51:34
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
                            <button class="btn waves-effect waves-light btn-large" type="submit" name="opcion" value="Cerrar">Cerrar<i class="material-icons right"></i></button>
                        </form>
                    </li>    
                </ul>              
            </div>
        </nav>    
        <div class="container">
            <div class="section">                
                <div class="row">                  
                    <h3  class="center">Panel para agregar un Vehiculos a un Cliente</h3>                       
                    <div class="col s12 center ">  
                        <p  class="center">Agregar vehiculo a un cliente</p> 
                        <form  class="center" action="ControladorMenuVehiculo" method="POST">                                                              <%
                            String estado = "";
                            if ((String) request.getAttribute("estado") == null) {
                                estado = "*Ingrese los datos";
                            } else {
                                estado = (String) request.getAttribute("estado");
                            }
                            %>
                            <h5 class="red-text">Ingrese rut</h5> 
                            <div class="input-field center col s12">
                                <div class="input-field col s3">                                           
                                    <i class="material-icons prefix">portrait</i> 
                                    <input id="rut" type="number" name="rut"  value="0" required="required" class="validate">
                                    <label for="last_name">Rut</label>
                                    <h6 class="red-text" ><%= estado%></h6>
                                </div>
                                <div class="input-field col s1">                               
                                    <input id="dv" type="text" name="dv" maxlength="1" required="required" class="validate">
                                    <label for="last_name">Digito</label>                                        
                                </div>  
                            </div>
                            <div class="input-field col s5">
                                <button class="btn-large waves-effect waves-light cyan" type="submit" name="opcion" value="AUTO">AUTO<i class="material-icons right">directions_car</i></button>
                                <button class="btn-large waves-effect waves-light cyan" type="submit" name="opcion" value="MOTO">MOTO<i class="material-icons right">motorcycle</i></button>
                            </div> 
                        </form>                            
                    </div>
                                <br><br>            
                    <h5  class="center">Ver Vehiculos</h5>      
                    <div class="col s12 center ">   
                        <a href="listarVehiculos.jsp" class="waves-effect waves-light grey btn-large"><i class="material-icons left">loop</i></i>Listar Vehiculos</a>
                    </div>                                           
                </div>                           
            </div> 
        </div>
        <div>
            <a href="menuPrincipal.jsp" class="waves-effect waves-light red btn"><i class="material-icons left">arrow_back</i>Atrás</a>
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
