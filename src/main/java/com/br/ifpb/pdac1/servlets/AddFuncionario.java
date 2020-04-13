package com.br.ifpb.pdac1.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.br.ifpb.pdac1.model.Funcionario;


@WebServlet("/AddFuncionario")
public class AddFuncionario extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Funcionario _funcionario = new Funcionario();
		_funcionario.setNome(req.getParameter("nomeF"));
		_funcionario.setEntrada(new java.sql.Date(new java.util.Date().getTime()));
		_funcionario.setCpf(req.getParameter("cpf"));
		_funcionario.setEndereco(req.getParameter("endereco"));
		@SuppressWarnings("deprecation")
		java.util.Date dataUtil = new java.util.Date(req.getParameter("nasf"));
		java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
		_funcionario.setNascimento(dataSql);		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdac1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		 try {
	            em.persist(_funcionario);
	            et.commit();
	            req.setAttribute("logado", "logado");
	        } catch(Exception e) {
	        	resp.setContentType("text/plain");
				PrintWriter out = resp.getWriter();
				out.println("Funcionario já Cadastrado");
	            e.printStackTrace();
	        }
	}

}
