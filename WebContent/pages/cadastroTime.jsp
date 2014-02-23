<%@page import="java.util.Date"%>
<%@page import="br.fa7.tecnicas.controle.HelloServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro Time</title>
</head>
<body>
	 <form action="cadastrotime">
		
		<h1>Cadastro Time</h1>

		<fieldset>
			<legend>Time</legend>
			<label>Nome:</label>
			<input type="text" name="nome"/><br/>
			
			<label>Técnico:</label>
			<input type="text" name="tecnico"/><br/>
			
			<label>Quat. torcedores:</label>
			<input type="text" name="torcedores"/><br/>

			<label>Divisão:</label>
			<input type="radio" name="divisao" value="1ª divisão">1ª divisão</input>
			<input type="radio" name="divisao" value="2ª divisão"/>2ª divisão</input><br/>
			<input type="radio" name="divisao" value="3ª divisão"/>3ª divisão</input><br/>

			<label>Estado:</label>
			<select name="estado">
				<option>CE</option>
				<option>BA</option>
				<option>MA</option>
				<option>SP</option>
				<option>RJ</option>
			</select>
			
		</fieldset><br/>
	    
    
	    <input type="submit" value="Cadastrar">
		 
	 </form>
</body>
</html>