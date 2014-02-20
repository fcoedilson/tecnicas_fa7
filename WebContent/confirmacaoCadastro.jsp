<%@page import="java.util.Date"%>
<%@page import="br.fa7.tecnicas.controle.HelloServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Confirmação Cadastro Curriculum</title>
</head>
<body>
	 <form action="confirmar">
		
		<h1>Confirmação Cadastro Curriculum</h1>

		<fieldset>
			<legend>Dados Pessoais</legend>
			<label>Nome:</label>
			<output>${curriculum.nome}</output><br/><br/>
			
			<label>RG:</label>
			<output>${curriculum.rg}</output><br/><br/>
			
			<label>CPF:</label>
			<output>${curriculum.cpf}</output><br/><br/>

			<label>Telefone:</label>
			<output>${curriculum.telefone}</output><br/><br/>
			
			<label>E-mail:</label>
			<output>${curriculum.email}</output><br/><br/>
			
			<label>Data Nascimento:</label>
			<output>${curriculum.dataNascimento}</output><br/><br/>
			
			<label>Naturalidade:</label>
			<output>${curriculum.naturalidade}</output><br/><br/>
			
			<label>Sexo:</label>
			<output>${curriculum.sexo}</output><br/>

			
		</fieldset><br/>
	    
	    <fieldset>
			<legend>Endereço</legend>
			
			<output>${curriculum.endereco}</output><br/>
			
		</fieldset> <br/>

		<fieldset>
			<legend>Dados experiência Profissional</legend>
			
			<label>Empresa:</label>
			<output>${curriculum.empresa}</output><br/>

			<label>Cargo:</label>
			<output>${curriculum.cargo}</output><br/>
			
			<label>Admissão:</label>
			<output>${curriculum.admissao}</output><br/>			

			<label>Desiigamento:</label>
			<output>${curriculum.desligamento}</output><br/>
			
		</fieldset>
		<br/><br/>

		<fieldset>
			<legend>Proposta de ganho salarial com justificativa</legend>
			
			<output>${curriculum.propostaSalarial}</output><br/>

		</fieldset>
	    
	    <input type="submit" value="Confirmar"/> 
	    
	   <a  href="http://localhost:8080/tecnicas_fa7/curriculum.jsp">Voltar</a>
		 
	 </form>
</body>
</html>