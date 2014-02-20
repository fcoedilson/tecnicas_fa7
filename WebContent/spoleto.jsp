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
	 <form action="spoleto">
		<label>Nome</label>
		<input type="text" name="nome"/><br/>
		
		<label>Nome</label>
		
		<input type="radio" name="massa" value="Mussarela">Mussarela</input>
		<input type="radio" name="massa"  value="Queijo">Queijo</input>
		<input type="radio" name="massa"  value="Calabresa">Calabresa</input><br/>
		
		
		<label>Molho:</label>
		<select name="molho">
			<option value="queijo">queijo</option>
			<option value="carne">carne</option>
			<option value="frango">frango</option>
			<option value="camrarão">camarão</option>
		</select><br/>
		
		<label>Ingredientes:</label>
		<input type="checkbox" name="ingredientes" value="rapadura">rapadura</input>
		<input type="checkbox" name="ingredientes" value="pão carioca">pão carioca</input>
		<input type="checkbox" name="ingredientes" value="leite de coco">leite de coco</input><br/>
		
		<label>Críticas:</label>
	    <input type="textarea" name="critica" cols="7"  rows="4"/>
	    
	    <input type="submit" value="Enviar">
		 
	 </form>
</body>
</html>