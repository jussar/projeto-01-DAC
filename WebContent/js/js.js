$(".loginFuncionario").hide();
$(".AdicionarFuncionario").hide();
$("#produto").hide();
$("#addCliente").hide();
$("#buscaCliente").hide();
$("#fecharVenda").hide();


$(".vender").click(function() {
	$("#buscaCliente").show();
});

$(".addproduto").click(function() {
	$("#produto").show();
	$(".loginFuncionario").hide();
	$(".AdicionarFuncionario").hide();
});

$("#AddFun").click(function() {
	$("#produto").hide();
	$(".loginFuncionario").hide();
	$(".AdicionarFuncionario").show();
});

$("#logFun").click(function() {
	$("#produto").hide();
	$(".loginFuncionario").show();
	$(".AdicionarFuncionario").hide();
});

function dataAtualFormatada(){
    var data = new Date(),
        dia  = data.getDate().toString(),
        diaF = (dia.length == 1) ? '0'+dia : dia,
        mes  = (data.getMonth()+1).toString(), //+1 pois no getMonth Janeiro começa com zero.
        mesF = (mes.length == 1) ? '0'+mes : mes,
        anoF = data.getFullYear();
    return diaF+"/"+mesF+"/"+anoF;
}

$("#dtEntradaF").val(dataAtualFormatada());
$("#dtEntradaF").prop('disabled', true);

$("#addF").click(function() {
	var nome = $("#nf").val();
	var cpf = $("#cpff").val();
	var dtnasf = $("#dtnf").val();
	var enderecof = $("#enderecof").val();
	$.ajax({

		url : "/pdac1/AddFuncionario",
		data : {
			nomeF: nome, cpf: cpf, nasf: dtnasf, endereco: enderecof
		},
		type : "post",
		success : function(data) {

			if (data.length > 1) {
				alert(data);
			} else {
				window.location.href = "reestrito/funcionario.jsp";
			}
		},
		error : function() {
			alert("erro");
		}
	});

});

$("#logarf").click(function() {
	var cpf = $("#lf").val();
	$.ajax({

		url : "/pdac1/LoginFuncionario",
		data : {
			lcpff: cpf
		},
		type : "post",
		success : function(data) {

			if (data.length > 1) {
				alert(data);
			} else {
				window.location.href = "reestrito/funcionario.jsp";
			}
		},
		error : function() {
			alert("erro");
		}
	});

});

function geradordecodigo(){
    var cod = "";

    for (var x=0; x<5; x++){
        var j = Math.floor(Math.random()*10).toString();
        cod = cod +""+ j.toString();
    }
    return cod;
}

$("#cadastrarProduto").click(function() {
	var nome = $("#nomeProduto").val();
	var descricao = $("#descricaop").val();
	var preco = $("#preco").val();
	var codigo = geradordecodigo();
	alert(codigo);
	$.ajax({

		url : "/pdac1/AddProduto",
		data : {
			nomep: nome, descricaop: descricao, precop:preco, codigop: codigo
		},
		type : "post",
		success : function(data) {

			if (data.length > 1) {
				alert(data);
			} else {
				alert("Produto cadastardo o codigo do produtoo é: "+codigo);
				window.location.href = "index.jsp";
			}
		},
		error : function() {
			alert("erro");
		}
	});

});


$("#bc").click(function() {
	var cpf = $("#cpfc").val();
	$.ajax({

		url : "/pdac1/BuscarCliente",
		data : {
			cpfc: cpf
		},
		type : "post",
		success : function(data) {

			if (data.length > 1) {
				alert(data);
				$("#addCliente").show();
				$("#buscaCliente").hide();
				$("#fecharVenda").hide();
			} else {
				$("#fecharVenda").show();
				$("#addCliente").hide();
				$("#buscaCliente").hide();
			}
		},
		error : function() {
			alert("erro");
		}
	});

});

$("#CadCliente").click(function() {
	var cpf = $("#cpfc").val();
	var nome = $("#nomeCliente").val();
	var endereco = $("#enderecoC").val();
	var email = $("#emailc").val();
	var tel = $("#telc").val();
	$.ajax({

		url : "/pdac1/AddCliente",
		data : {
			cpfc: cpf, nomec:nome,endC: endereco,emailC: email, telC:tel
		},
		type : "post",
		success : function(data) {

			if (data.length > 1) {
				alert(data);
				window.location.href = "funcionario.jsp";
				$("#addCliente").hide();
				$("#buscaCliente").hide();
				$("#fecharVenda").hide();
				
			} else {
				
				$("#fecharVenda").show();
				$("#addCliente").hide();
				$("#buscaCliente").hide();
			}
		},
		error : function() {
			alert("erro");
		}
	});

});


$("#confirmarVenda").click(function() {
	var cpfv1 = $("#cpfv").val();
	var cpfc = $("#cpfcli").val();
	var codp = $("#codProduto").val();
	$.ajax({

		url : "/pdac1/FecharVenda",
		data : {
			cod_produto: codp, cpfc:cpfc,cpfv:cpfv1
		},
		type : "post",
		success : function(data) {

			if (data.length > 1) {
				alert(data);
			} else {
				alert("venda concluida");
				window.location.reload();
			}
		},
		error : function() {
			alert("erro");
		}
	});

});

