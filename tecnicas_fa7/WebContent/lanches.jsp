<%@page import="java.util.Date"%>
<%@page import="br.fa7.tecnicas.controle.HelloServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exemplos</title>
</head>
<body>

	<label>Suco:</label>
	<br />
	<label>Sabor:</label>
	<output>${suco["sabor"]}</output>
	<br />

	<label>Marca:</label>
	<output>${suco["marca"]}</output>
	<br />


	<h1>Sabores</h1>
	
	<ul>
		<c:forEach var="sabor" items="${sabores}">
			<li>${sabor}</li>
		</c:forEach>
	</ul>
	
	<h1>Dados</h1>
	<ul>${map}</ul>
	
	<h1>Tamanhos</h1>
	<ul>${tamanhos[0]}</ul>
	<ul>${tamanhos["1"]}</ul>
	<ul>${tamanhos[2]}</ul>
	
	<ul>
		<c:forEach var="sabor" items="${sabores}">
			<li>${sabor}</li>
		</c:forEach>
	</ul>

	<h1>Carros</h1>
	
	<ul>
		<c:forEach var="carro" items="${carros}">
			<li>${carro}</li>
		</c:forEach>
	</ul>

</body>
</html>