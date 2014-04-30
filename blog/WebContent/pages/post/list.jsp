<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html">
<html>


    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Post</title>
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

		<h1>Posts</h1>

		<table class="table table-hover">  
			<thead>  
	          <tr>  
	            <th>Post Title</th>  
	            <th>Date</th> 
	          </tr>  
	        </thead> 
	        <tbody>  
				<c:forEach items="${posts}" var="p">
				<tr>
					<td>${p.titulo}</td> 
					<td>${p.data}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<a class="btn btn-default" href="posts?action=new" role="button">New Post</a>

		<hr>

		<footer>
			<p>Company 2014</p>
		</footer>
	</div>
	<!-- /container -->  

</body>
</html>