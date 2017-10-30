<%-- 
    Document   : ListarVehiculos
    Created on : 30-10-2017, 1:10:38
    Author     : carlos
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.AutoDAO"%>
<%@page import="controlador.MotoDAO"%>
<%@page import="modelo.Auto"%>
<%@page import="modelo.Moto"%>
<%@page import="modelo.Vehiculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>          
     <table id="listadoVehiculos" class="striped">  
         <thead>
            <h1> Lista de Vehiculos</h1>
            <th> Patente </th>
            <th> Marca </th> 
            <th> Rut </th> 
            <th> Foto </th> 
            <th> Año </th> 
            <th> Kilometraje </th>
            <th> Tipo Bencina </th>
            <th> Cantidad Puertas </th>
            <th> Cantidad Asientos </th>
            <th> Tipo Auto </th>
            <th> Cambios Automaticos </th>
            <th> Eléctrico </th>
        </thead> 
        <tbody>
            
            <% ArrayList<Auto> arrayAutos = new ArrayList(); %>
            <% arrayAutos = new AutoDAO().mostrarDatos();
                for(Auto auto: arrayAutos) {%>
                <tr>                 
                    <td><%= auto.getPatente()%></td>
                    <td><%= auto.getMarca()%></td>
                    <td><%= auto.getRut()%></td>
                    <td><%= auto.getFoto()%></td>
                    <td><%= auto.getAnyo()%></td>
                    <td><%= auto.getKilometraje()%></td>
                    <td><%= auto.getTipo_bencina()%></td>
                    <td><%= auto.getCambiosAutomaticos()%></td>
                    <td><%= auto.getElectrico()%></td>
                </tr>       
        </tbody>
        </table>
                
        <table id="listadoVehiculosMoto" class="striped">        
        <thead>
            <h1>Lista de Vehiculos</h1>
            <th> Patente </th>
            <th> Marca </th> 
            <th> Rut </th> 
            <th> Foto </th> 
            <th> Año </th> 
            <th> Kilometraje </th>
            <th> Tipo Bencina </th>
            <th> Tipo Moto </th>
        </thead> 
        <tbody>
            <% ArrayList<Moto> arrayMotos = new ArrayList(); %>
            <% arrayMotos = new MotoDAO().mostrarDatos();
                for(Moto moto: arrayMotos) {%>
                <tr>                 
                    <td><%= moto.getPatente()%></td>
                    <td><%= moto.getMarca()%></td>
                    <td><%= moto.getRut()%></td>
                    <td><%= moto.getFoto()%></td>
                    <td><%= moto.getAnyo()%></td>
                    <td><%= moto.getKilometraje()%></td>
                    <td><%= moto.getTipo_bencina()%></td>
                    <td><%= moto.getTipomoto()%></td>
                </tr>       
        </tbody>
     </table>    
    </body>
</html>
