<%@page import="java.util.Date"%>
<%@page import="br.fa7.tecnicas.controle.HelloServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro Curriculum</title>
</head>
<body>
	 <form action="curriculum">
		
		<h1>Cadastro Curriculum</h1>

		<fieldset>
			<legend>Dados Pessoais</legend>
			<label>Nome:</label>
			<input type="text" name="nome"/><br/>
			
			<label>RG:</label>
			<input type="text" name="rg"/><br/>
			
			<label>CPF:</label>
			<input type="text" name="cpf"/><br/>

			<label>Telefone:</label>
			<input type="text" name="telefone"/><br/>
			
			<label>E-mail:</label>
			<input type="email" name="email"/><br/>
			
			<label>Data Nascimento:</label>
			<input type="date" name="dtnasc"/><br/>
			
			<label>Naturalidade:</label>
			<input type="text" name="natural"/><br/>
			
			<label>Sexo:</label>
			<input type="radio" name="sexo" value="MASC">Masc</input>
			<input type="radio" name="sexo" value="FEM"/>Fem</input><br/>
			
		</fieldset><br/>
	    
	    <fieldset>
			<legend>Endereço</legend>
			
			<label>Logradouro(Rua, Tv, Av, etc):</label>
			<input type="text" name="lograd"/><br/>

			<label>Nº:</label>
			<input type="text" name="numero"/><br/>

			<label>Complemento:</label>
			<input type="text" name="complemento"/><br/>

			<label>Bairro:</label>
			<select name="bairro">
				<option>Aldeota</option>
				<option>Benfica</option>
				<option>Montese</option>
				<option>Centro</option>
				<option>Parangaba</option>
				<option>Bela Vista</option>
				<option>Conj. Ceará</option>
			
			</select>
			<br/>
			
			<label>CEP</label>
			<input type="text" name="cep"/><br/>
			
		</fieldset> <br/>

		<fieldset>
			<legend>Dados Última experiência Profissional</legend>
			
			<label>Empresa</label>
			<input type="text" name="empresa"/><br/>

			<label>Cargo</label><br/>
			<input type="radio" name="cargo" value="Analista de sistema">Analista de sistema</input>
			<input type="radio" name="cargo" value="Analista Suporte">Analista Suporte</input>
			<input type="radio" name="cargo" value="Analista de Testes">Analista de Testes</input><br/>
			<input type="radio" name="cargo" value="Analista de Qualidade">Analista de Qualidade</input>
			<input type="radio" name="cargo" value="Arquiteto de Software">Arquiteto de Software</input><br/>
			<input type="radio" name="cargo" value="Programador Senior">Programador Senior</input>
			<input type="radio" name="cargo" value="Programador Pleno">Programador Pleno</input>
			
			<br/><br/>

			<label>Data admissão</label>
			<input type="date" name="admissao"/><br/>

			<label>Data desligamento</label>
			<input type="date" name="desligamento"/><br/>

			<label>Competências desenvolvidas</label><br/>
			<input type="checkbox" name="competencias" value="Liderança de equipe">Liderança de equipe</input><br/>
			<input type="checkbox" name="competencias" value="Líder Técnicos de projetos">Líder Técnicos de projetos</input><br/>
			<input type="checkbox" name="competencias" value="Comuninicação">Comuninicação"</input><br/>
			<input type="checkbox" name="competencias" value="Fácil adptação">Fácil adptação"</input><br/>
			<input type="checkbox" name="competencias" value="Multitarefas">Multitarefas"</input><br/>
			<br/>
			
		</fieldset>
		<br/><br/>

		<fieldset>
			<legend>Proposta de ganho salarial com justificativa</legend>
			
			<textarea name="proposta_salarial" cols="80" rows="6"></textarea>

		</fieldset>
	    
	    <input type="submit" value="Enviar">
		 
	 </form>
</body>
</html>