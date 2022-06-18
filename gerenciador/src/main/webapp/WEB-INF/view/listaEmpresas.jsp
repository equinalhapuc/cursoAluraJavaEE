<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List,br.com.alura.gerenciador.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emrpesas Cadastradas</title>
</head>
<body>
	<c:url value="/entrada?acao=novaEmpresa" var="novaEmpresa" />
		<c:if test="${ not empty nome }">
		Empresa ${ nome } criada com sucesso
		</c:if>
		
	<h2> Lista de Empresas: </h2>
	<ul>

		<c:forEach items="${empresas}" var="empresa">
<!-- 				Equivalente a empresa.getNome() -->

			<li>
				${empresa.id } : ${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/entrada?acao=mostraEmpresa&id=${empresa.id}"> editar </a>
				<a href="/gerenciador/entrada?acao=excluiEmpresa&id=${empresa.id}"> remove </a>
			</li>
		</c:forEach>
	</ul>
	<a href="${novaEmpresa }">Nova</a>

</body>
</html>