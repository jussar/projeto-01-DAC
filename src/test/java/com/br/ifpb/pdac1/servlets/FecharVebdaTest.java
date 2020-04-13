package com.br.ifpb.pdac1.servlets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

public class FecharVebdaTest{

	@Test
	public void test()  throws Exception{
		HttpServletRequest req = mock(HttpServletRequest.class);
		HttpServletResponse resp = mock(HttpServletResponse.class);

		when(req.getParameter("cod_produto")).thenReturn("12345");
		when(req.getParameter("cpfc")).thenReturn("000.000.000-00");
		when(req.getParameter("cpfv")).thenReturn("111.111.111-11");

		new FecharVenda().doPost(req, resp);
		
		verify(req).setAttribute("cod_produto", "12345");
		verify(req).setAttribute("cpfc", "000.000.000-00");
		verify(req).setAttribute("cpfv", "111.111.111-11");
	}

}
