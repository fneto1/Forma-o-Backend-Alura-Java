<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkEntradaServlet"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro: Nome da empresa</title>
</head>
<body>

	
	<c:import url="logout-parcial.jsp" />

	<form action="${linkEntradaServlet }" method="post">
		
		Nome: <input type="text" name="nome" value="${empresa.nome}">
		Data de Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>">
		<input type="hidden" name="id" value="${empresa.id }" readonly="readonly">
		<input type="hidden" name="acao" value="AlteraEmpresa" readonly="readonly">
		<input type="submit">
		
	</form>

</body>
</html>