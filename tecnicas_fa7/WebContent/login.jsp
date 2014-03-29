<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body style="margin-left:20%; margin-right: 20%">

<br/><br/>
	 <form action="login.do" method="post">

		<fieldset>
			<legend>LOGIN</legend>
			<label>Nome:</label>
			<input type="text" name="usuario"/><br/>
			
			<label>Senha:</label>
			<input type="password" name="password"/><br/>
			
		</fieldset><br/>
	    
    
	    <input type="submit" value="Logar">
		 
	 </form>
</body>
</html>