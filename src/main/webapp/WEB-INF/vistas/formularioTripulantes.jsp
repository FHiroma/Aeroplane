<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

		<form:form action="/formularioTripulante" method="POST" modelAttribute="tripulante">
		
		<form:input path="jefeDeCabina" type="checkbox" />
		
		<label>Jefe de Cabina
		  <form:input type="radio" path="jefeDeCabina" name="Si" value="true" />
		  <form:input type="radio" path="jefeDeCabina" name="No" value="false" />
		</label>
		
		<form:input path="nombre" type="text"/>
		
		<button class="btn btn-lg btn-primary" Type="Submit"/>Login</button>
		
		</form:form>




</body>
</html>