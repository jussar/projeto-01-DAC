<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>

<div>
<a href="#" class="addproduto">+ Produto</a>
<a href="#" id="AddFun">+ Funcionario</a>
<a href="#" id="logFun">Login Funcionario</a>
</div>
	<table class="AdicionarFuncionario">
		<tr>
			<td>Nome Completo</td>
			<td><input type="text" id="nf" name="nf" /></td>
		</tr>
		<tr>
			<td>Data de Entrada</td>
			<td><input type="text" id="dtEntradaF" name="dtEntradaF" /></td>
		</tr>
		<tr>
		<td>Data de Nascimento</td>
		<td><input type="text" id="dtnf" name="dtnf"/></td>
		</tr>
		<tr>
		<td>Endereço</td>
		<td>
		<textarea rows="4" cols="40" id="enderecof" name="enderecof"></textarea>
		</td>
		</tr>
		<tr>
			<td>CPF</td>
			<td><input type="text" id="cpff" name="cpff" /></td>
		</tr>
		<tr>
		<td><input type="submit" value="Enviar" id="addF"/></td>
		</tr>
	</table>
	<table class="loginFuncionario">
	<tr>
	<td>Digite seu CPF</td>
	<td><input type="text" id="lf" name="lf"/></td>
	<td><input type="submit" value="Logar" id="logarf"/></td>
	</tr>
	</table>
	<table id="produto">
	<tr>
	<td>Nome do produto</td>
	<td><input type="text" id="nomeProduto" name="nomeProduto"/></td>
	</tr>
	<tr>
	<td>Descrição</td>
	<td><textarea rows="4" cols="50" id="descricaop" name="descricaop"></textarea></td>
	</tr>
	<tr>
	<td>Preço</td>
	<td><input type="text" id="preco" name="preco"/></td>
	</tr>
	<tr>
	<td><input type="submit" id="cadastrarProduto"/></td>
	</tr>
	</table>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="js/js.js" type="text/javascript"></script>
</body>
</html>