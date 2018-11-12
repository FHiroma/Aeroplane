<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<c:set var="context" value="${pagecontext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
 <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
 <!--  <link href="${context}/css">  -->
</head>
<body>


<div class="container section center">
<h1 class="red-text center">Planificaciones</h1>

	

    	 <table class="center-align">
        <thead>
          <tr>
              <th class="center">Fecha Inicio</th>
              <th class="center">Fecha Arribo</th>
              <th class="center">Jefe de Cabina</th>
              <th class="center">Tripulante I</th>
              <th class="center">Tripulante II</th>
              <th class="center">Tripulante III</th>
              <th class="center"></th>
          </tr>
        </thead>
        <c:forEach items="${lista}" var="items">
        <tbody>
          <tr>
            <td class="center">${items.fechaYHorarioDeInicio}</td>
            <td class="center">${items.fechaYHorarioDeArribo}</td>
			<c:if test="${items.jefeDeCabina ne null}">
			<td class="center">${items.jefeDeCabina.nombre}</td>
			</c:if>
			<c:if test="${items.jefeDeCabina eq null}">
            <td class="center"><a href="formularioCarga?Plan=${items.idPlanificacion}&Posicion=1">
            <i class=" material-icons md-8 green-text">add_circle_outline</i>
            </a></td>
 			</c:if>
			<c:if test="${items.tripulante2 ne null}">
			<td class="center">${items.tripulante2.nombre}</td>
			</c:if>
			<c:if test="${items.tripulante2 eq null}">
            <td class="center"><a href="formularioCarga?Plan=${items.idPlanificacion}&Posicion=2">
            <i class=" material-icons md-8 green-text">add_circle_outline</i>
            </a></td>
          	</c:if>
          	<c:if test="${items.tripulante3 ne null}">
          	<td class="center">${items.tripulante3.nombre}</td>
          	</c:if>
          	<c:if test="${items.tripulante3 eq null}">
            <td class="center"><a href="formularioCarga?Plan=${items.idPlanificacion}&Posicion=3">
            <i class=" material-icons md-8 green-text">add_circle_outline</i>
            </a></td>
            </c:if>
            <c:if test="${items.tripulante4 ne null}">
            <td class="center">${items.tripulante4.nombre}</td>
            </c:if>
            <c:if test="${items.tripulante4 eq null}">
            <td class="center"><a href="formularioCarga?Plan=${items.idPlanificacion}&Posicion=4">
            <i class=" material-icons md-8 green-text">add_circle_outline</i>
            </a></td>            
            </c:if>
          </tr>
        </tbody>
        </c:forEach>
      </table>
    	
	
</div>
	
<script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</script>

<script>	
		document.addEventListener('DOMContentLoaded', function() {
	    var elems = document.querySelectorAll('.datepicker');
    	var instances = M.Datepicker.init(elems);
 		 });
</script>

</body>
</html>