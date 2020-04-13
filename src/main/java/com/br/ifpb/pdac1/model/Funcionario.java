package com.br.ifpb.pdac1.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario {

	private String nome;
	@Id
	private String cpf;
	private Date entrada;
	private Date nascimento;
	private String endereco;

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	@SuppressWarnings("deprecation")
	public int getIdade() {
		java.sql.Date dataSql = new java.sql.Date(new java.util.Date().getTime());
		int idade = dataSql.getYear() - nascimento.getYear();
		int mesAtual = dataSql.getMonth();
		int mesAniversario = nascimento.getMonth();
		if (mesAtual >= mesAniversario) {
			if (dataSql.getDay() >= nascimento.getDay()) {
				return idade;
			}
		}

		return idade--;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}