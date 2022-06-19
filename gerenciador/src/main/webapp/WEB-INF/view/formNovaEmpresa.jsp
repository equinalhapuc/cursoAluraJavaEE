<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastra nova Empresa</title>
</head>
<body>
<c:import url="logout-parcial.jsp" />
<c:url value="/entrada?acao=criaNovaEmpresa" var="linkServletNovaEmpresa" />
	<form action="${linkServletNovaEmpresa}" method="post">

        Nome: <input type="text" name="nome" />
        Data de Abertura: <input type="text" name="data" />

        <input type="submit" />
    </form>
</body>
</html>