package com.br.ifpb.pdac1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Venda {

	@ManyToOne
	@JoinColumn(name = "cpf_cliente")
	private Cliente cpf_cliente;
	@ManyToOne
	@JoinColumn(name = "cpf_vendedor")
	private Funcionario cpf_vendedor;
	@Id
	@OneToOne
	@JoinColumn (name = "cod_produto")
	private Produto cod_produto;
	
	public Cliente getCpf_cliente() {
		return cpf_cliente;
	}
	public void setCpf_cliente(Cliente cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}
	public Funcionario getCpf_vendedor() {
		return cpf_vendedor;
	}
	public void setCpf_vendedor(Funcionario cpf_vendedor) {
		this.cpf_vendedor = cpf_vendedor;
	}
	public Produto getCod_produto() {
		return cod_produto;
	}
	public void setCod_produto(Produto cod_produto) {
		this.cod_produto = cod_produto;
	}
	
}
