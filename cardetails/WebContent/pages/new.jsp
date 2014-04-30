<!DOCTYPE html>
<html>
<head>
	<title>Car Details</title>
    <link rel="stylesheet" href="../css/main.css">
    <meta name="viewport" content="width=device-width">
</head>

<body>

	<div class="topbanner"> 
		<span class="topbanner-text">Novo REgistro</span> 
	</div>
	
	
	<div id="page-content">

		<form action="/cardetails/abastecimento?action=new" method="get">
			
			<br/>
			<label>Data</label>
			<input type="date" name="data"/>
			<br/>
			
			<label>Placa</label>		
			<select name="placa">
				<option value="NPQ5914">NPQ5914</option>
			</select>
			<br/>
			
			<label>Kilômetro atual</label>
			<input type="number"  name="kmatual">
			<br/>
			
			
			<label>Quant.(LTS)</label>
			<input type="number" name="quant">
			<br/>
	
			<label>Valor(R$)</label>
			<input type="number"  name="valor">
			<br/>	

			<input type="submit"  value="Cadastrar">
		
		</form>

	</div>
	

</body>


</html>