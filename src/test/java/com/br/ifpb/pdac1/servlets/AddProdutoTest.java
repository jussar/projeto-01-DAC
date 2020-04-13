package com.br.ifpb.pdac1.servlets;

import static org.mockito.Mockito.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;


public class AddProdutoTest {
	

	@Test
	public void doPost() throws Exception{
		HttpServletRequest req = mock(HttpServletRequest.class);
		HttpServletResponse resp = mock(HttpServletResponse.class);

		when(req.getParameter("nomep")).thenReturn("cama");
		when(req.getParameter("descricaop")).thenReturn("cama box");
		when(req.getParameter("codigop")).thenReturn("12345");
		when(req.getParameter("precop")).thenReturn("500");
		
		new AddProduto().doPost(req, resp);
		
		verify(req).getParameter("nomep");
		 verify(req).getParameter("descricaop");
		 verify(req).getParameter("codigop");
		 verify(req).getParameter("precop");
	}

}
