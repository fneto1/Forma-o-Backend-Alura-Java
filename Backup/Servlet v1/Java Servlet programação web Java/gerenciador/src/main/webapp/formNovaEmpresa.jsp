<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro: Nome da empresa</title>
</head>
<body>

	
	

	<form action="${linkEntradaServlet }" method="post">
		
		Nome: <input type="text" name="nome">
		Data de Abertura: <input type="text" name="data">
		<input type="hidden" name="acao" value="NovaEmpresa">
		<input type="submit">
		
	</form>

</body>
</html>