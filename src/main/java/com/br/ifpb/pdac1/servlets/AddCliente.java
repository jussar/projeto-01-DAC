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

@WebServlet ("/AddCliente")
public class AddCliente extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cliente c = new Cliente();
		c.setCpf(req.getParameter("cpfc"));
		c.setNome(req.getParameter("nomec"));
		c.setEndereco(req.getParameter("endC"));
		c.setEmail(req.getParameter("emailC"));
		c.setTelefone(req.getParameter("telC"));
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdac1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		 try {
	            em.persist(c);
	            et.commit();
	        } catch(Exception e) {
	        	resp.setContentType("text/plain");
				PrintWriter out = resp.getWriter();
				out.println("Cliente ja existente");
	            e.printStackTrace();
	        }
	}
}
