<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 	String nomeEmpresa = (String)request.getAttribute("nome");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmação</title>
</head>
<body>
	Empresa <%=nomeEmpresa %> criada com sucesso
</body>
</html>