<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="tripulanteCargado" method="POST">
		    	<h3 class="form-signin-heading">Tripulante y Vuelo</h3>	
				<hr class="colorgraph"><br>
				<input name="numeroPlanificacion"  type="hidden" class="form-control" value="${idPlan}"/>	
				<input name="posicion"  type="hidden" class="form-control" value="${posicion}"/>	
				<select name="nombreTripulante">
				<c:forEach items="${listaTripulante}" var="items">
				<option value="${items.idTripulacion}">${items.nombre}</option>
				</c:forEach>
				</select> 
				<button class="btn btn-lg btn-primary btn-block" Type="Submit"/>Cargar</button>	
	</form>
</body>
</html>