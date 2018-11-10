Mi unidad
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

<form:form action="#!">
<input type="text" class="datepicker">
<button type="submit" name="enviar">enviar</button>
</form:form>

	<c:forEach items="${lista}" var="items">

    	 <table class="center-align">
        <thead>
          <tr>
              <th class="center">ID Planificación</th>
              <th class="center">Número De Vuelo</th>
              <th class="center">Fecha Inicio</th>
              <th class="center">Fecha Arribo</th>
              <th class="center"></th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td class="center">${items.idPlanificacion}</td>
            <td class="center">${items.fechaYHorarioDeInicio}</td>
            <td class="center">${items.fechaYHorarioDeArribo}</td>
            <td class="center">${items.numeroDeVuelo}</td>
            
            <td class="center"><a href="formularioCarga">
            <i class=" material-icons md-8 green-text">add_circle_outline</i>
            </a></td>
            
          </tr>
        </tbody>
      </table>
    	
	</c:forEach>
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