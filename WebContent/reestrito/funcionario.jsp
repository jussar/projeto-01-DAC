<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<h1>${nomeC}</h1>
	<div>
		<a href="#" class="vender">vender</a> 
		<form action="../Sair" method="post">
		<input type="submit" value="sair"/>
		</form>
	</div>
	<table id="buscaCliente">
		<tr>
			<td>CPF do Cliente</td>
			<td><input type="text" id="cpfc" name="cpfc" /></td>
			<td><input type="submit" id="bc" /></td>
		</tr>
	</table>

	<table id="addCliente">
		<tr>
			<td>Nome do Cliente</td>
			<td><input type="text" id="nomeCliente" name="nomeCliente" /></td>
		</tr>
		<tr>
			<td>CPF do Cliente</td>
			<td><input type="text" id="cpfCliente" name="cpfCliente" /></td>
		</tr>
		<tr>
			<td>Endereço do cliente</td>
			<td><textarea rows="3" cols="40" id="enderecoC" name="enderecoC"></textarea></td>
		</tr>
		<tr>
			<td>Email do cliente</td>
			<td><input type="text" id="emailc" name="emailc"/></td>
		</tr>
		<tr>
			<td>telefone do cliente</td>
			<td><input type="text" id="telc" name="telc"/></td>
		</tr>
		<tr>
			<td><input type="submit" id="CadCliente" /></td>
		</tr>
	</table>

	<table id="fecharVenda">
	<tr>
	<td>CPF Vendedor: </td>
	<td><input type="text" id="cpfv" name="cpfv"/></td>
	</tr>
	<tr>
	<td>CPF do Cliente: </td>
	<td><input type="text" id="cpfcli" name="cpfcli" /></td>
	</tr>
	<tr>
	<td>Codigo do Produto: </td>
	<td><input type="text" id="codProduto" name="codProduto"/></td>
	</tr>
	<tr>
	<td><input type="submit" id="confirmarVenda"/></td>
	</tr>
	</table>
	
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="../js/js.js" type="text/javascript"></script>
</body>
</html>