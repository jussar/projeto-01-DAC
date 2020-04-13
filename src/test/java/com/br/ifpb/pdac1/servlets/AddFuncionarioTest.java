package com.br.ifpb.pdac1.servlets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;


public class AddFuncionarioTest {

	@Test
	public void test() throws Exception{
		HttpServletRequest req = mock(HttpServletRequest.class);
		HttpServletResponse resp = mock(HttpServletResponse.class);

		when(req.getParameter("cpf")).thenReturn("111.111.000-00");
		when(req.getParameter("nomeF")).thenReturn("neyde villar real");
		when(req.getParameter("endereco")).thenReturn("barro-ce bairro:trajano noguiera r:alderlei cardoso");
		when(req.getParameter("nasf")).thenReturn("06/12/1996");
        
		new AddFuncionario().doPost(req, resp);
		
		verify(req).getParameter("cpf");
		verify(req).getParameter("nomeF");
		verify(req).getParameter("endereco");
		verify(req).getParameter("nasf");
		
	}

}
