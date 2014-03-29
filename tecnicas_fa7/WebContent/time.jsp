<%@page import="java.util.Date"%>
<%@page import="br.fa7.tecnicas.controle.HelloServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Time</title>
</head>
<body>
	 <form action="cadastrotime">
		
		<h1>Time</h1>
		
		
		<fieldset>
		
			<label>Nome:</label>
			<output>${time.nome}</output><br/><br/>


			<label>Técnico:</label>
			<output>${time.tecnico}</output><br/><br/>
			
			<label>Quant. de torcedores:</label>${time.torcedores}<br/>
			<c:if test="${time.torcedores >= 5000}">
				<output>Time grande</output><br/><br/>
			</c:if>
			
			<c:if test="${time.torcedores < 5000}">
				<output>Time Pequeno</output><br/><br/>
			</c:if>
			
			<label>Divisão:</label>
			<output>${time.divisao}</output><br/><br/>
			
			
			<label>Estado:</label>
			<output>${time.estado}</output><br/><br/>
			
		</fieldset><br/>
    
		 
	 </form>
</body>
</html>