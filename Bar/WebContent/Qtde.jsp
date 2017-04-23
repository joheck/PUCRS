
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
<title>Quantidade e Distribuição</title>
<link rel="stylesheet" href="css/style.css" type="text/css">
<script type="text/javascript" src="javascript/script.js" DEFER></script>
</head>
<body>

	<table id="tabelaDeResultados" border="1">
		<thead style="color: black;">
			<tr>
				<th colspan="5">Distribuição</th>
			</tr>
			<tr>
				<th rowspan="2">Total clientes</th>

				<th colspan="2">Homens</th>
				<th colspan="2">Mulheres</th>
			</tr>
			<tr>
				<th>Socio</th>
				<th>Não socio</th>
				<th>Socio</th>
				<th>Não socio</th>
			</tr>
		</thead>
		<tbody style="background-color: black; text-align: center;">
			<tr>
				<td colspan="1">${bar.getParamQtde()[0]}</td>
				<td>${bar.getParamQtde()[1]}</td>
				<td>${bar.getParamQtde()[2]}</td>
				<td>${bar.getParamQtde()[3]}</td>
				<td>${bar.getParamQtde()[4]}</td>
			</tr>
		</tbody>
	</table>

</body>
</html>