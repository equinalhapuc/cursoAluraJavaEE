<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastra nova Empresa</title>
</head>
<body>
<c:url value="/editaEmpresa" var="linkServletNovaEmpresa" />
	<form action="${linkServletNovaEmpresa}" method="post">

        Nome: <input type="text" name="nome" value="${empresa.nome }"/>
        Data de Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>" />
        <input type="hidden" name="id" value="${empresa.id }" />
        <input type="submit" />
    </form>
</body>
</html>