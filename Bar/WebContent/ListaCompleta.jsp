
<jsp:useBean class="Business.Bar" id="bar" scope="session" />
<%@page import="Persistence.BarPersistence"%>
<%@page import="Business.Bar"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todos Clientes no Bar</title>
	<link rel="stylesheet" href="css/style.css" type="text/css" >
	<script type="text/javascript" src="javascript/script.js" DEFER></script>
</head>
<body>


	
	<table id="tabelaDeResultados" border="1">
		<thead style="color: black;">
			<tr>
				<th>Nome</th>
				<th>CPF</th>
				<th>Idade</th>
				<th>Sexo</th>
				<th>n° socio</th>
			<tr>
		</thead>
		<tbody style="background-color: black; text-align: center;">
		<c:forEach var="cliente" items="${bar.clientesNoBar}" varStatus="id">
			<tr>
				<td>${cliente.getNome()}</td>
				<td>${cliente.getCpf()}</td>
				<td>${cliente.getIdade()}</td>
				<td>${cliente.getGenero()}</td>
				<td>${cliente.getNumeroSocio()}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>






</body>
</html>