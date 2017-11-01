<%-- 
    Document   : statusMoto
    Created on : 30-10-2017, 21:05:42
    Author     : carlos
--%>

<%@page import="controlador.ControladorDAOTaller"%>
<%@page import="modelo.Vehiculo"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="controlador.EmpleadoDAO"%>
<%@page import="modelo.Empleado"%>
<%@page import="controlador.ClienteDAO"%>
<%@page import="modelo.Cliente"%>
<%@page import="controlador.RegistroTallerDAO"%>
<%@page import="modelo.Moto"%>
<%@page import="controlador.MotoDAO"%>
<%@page import="modelo.FichaReparacion"%>
<%@page import="controlador.ClienteDAO"%>
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

        <form action="" method="Post">
            <%
                String patente = (String) request.getAttribute("patente");
                FichaReparacion ficha = new RegistroTallerDAO().buscarDatosPorPatente(patente);
                Moto moto = new ControladorDAOTaller().buscarDatosMoto(patente);
                Cliente cliente = new ClienteDAO().buscarDatos(moto.getRut());
                Empleado empleado = new EmpleadoDAO().buscarDatos(ficha.getRutPersona());
                //ficha
                String idFicha = ficha.getIdFicha() + "";
                String rutEmpleado = ficha.getRutPersona() + "";
                String fechaIngreso = ficha.getFechaIngreso() + "";
                String fechaSalida = ficha.getFechaSalida() + "";
                String motivos = ficha.getMotivos() + "";
                String detalles = ficha.getDetalles() + "";
                String horaTrabajo = ficha.getHorasTrabajo() + "";
                String total = ficha.getTotal() + "";
                //moto
                String tipomoto = moto.getTipomoto() + "";
                String marca = moto.getMarca() + "";
                String foto = moto.getFoto() + "";
                String anyo = moto.getAnyo() + "";
                String kilometraje = moto.getKilometraje() + "";
                String tipo_bencina = moto.getTipo_bencina();
                //Cliente
                String rutCliente = cliente.getRut() + "-" + cliente.getDv() + "";
                String nombreCompleto = cliente.getPrimerNombre() + " " + cliente.getSegundoNombre() + " " + cliente.getApellidoPaterno() + " " + cliente.getApellidoMaterno();
                String telefono = cliente.getTelefono() + " ";
                String email = cliente.getEmail();
                //Empleado
                String val_hora = empleado.getValorHora() + "";
            %>
            <div class="container">
                <form action="ControladorMenuVehiculo" method="POST"> 
                    <div class="row">
                        <div class="row">
                            <div class="input-field col s2">
                                <p class=" red-text">Id Ficha: <%= idFicha%> </p>
                            </div>
                            <div class="input-field col s2">
                                <h5 class=" red-text">Rut:</h5><h6><%=  rutCliente%></h6>
                            </div>
                            <div class="input-field col s2">
                                <h5 class=" red-text">Nombre:</h5><h6><%= nombreCompleto%></h6>
                            </div>
                            <div class="input-field col s2">
                                <h5 class=" red-text">Telefono:</h5><h6><%= telefono%></h6>
                            </div>
                            <div class="input-field col s2">
                                <h5 class=" red-text">Email:</h5><h6><%= email%></h6>
                            </div>
                            <div class="input-field col s2">
                                <h5 class=" red-text">Telefono:</h5><h6><%= telefono%></h6>
                            </div>
                        </div>
                        <h4 center >MOTO</h4>
                        <div class="row">                        
                            <h5 class=" red-text">Patente:<input type="text" value="<%= patente %>" readonly name="patente"> </h5>


                                <div class="input-field col s2">
                                    <h5 class=" red-text">Tipo Moto:</h5><h6><%=  tipomoto%></h6>
                                </div>
                                <div class="input-field col s2">
                                    <h5 class=" red-text">Año:</h5><input type="text" value="<%= anyo%>" readonly name="anyo">
                                </div>
                                <div class="input-field col s2">
                                    <h5 class=" red-text">Kilometraje:</h5><input type="text" value="<%= kilometraje%>" name="kilometraje">
                                </div>
                                <div class="input-field col s2">
                                    <h5 class=" red-text">Tipo de Bencina</h5><input type="text" value="<%= tipo_bencina%>" readonly name="tipoB">
                                </div>
                        </div>                       
                        <h4 center >Estado del Vehiculo</h4>
                        <div class="row">
                            <div class="input-field col s2">
                                <h5 class=" red-text">Fecha Ingreso:</h5> <input type="date" name="fechaIngreso" value="<%= fechaIngreso%>" readonly ><br> 
                            </div>   
                            <% LocalDateTime ahora = LocalDateTime.now();
                                String hoy = (ahora.getYear() + "-" + ahora.getMonthValue() + "-" + ahora.getDayOfMonth());%>
                            <div class="input-field col s2"> 
                                <h5 class=" blue-text">Fecha Termino:</h5>
                                <input type="date" value="<%= hoy%>"  required="required" name="fechaIngreso">                            
                            </div>
                            
                            <div class="input-field col s12"> 
                                <h5 class=" blue-text">Detalles:</h5>
                                <input type="text"  name="detalles" readonly   value="<%= detalles%>" ><br>                          
                            </div>
                            <div class="input-field col s12"> 
                                <h5 class=" blue-text">Motivos:</h5>
                                <input type="text"  name="motivos"  required="required"  value="<%= motivos %>" ><br>                          
                            </div>
                            <div class="input-field col s2"> 
                                <h6 class=" blue-text">Valor Hora Trabajo</h6>
                                <input type="number" name="valHoras" onlyRead value="<%= val_hora%>"  >                          
                            </div>
                            <div class="input-field col s2"> 
                                <h6 class=" blue-text">Horas Trabajadas:</h6>
                                <input type="number" name="horasTrabajadas" min="0" max="30" value="<%= horaTrabajo%>" required="required" >                          
                            </div>
                            <div class="input-field col s2"> 
                                <h6 class=" blue-text">Total:</h6>
                                <input type="number" name="horasTrabajadas" min="0" readonly  value="<%= total%>">                          
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="row">
                            <button class="btn-large waves-effect waves-light cyan" type="submit" name="opcion" value="Guardar">Guardar<i class="material-icons right">save</i></button>
                        </div>                                                  
                    </div> 
                </form>
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
