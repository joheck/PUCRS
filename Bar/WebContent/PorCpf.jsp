<jsp:useBean class="Business.Bar" id="bar" scope="session" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cliente por CPF</title>
	<link rel="stylesheet" href="css/style.css" type="text/css" >
	<script type="text/javascript" src="javascript/script.js" DEFER></script>
</head>
<body>

<table id="tabelaDeResultados" border="1" >
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
								<tr>
									<td>${bar.getClientePorCpf(bar.getcpfCons()).getNome()}</td>
									<td>${bar.getClientePorCpf(bar.getcpfCons()).getCpf()}</td>
									<td>${bar.getClientePorCpf(bar.getcpfCons()).getIdade()}</td>
									<td>${bar.getClientePorCpf(bar.getcpfCons()).getGenero()}</td>
									<td>${bar.getClientePorCpf(bar.getcpfCons()).getNumeroSocio()}</td>								
								</tr>
							</tbody>
						</table>
</body>
</html>