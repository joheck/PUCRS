<%@page import="com.sun.corba.se.impl.javax.rmi.CORBA.Util"%>
<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
	<head>
		<title>Form</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="css/style.css" type="text/css">
		

	</head>
	<body>
		<div id="div_tabs">	
			<nav class="nav_tabs">
				<ul>
					<li>
						<input type="radio" id="radioRegister" class="radios" name="tabs" checked>
						<label for="radioRegister" class="tab_label">Registro</label>
						<div class="div-formulario" id="formRegister">
							<fieldset>
								<form class="form2">
        							<div class="field">
          								 <label for="nome">Nome</label>
          								 <input type="text" id="nome" max="40" maxlength="30" style="width: 420px;">
       								 </div>
     							     <div class="field">
          								  <label for="cpf">CPF</label>
       									 <input type="number" id="cpf" max="40" maxlength="30">
     							     </div>
     							      <div class="field">
          								  <label for="idade">Idade</label>
       									 <input type="number" id="idade" max="100" min="18" style="width: 30px;" value="18">
     							     </div>
     							      <div class="field">
          								  <label for="genero">Genero</label>
       									 <input type="number" id="genero" max="40" maxlength="30">
     							     </div>
     							     <div class="field">
     							     
     							     
          								  <label for="socio">n° socio</label>
       									 <input type="checkbox" id="checkSocio" max="40" maxlength="30" style="margin-left: -79px;" onclick="document.getElementById('socio').disabled = !this.checked;" >
     							    	 <input type="number" id="socio" max="40" maxlength="30" style="margin-left: -85px; width: 176px;" disabled autofocus>
     							    	  <div class="field">
     							    	 <input type="submit" formaction="https://www.google.com.br" value="registrar" target="blank">
     							    	 </div>
     							     </div>
  							   </form>
							
						</div>
					</li>
					<li>
						<input type="radio" name="tabs" class="radios" id="radioReport">
						<label for="radioReport" class="tab_label">Relatório</label>
						<div class="div-formulario">
							<h2>Title 2</h2>
							
						</div>
					</li>
						</div>
					</li>
				</ul>
			</nav>
		</div>

		
	</body>
</html>