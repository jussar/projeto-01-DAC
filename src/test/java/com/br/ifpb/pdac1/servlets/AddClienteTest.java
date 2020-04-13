package com.br.ifpb.pdac1.servlets;

import static org.mockito.Mockito.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

public class AddClienteTest {


	@Test
	public void doPost() throws Exception{
		HttpServletRequest req = mock(HttpServletRequest.class);
		HttpServletResponse resp = mock(HttpServletResponse.class);
		


		when(req.getParameter("cpfc")).thenReturn("000.000.000-00");
		when(req.getParameter("nomec")).thenReturn("marcia viera delcastilho");
		when(req.getParameter("endC")).thenReturn("barro-ce bairro:trajano noguiera r:alderlei cardoso");
		when(req.getParameter("emailC")).thenReturn("mvd@gmail.com");
		when(req.getParameter("telC")).thenReturn("(88)99915-1386");
		
		new AddCliente().doPost(req, resp);
		
		 verify(req).getParameter("cpfc");
		 verify(req).getParameter("nomec");
		 verify(req).getParameter("endC");
		 verify(req).getParameter("emailC");
		 verify(req).getParameter("telC");
		 
	}

}
