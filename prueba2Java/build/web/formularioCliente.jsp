<%-- 
    Document   : clientes
    Created on : 27-oct-2017, 18:22:11
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
        <div class="container">
            <form action="ControladorCrudClientes" method="Post">
                <div class="section">
                    <div class="row">
                        <div class="col s12 center "> 
                            <h1>Formulario Cliente</h1> 
                            <p class="red-text">*Rellene los campos</p>
                            <div class="row">
                                <div class="col s12">
                                    <div class="row">
                                        <div class="input-field col s12">                                                     
                                            <div class="input-field col s6">                               
                                                <input id="rut" type="number" name="rut"  value="0" class="validate">
                                                <label for="last_name">Rut</label>
                                            </div>
                                            <div class="input-field col s6">                               
                                                <input id="dv" type="text" name="dv" maxlength="1"  class="validate">
                                                <label for="last_name">Dv</label>
                                            </div>                            
                                            <div class="input-field col s3">                               
                                                <input id="pnombre" type="text" name="pNombre" class="validate">
                                                <label for="last_name">Primer Nombre</label>
                                            </div>
                                            <div class="input-field col s3">                               
                                                <input id="snombre" type="text" name="sNombre" class="validate">
                                                <label for="last_name">Segundo Nombre</label>
                                            </div>
                                            <div class="input-field col s3">                               
                                                <input id="appaterno" type="text" name="apPaterno" class="validate">
                                                <label for="last_name">Apellido Paterno</label>
                                            </div>
                                            <div class="input-field col s3">                               
                                                <input id="apmaterno" type="text" name="apMaterno" class="validate">
                                                <label for="last_name">Apellido Materno</label>
                                            </div>
                                            <div class="input-field col s6">                               
                                                <input id="direccion" type="text" name="direccion" class="validate">
                                                <label for="direccion">Direccion</label>
                                            </div>                                        
                                            <div class="input-field col s12">
                                                <select name="comuna">
                                                    <option value="" disabled selected>Elija la comuna</option>
                                                    <option value="Calera de Tango">Calera de Tango</option>
                                                    <option value="San Bernardo">San Bernardo</option>
                                                    <option value="Santiago">Santiago</option>
                                                    <option value="Rancagua">Rancagua</option>
                                                    <option value="La Pintana">La  Pitanta</option>
                                                    <option value="Puente ALto">Puente alto</option>
                                                    <option value="Cerrillos">Cerrillos</option>
                                                    <option value="Maipu">Maipu</option>
                                                </select>
                                                <label>Comuna</label>
                                            </div>
                                            <div class="input-field col s6">                               
                                                <input id="telefono" type="number" name="telefono" value="0" class="validate">
                                                <label for="last_name">Telefono</label>
                                            </div>
                                            <div class="input-field col s6">                               
                                                <input id="email" type="email" name="email" class="validate">
                                                <label for="last_name">Email</label>
                                            </div>  
                                            <div class="input-field col s3">                                                  
                                                <input class="btn-large waves-effect waves-light red" type="submit" name="opcion" value="Guardar">
                                            </div> 
                                            <div class="input-field col s3">      
                                                <input class="btn-large waves-effect waves-light red" type="submit" name="opcion" value="Buscar">
                                            </div> 
                                            <div class="input-field col s3">                             
                                                <input class="btn-large waves-effect waves-light red" type="submit" name="opcion" value="Modificar">
                                            </div> 
                                            <div class="input-field col s3">  
                                                <input class="btn-large waves-effect waves-light red"  type="submit" name="opcion" value="Elimnar">
                                                <div class="input-field col s12">                             
                                                    <input class="btn-large waves-effect waves-light red" type="submit" name="opcion" value="Listar">
                                                </div>                                             
                                            </div>
                                        </div>                     
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div> 
            </form>
        </div>        
        <div class="input-field col s8">
            <a href="menuPrincipal.jsp" class="waves-effect waves-light red btn"><i class="material-icons left">arrow_back</i>Atrás</a>
        </div>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script>
            $(document).ready(function () {
                $('select').material_select();
            });
        </script>  
    </body>
</html>
