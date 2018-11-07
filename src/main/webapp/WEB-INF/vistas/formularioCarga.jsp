<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="tripulanteCargado" method="GET">
			    	<h3 class="form-signin-heading">Tripulante y Vuelo</h3>
					<hr class="colorgraph"><br>
					<input name="numeroPlanificacion"  type="number" class="form-control" />
					<input name="nombreTripulante" type="text" class="form-control"/>     		  

					<button class="btn btn-lg btn-primary btn-block" Type="Submit"/>Cargar</button>
				</form>

</body>
</html>