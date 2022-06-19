<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<c:url value="/entrada?acao=login" var="linkServletLogin" />
	<form action="${linkServletLogin}" method="post">

        Login: <input type="text" name="login" />
        Senha: <input type="password" name="senha" />
        <input type="hidden" name="acao" value="login" />

        <input type="submit" />
    </form>
</body>
</html>