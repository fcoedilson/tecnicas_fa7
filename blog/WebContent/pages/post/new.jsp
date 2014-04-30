<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html">
<html>


    <head>
    	<title>Novo Post</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <style>
            body {
                padding-top: 50px;
                padding-bottom: 20px;
            }
        </style>
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/main.css">

    </head>


<body>

	<div class="container">

		<h1>Novo Post</h1>
		
		<form action="posts?action=create" method="get" target="">
			
			<div class="row">
				<div class="col-xs-6 col-md-4">
					<input type="text" class="form-control" name="titulo" placeholder="Título">
				</div>
			</div>	
			<div class="row">
				<div class="col-xs-6 col-md-4">
					<textarea class="form-control" rows="5" cols="180" name="texto"  placeholder="Texto"></textarea>
				</div>
			</div>
			<br/>
			<div class="row">
				<input type="submit" value="Salvar"/>
				<a class="btn" href="posts?action=list" role="button">Voltar</a>
			</div>
			
		</form>

		<hr>

		<footer>
			<p>Company 2014</p>
		</footer>
	</div>
	<!-- /container -->  

</body>
</html>