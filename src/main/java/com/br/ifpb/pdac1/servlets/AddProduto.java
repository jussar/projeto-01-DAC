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

import com.br.ifpb.pdac1.model.Produto;

@WebServlet ("/AddProduto")
public class AddProduto extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Produto p = new Produto();
		float precoproduto = Float.parseFloat(req.getParameter("precop"));
		p.setCodigo(req.getParameter("codigop"));
		p.setDescricao(req.getParameter("descricaop"));
		p.setNome(req.getParameter("nomep"));
		p.setPreco(precoproduto);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdac1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
            em.persist(p);
            et.commit();
        } catch(Exception e) {
        	resp.setContentType("text/plain");
			PrintWriter out = resp.getWriter();
			out.println("erro ao cadastrar o produto");
            e.printStackTrace();
        }
	}
}
