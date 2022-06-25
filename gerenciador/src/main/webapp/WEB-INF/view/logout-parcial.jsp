<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<c:url value="/entrada?acao=logout" var="logout" />
	Usuario Logado: ${usuarioLogado.login} <a href="${logout}">logout</a>
	<br>
	<br>