<%-- 
    Document   : statusAuto
    Created on : 30-10-2017, 18:17:16
    Author     : carlos
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page import="controlador.ControladorDAOTaller"%>
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
        <%
            String patente = (String) request.getAttribute("patente");
            FichaReparacion ficha = new RegistroTallerDAO().buscarDatosPorPatente(patente);
            Auto auto = new ControladorDAOTaller().buscarDatosAuto(patente);
            Cliente cliente = new ClienteDAO().buscarDatos(auto.getRut());
            Empleado empleado = new EmpleadoDAO().buscarDatos(ficha.getRutPersona());
            String val_hora = empleado.getValorHora() + "";
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
            String dv = cliente.getDv() + "";
            String rutCliente = cliente.getRut() + "-" + dv;

            String nombreCompleto = cliente.getPrimerNombre() + " " + cliente.getSegundoNombre() + " " + cliente.getApellidoPaterno() + " " + cliente.getApellidoMaterno();
            String telefono = cliente.getTelefono() + " ";
            String email = cliente.getEmail();
        %>   
        <div class="container">
            <form action="ControladorTallerAuto" method="POST"> 
                <div class="row">
                    <div class="row">
                        <div class="input-field col s2">
                             <h5 class=" red-text">Id Ficha:<input type="text" value="<%= idficha %>" readonly name="idFicha"> </h5>

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
                    <h4 center >AUTO</h4>
                    <div class="row">                        
                        <h5 class=" red-text">Patente:<input type="text" value="<%= patente %>" readonly name="patente"> </h5>

                            <div class="input-field col s2">
                                <h5 class=" red-text">Tipo Auto:</h5><h6><%=  tipoAuto%></h6>
                            </div>
                            <div class="input-field col s2">
                                <h5 class=" red-text">Año:</h5><input type="text" value="<%= anyo%>" readonly name="anyo">
                            </div>
                            <div class="input-field col s2">
                                <h5 class=" red-text">Kilometraje:</h5><input type="text" value="<%= kilometraje%>" name="kilometraje">
                            </div>
                            <div class="input-field col s2">
                                <h5 class=" red-text">Tipo de Bencina</h5><input type="text" value="<%= tipobencina%>" readonly name="tipoB">
                            </div>
                            <div class="input-field col s2">
                                <h5 class=" red-text">Total asientos:</h5> <input type="text" value="<%= cantAsientos%>" readonly name="asientos">
                            </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s2">
                            <h5 class=" red-text"> Total airbag:</h5> <input type="text" value="<%= cantAirbag%>" readonly name="air">
                        </div>
                        <div class="input-field col s2">
                            <h5 class=" red-text">¿Cambio automatico?:</h5> <input type="text" value="<%= cambioAutomatico%>" readonly name="cambioA">
                        </div>
                        <div class="input-field col s2">
                            <h5 class=" red-text"> Total airbag:</h5> <input type="text" value="<%= cantAirbag%>" readonly name="air">
                        </div>
                        <div class="input-field col s2">
                            <h5 class=" red-text">Total asientos:</h5> <input type="text" value="<%= cantAsientos%>" readonly name="asientos">
                        </div>
                        <div class="input-field col s2">
                            <h5 class=" red-text">¿Auto electrico?</h5> <input type="text" value="<%= electrico%>" readonly name="electrico">
                        </div>
                        <div class="input-field col s2">
                            <h5 class=" red-text">¿Direccion asistida?</h5> <input type="text" value="<%= direAsistida%>" readonly name="asistida">
                        </div>

                    </div>
                    <div class="row">
                        <div class="input-field col s2">
                            <h5 class=" red-text"> Total airbag:</h5> <input type="text" value="<%= cantAirbag%>" readonly name="air">
                        </div>
                        <div class="input-field col s2">
                            <h5 class=" red-text">¿Cambio automatico?:</h5> <input type="text" value="<%= cambioAutomatico%>" readonly name="cambioA">
                        </div>
                        <div class="input-field col s2">
                            <h5 class=" red-text"> Total airbag:</h5> <input type="text" value="<%= cantAirbag%>" readonly name="air">
                        </div>
                        <div class="input-field col s2">
                            <h5 class=" red-text">Total asientos:</h5> <input type="text" value="<%= cantAsientos%>" readonly name="asientos">
                        </div>
                        <div class="input-field col s2">
                            <h5 class=" red-text">¿Auto electrico?</h5> <input type="text" value="<%= electrico%>" readonly name="electrico">
                        </div>
                        <div class="input-field col s2">
                            <h5 class=" red-text">¿Direccion asistida?</h5> <input type="text" value="<%= direAsistida%>" readonly name="asistida">
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s2">
                            <h5 class=" red-text"> ¿Portaequipaje?:</h5> <input type="text" value="<%= portaEquipaje%>" readonly name="porta">
                        </div>                                        
                    </div>
                    <h4 center >Estado del Vehiculo Taller</h4>
                    <div class="row">
                        <div class="input-field col s2">
                            <h5 class=" red-text">Fecha Ingreso:</h5> <input type="date" name="fechaIngreso" value="<%= fechaIngreso%>" readonly ><br> 
                        </div>  
                        <% LocalDateTime ahora = LocalDateTime.now();
                            String hoy = (ahora.getYear() + "-" + ahora.getMonthValue() + "-" + ahora.getDayOfMonth());%>
                        <div class="input-field col s2"> 
                            <h5 class=" blue-text">Fecha Termino:</h5>
                            <input type="date" value="<%= hoy%>"  required="required" name="fechaTermino">                            
                        </div>
                        <div class="input-field col s12"> 
                            <h5 class=" red-text">Motivos:</h5>
                            <input type="text"  name="motivos" readonly value="<%= motivos%>" ><br>                          
                        </div>
                        <div class="input-field col s12"> 
                            <h5 class=" blue-text">Detalles:</h5>
                            <input type="text"  name="detalles" equired="required" value="<%= detalles%>" ><br>                          
                        </div>
                        <div class="input-field col s2"> 
                            <h6 class=" blue-text">Valor Hora Trabajo</h6>
                            <input type="number" name="valHoras" value="<%= val_hora%>" readonly >                          
                        </div>
                        <div class="input-field col s2"> 
                            <h6 class=" blue-text">Horas Trabajadas:</h6>
                            <input type="number" name="horasTrabajadas" min="0" max="30" value="<%= horaTrabajo%>" required="required" >                         
                        </div>   
                         <div class="input-field col s2"> 
                            <h6 class=" blue-text">Total:</h6>
                            <input type="number" name="total" min="0" max="30" value="<%= total%>" readonly >                         
                        </div> 
                    </div>
                    <div class="row">
                        <div class="row">
                            <button class="btn-large waves-effect waves-light cyan" type="submit" name="opcion" value="Actualizar">Actualizar<i class="material-icons right">save</i></button>
                        </div>                                                  
                    </div>  </div> 
            </form>
        </div>                 
        <div>
            <a href="menuPrincipal.jsp" class="waves-effect waves-light red btn"><i class="material-icons left">arrow_back</i>Volve Menu Principal</a>
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
