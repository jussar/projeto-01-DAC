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

import com.br.ifpb.pdac1.model.Cliente;
import com.br.ifpb.pdac1.model.Funcionario;
import com.br.ifpb.pdac1.model.Produto;
import com.br.ifpb.pdac1.model.Venda;

@WebServlet ("/FecharVenda")
public class FecharVenda extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Funcionario f = new Funcionario();
		f.setCpf(req.getParameter("cpfv"));
		Cliente c = new Cliente();
		c.setCpf("cpfc");
		Produto p = new Produto();
		p.setCodigo(req.getParameter("cod_produto"));
		Venda v = new Venda();
		
		v.setCpf_vendedor(f);
		v.setCpf_cliente(c);
		v.setCod_produto(p);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdac1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
            em.persist(v);
            et.commit();
        } catch(Exception e) {
        	resp.setContentType("text/plain");
			PrintWriter out = resp.getWriter();
			out.println("venda nao pode ser confirmada");
            e.printStackTrace();
        }
	}
}
