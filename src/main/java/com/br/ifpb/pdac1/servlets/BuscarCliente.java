package com.br.ifpb.pdac1.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.br.ifpb.pdac1.model.Cliente;


@WebServlet ("/BuscarCliente")
public class BuscarCliente extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdac1");
		EntityManager em = emf.createEntityManager();
		String cpf = req.getParameter("cpfc");
		try {
	        em.getTransaction().begin();
	        Cliente  c =  em.find(Cliente.class, cpf);
	        System.out.println(c.getNome());
	        em.getTransaction().commit();
	    } catch (Exception e) {
	    	resp.setContentType("text/plain");
			PrintWriter out = resp.getWriter();
			out.println("cliente nao cadastrado");
	       e.printStackTrace();
	    } finally {
	        em.close(); //fecha o EntityManager        
	    }
	}

}
