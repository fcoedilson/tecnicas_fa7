<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Cadastro Notas</title>
</head>

<body>
	 <form action="cadastronotas">
		
		<h1>Cadastro de Notas</h1>

		<fieldset>
			<legend>Notas do semestre</legend>
			
			<label>VP1:</label>
			<input type="text" name="vp1"/><br/>
			
			<label>VP2:</label>
			<input type="text" name="vp2"/><br/>

			<label>VF:</label>
			<input type="text" name="vf"/><br/>
			
		</fieldset><br/>
	    
    
	    <input type="submit" value="Enviar">
		 
	 </form>
</body>
</html>