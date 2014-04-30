<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>Car Details</title>
    <link rel="stylesheet" href="../css/main.css">
    <meta name="viewport" content="width=device-width">
</head>

<body>

	<div class="topbanner"> 
		<span class="topbanner-text">Abastecimentos</span> 
	</div>
	
	<div id="page-content">

		<c:forEach items="${abastecimentoList}" var="item">
			<div class="row-fluid">
				${item.placa} ${item.quantidade} ${item.kmatual}
			</div>
		</c:forEach>
		
		
		<a href="/cardetails/pages/new.jsp">Novo</a>

	</div>
	

</body>


</html>