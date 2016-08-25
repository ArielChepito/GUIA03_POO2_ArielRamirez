<%-- 
    Document   : index
    Created on : 24-ago-2016, 22:13:06
    Author     : Ariel
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Lugares</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'/>
        <script type='text/javascript' src='webjars/jquery/2.1.4/jquery.min.js'></script>
        <script type='text/javascript' src='webjars/bootstrap/3.2.0/js/bootstrap.min.js'></script>
        
    </head>
    <body>
        
        <nav class="navbar navbar-default">
            <div class="container-fluid">
              <!-- Brand and toggle get grouped for better mobile display -->
              <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                  <span class="sr-only">Toggle navigation</span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">GUIA 3</a>
              </div>

              <!-- Collect the nav links, forms, and other content for toggling -->
              <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">

                  <li><a href="index.jsp">Lugares</a></li>
                    <li><a href="tipoDocu.jsp">Tipo Documento</a></li>
                      <li><a href="tipoGafe.jsp">Tipo Gafete</a></li>

                </ul>


              </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
          </nav>
        <form action="LugaAcceServ"  method="Post">
             <input  type="hidden" name="codi" id="codi" value="${codi}"/>
            <div class="container">
                
                
                <div class="panel panel-default" style="padding: 15px;">
                    <h2>CRUD de Lugares Acceso</h2>
                    <div class="form-group">
                        <label for="nomb">Nombre: </label>
                        <input  data-msg-required="Este campo es requerido" class="form-control" type="text" name="nomb" id="nomb"value="${nomb}" required />
                    </div>
                    <div class="btn-group">
                        <input type="submit" name="lugaAcceBton" value="Guardar" class="btn btn-default" />
                        <input type="submit" name="lugaAcceBton" value="Consultar" class="btn btn-default" />
                        <input type="submit" name="lugaAcceBton" value="Modificar" class="btn btn-default" />
                        <input type="submit" name="lugaAcceBton" value="Eliminar" class="btn btn-default" />
                    </div>
                </div>
                <div class="panel panel-default"style="padding: 15px;">
                    <jsp:useBean id="LugaAcceCtrl" class="com.sv.udb.controlador.LugaAcceCtrl" scope="page"/>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Nombre</th>
                                <th>Fecha Alta</th>
                                 <th>Seleccione</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${LugaAcceCtrl.ConsTodo()}" var="fila">
                                <tr>
                                    <td><c:out value="${fila.nombLugaAcce}"></c:out></td>
                                    <td><c:out value="${fila.fechAlta}"></c:out></td>
                                    <td> <input type="radio" name="codiRadi" value="${fila.codiLugaAcce}"/></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                 </div>
            </div>
            
        </form>
        
       
    </body>
</html>
