<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmação</title>
</head>
<body>
<c:import url="logout-parcial.jsp" />
	<c:if test="${ not empty nome }">
		Empresa ${ nome } criada com sucesso
	</c:if>
	
	<c:if test="${ empty nome }">
		Informe o nome da empresa!
	</c:if>
</body>
</html>