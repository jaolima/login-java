<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<jsp:include page="cabecalho.jsp"></jsp:include>
        
        <div class="main">
            <!--div para mostrar erros-->
            <div class="erroDIV">
                ${msgErro != null ? msgErro : ''}
            </div>
        </div>
            <h1>Relou seja bem vindo</h1>
            <fieldset>
                <legend>CRUD</legend>
                
                <h4>Sistema Crud</h4>
            </fieldset>
        </div>

</body>
</html> 