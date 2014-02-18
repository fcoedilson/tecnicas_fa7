<%@page import="java.util.Date"%>
<%@page import="br.fa7.tecnicas.controle.HelloServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Confirmação Cadastro Curriculum</title>
</head>
<body>

	<label>Suco:</label>
	<br />
	<label>Sabor:</label>
	<output>${suco.sabor}</output>
	<br />

	<label>Marca:</label>
	<output>${suco.marca}</output>
	<br />


	<h1>Sabores</h1>
	
	<ul>
		<c:forEach var="sabor" items="${sabores}">
			<li>${sabor}</li>
		</c:forEach>
	</ul>


</body>
</html>