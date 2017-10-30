<%-- 
    Document   : listadoClientes
    Created on : 28-oct-2017, 17:15:38
    Author     : benja
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.ClienteDAO"%>
<%@page import="modelo.Cliente"%>
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
        <title>JSP Page</title>
    </head>
    <body>

        <nav class="teal darken-3" role="navigation">
            <div class="nav-wrapper container">
                <a id="logo-container" href="index.jsp" class="brand-logo">La Tuerca</a>
                <ul class="right hide-on-med-and-down">                                                 
                    <li class="input-field col s1">   
                        <form action="ControladorCerrarSesion" method="POST"> 
                            <button class="btn waves-effect waves-light btn">
                                <input type="submit" name="opcion" value="Cerrar"><i class="material-icons right"></i>
                            </button>
                        </form>
                    </li>    
                </ul>              
            </div>
        </nav>  

        <h1>Listado de Clientes</h1>
        <table id="listadoClientres" class="striped">
            <thead>
                <tr>
                    <th>Fecha Asociacion </th>            
                    <th>Rut</th>
                    <th>Nombre Completo</th>
                    <th>Direccion</th>
                    <th>Comuna</th>
                    <th>Telefono</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <% ArrayList<Cliente> arrayClientes = new ArrayList(); %>
                <% arrayClientes = new ClienteDAO().mostrarDatos();

                    for (Cliente cli : arrayClientes) {%>
                <tr>                 
                    <% String rut = cli.getRut() + "-" + cli.getDv();
                        String nombreCompleto = cli.getPrimerNombre() + " " + cli.getSegundoNombre() + " " + cli.getApellidoPaterno() + " " + cli.getApellidoMaterno();
                    %>
                    <td><%=cli.getFechaAsociacion()%></td>
                    <td><%=rut%></td>
                    <td><%=nombreCompleto%></td>
                    <td><%=cli.getDireccion()%></td>
                    <td><%=cli.getComuna()%></td>
                    <td><%=cli.getTelefono()%></td>
                    <td><%=cli.getEmail()%></td>
                </tr>
            </tbody>
            <%
                }
            %>         
        </table>   
        <div class="input-field col s8">
            <a href="formularioCliente.jsp" class="waves-effect waves-light red btn"><i class="material-icons left">arrow_back</i>Atrás</a>
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
