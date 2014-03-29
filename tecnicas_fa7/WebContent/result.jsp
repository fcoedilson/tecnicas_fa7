<%@page import="java.util.Date"%>
<%@page import="br.fa7.tecnicas.controle.HelloServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spoleto</title>
</head>
<body>

	<h1>Confira seu pedido:</h1>

	<label>Nome:</label>
	<output>${nome}</output><br/>
	
	<label>Massa:</label>
	<output>${massa}</output><br/>

	<label>Molho:</label>
	<output>${molho}</output><br/>

	<label>Ingrediente:</label>
	<output>${ingrediente}</output><br/>
	
	<label>Crítica:</label>
	<output>${critica}</output><br/>

</body>
</html>