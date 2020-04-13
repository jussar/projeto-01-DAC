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

import com.br.ifpb.pdac1.model.Funcionario;


@WebServlet ("/LoginFuncionario")
public class LoginFuncionario extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdac1");
		EntityManager em = emf.createEntityManager();
		String cpf = req.getParameter("lcpff");
		try {
	        em.getTransaction().begin();
	        Funcionario  f =  em.find(Funcionario.class, cpf);
	        em.getTransaction().commit();
	        //impede q o login errado de acesso a pg funcionario.jsp
	        System.out.println(f.getCpf());
	    } catch (Exception e) {
	    	resp.setContentType("text/plain");
			PrintWriter out = resp.getWriter();
			out.println("erro ao buscar o cpf");
	        em.getTransaction().rollback();
	    } finally {
	        em.close(); //fecha o EntityManager        
	    }
		
	}
	
}
