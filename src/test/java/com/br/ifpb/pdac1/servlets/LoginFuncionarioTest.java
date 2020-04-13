package com.br.ifpb.pdac1.servlets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

public class LoginFuncionarioTest {

	@Test
	public void test() throws Exception{
		HttpServletRequest req = mock(HttpServletRequest.class);
		HttpServletResponse resp = mock(HttpServletResponse.class);

			when(req.getParameter("lcpff")).thenReturn("111.111.000-00");
			new LoginFuncionario().doPost(req, resp);
	        
	}

}
