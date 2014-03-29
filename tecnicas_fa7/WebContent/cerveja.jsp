<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Melhores cerveja</title>
<link rel="stylesheet" href="css/estilo.css" type="text/css" />

</head>
<body>

	<h1> As melhores cervejas do tipo ${tipo} são:</h1>
	<c:forEach var="i" items="${cervejas}">
		<label>${i}</label><br/>
	
	</c:forEach>


</body>
</html>