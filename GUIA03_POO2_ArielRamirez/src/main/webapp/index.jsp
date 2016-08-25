<%-- 
    Document   : index
    Created on : 24-ago-2016, 22:13:06
    Author     : Ariel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'/>
        <script type='text/javascript' src='webjars/jquery/2.1.4/jquery.min.js'></script>
        <script type='text/javascript' src='webjars/bootstrap/3.2.0/js/bootstrap.min.js'></script>
    </head>
    <body>
        <form action="LugaAcceServ" method="Post">
            <div class="container">
                <h2>Usando JPA [Lugares de Acceso]</h2>
                <div class="form-group">
                    <label for="nomb">Nombre: </label>
                    <input type="text" name="nomb" value=""/>
                </div>
                <div class="btn-group">
                    <input type="submit" name="lugaAcceBton" value="Guardar" class="btn btn-default" />
                </div>
            </div>
        </form>
        
        <jsp:useBean id="LugaAcceCtrl" class="com.sv.udb.controlador.LugaAcceCtrl" scope="page"/>
            <table border="1">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Fecha Alta</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${LugaAcceCtrl.ConsTodo()}" var="fila">
                        <tr>
                            <td><c:out value="${fila.nombLugaAcce}"></c:out></td>
                            <td><c:out value="${fila.fechAlta}"></c:out></td>
                           
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
    </body>
</html>
