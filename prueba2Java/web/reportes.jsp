<%-- 
    Document   : reportes
    Created on : 27-oct-2017, 21:11:33
    Author     : benja
--%>

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
                            <input class="btn waves-effect waves-light btn" type="submit" name="opcion" value="Cerrar"><i class="material-icons right"></i>
                        </form>
                    </li>    
                </ul>              
            </div>
        </nav> 
        <h2>Reportes</h2>
        <%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="sql"   uri="http://java.sun.com/jstl/sql" %>


        <sql:setDataSource
            driver="com.mysql.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/empresa"
            user="root"
            password=""/>      

        <sql:query var="fich_reparacion">
            SELECT * FROM fich_reparacion;
        </sql:query>

        <UL>
            <c:forEach var="row" items="${fich_reparacion.rows}">
                <LI>${row.id_ficha}
                    ${row.rut_persona}
                    ${row.patente}
                    ${row.fecha_ingreso}
                    ${row.motivos}
                    ${row.detalles}
                    ${row.hora_trabajo}
                    ${row.total}
                </c:forEach>
        </UL>

        <h1>Empleados</h1>
        <sql:query var="empleado">
            SELECT * FROM empleado;
        </sql:query>

        <UL>
            <c:forEach var="row" items="${empleado.rows}">
                <LI>${row.rut_persona}
                    ${row.fecha_contra}
                    ${row.usuario}
                    ${row.clave}
                    ${row.hor_trabo}
                    ${row.val_hora}
                    $ ${row.sueldo}
                </c:forEach>
        </UL>
        <div class="input-field col s8">
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
