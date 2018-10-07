<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login CRUD web</title>
<link rel="stylesheet" href="css/gobal.css"/>
</head>
<body>

<form action="main?acao=login" method="post">
    <div class="main">
            <div class="erroDiv">
                ${msgErro != null ? msgErro : ''}
            </div>
            
	<fieldset id="fieldset_login">
		<legend>Login do Sistema</legend>
	<div class="campo">
		<label for="login">Login</label>
		<input type="text" id="login" name="login" maxlength="15"/>
	</div>
	
	<div class="campo">
		<label for="senha">Senha</label>
		<input type="password" id="senha" name="senha" maxlength="15"/>
	</div>
	<div class="campo">
		<input type="submit" value="logar"/>
	</div>
	</fieldset>
</form>	


</body>
</html>