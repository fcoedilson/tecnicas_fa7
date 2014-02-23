<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Média</title>
</head>

<body>
		
		<h1>Sua Média</h1>
		
		<fieldset>

			<legend>Média</legend>
			
			<br/>

			<c:if test="${erro == null and erro_sistema == null}">
				<label>Nota VP1:</label>
				<output>${notas[0]}</output><br/><br/>
				
				<label>Nota VP2:</label>
				<output>${notas[1]}</output><br/><br/>
	
				<label>Nota VF:</label>
				<output>${notas[2]}</output><br/><br/><br/>
				
				<b><label>Média Final:</label></b>
				<output>${media}</output><br/><br/>
			
			</c:if>
		
			<c:if test="${erro != null}">
	
				<output style="color:red">ERRO: ${erro}</output><br/><br/>
			
			</c:if>

			<c:if test="${erro_sistema != null}">
	
				<output style="color:red">ERRO: ${erro_sistema}</output><br/><br/>
			
			</c:if>
			
		</fieldset>
		
		<a href="http://localhost:8080/tecnicas_fa7/pages/notas.jsp"> << VOLTAR</a>


		 
</body>
</html>