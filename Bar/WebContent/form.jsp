<jsp:useBean class="Persistence.ClientePersistence" id="ClientePersistence" scope="session"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.sun.corba.se.impl.javax.rmi.CORBA.Util"%>
<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html lang="pt-br">
<head>
	<title>Form</title>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/style.css" type="text/css" >
	<script type="text/javascript" src="javascript/script.js" DEFER="DEFER"></script>

</head>
<body>
	<div id="div_tabs">	
		<nav class="nav_tabs">
			<ul>
				<li>
					<input type="radio" id="radioRegister" class="radios" name="tabs" checked>
					<label for="radioRegister" class="tab_label" >Registro</label>
					<div class="div-formulario" id="formRegister">
						<fieldset>
							<form class="form2" method="post" action="ClienteServlet">
								<div class="field">
									<label for="nome">Nome</label>
									<input type="text" id="nome" name="nome" max="40" maxlength="30" style="width: 420px;">
								</div>
								<div class="field">
									<label for="cpf">CPF</label>
									<input type="text" id="cpf" name="cpf" max="40" maxlength="30">
								</div>
								<div class="field">
									<label for="idade">Idade</label>
									<input type="number" id="idade" name="idade" max="100" min="18" style="width: 30px;" value="18">
								</div>
								<div class="field" >
									<label>Genero</label>
									<select id="genero" name="genero" >
										<option style="color:black;">M</option>
										<option style="color:black;">F</option>
									</select>
								</div>
								<div class="field">    							     
									<label for="socio">n socio</label>
									<input type="checkbox" id="checkSocio" name="checkSocio" max="40" maxlength="30" style="margin-left: -79px;" onclick="document.getElementById('socio').disabled = !this.checked;" >
									<input type="number" id="socio" name="socio" max="40" maxlength="30" style="margin-left: -85px; width: 176px;" disabled autofocus>
									<div class="field">
										<input  type="submit" value="Registrar"  id="submitButoon">
									</div>
								</div>
							</form>							
						</div>
					</li>

					<fieldset style="position: absolute; width: 240px; height: 80px; top: 210px; left: 340px; color:black; background-color: black;">	
						<legend> Saída de Cliente</legend>					
						<form id="saida" action="SaidaServlet">
								<label>CPF</label ><input type="number" name="cpfSaida" id="cpfSaida" style="color:black; margin: 4px 4px;">
								<input type="submit" name="retirarCliente" id="retirarCliente" style="position: absolute; top: 50px; left: 40px; width: 150px; color:black;" value="Retirar Cliente">
						</form>
					</fieldset>

					<li>
						<input type="radio" name="tabs" class="radios" id="radioReport">
						<label for="radioReport" class="tab_label">Relatorio</label>
						<div class="div-formulario">
							<h2 id="tR">Tipo de Relatorio</h2>
							
							<form id="radioTipo" action="BarServlet" method="post">
								<input type="radio" name="report" value="radioComp" id='radioComp' checked onclick="visible();"><label id="rcomp" for='radioComp'>Todas pessoas no bar</label>
								<input type="radio" name="report" value="radioCpf" id='radioCpf' onclick="visible();"><label id="rcpf" for='radioCpf'>Cliente por CPF</label>
								<input type="radio" name="report" value="radioQtd" id='radioQtd' onclick="visible();"s><label id="rqtd" for='radioQtd'>Qtde e Distribuicao(%)</label>

								<div id="radioResult">
									<div id='resultPCpf'>
										<label for='textPcpf'>CPF</label><input type="text" id='textPcpf' name="textPCpf" style="color:black;">			
									</div>
									<input type="submit" value="Gerar tabela" id="submitReport" style="color: black;">
									
								</div>	
							</form>				
						</div>
					</li>

				</li>
			</ul>
		</nav>
	</div>
</body>
</html>