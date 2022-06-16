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
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa" />
	<form action="${linkServletNovaEmpresa}" method="post">

        Nome: <input type="text" name="nome" />
        Data de Abertura: <input type="string" name="data" />

        <input type="submit" />
    </form>
</body>
</html>