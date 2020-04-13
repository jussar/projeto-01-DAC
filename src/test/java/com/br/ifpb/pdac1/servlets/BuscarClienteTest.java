package com.br.ifpb.pdac1.servlets;


import static org.mockito.Mockito.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.Test;



public class BuscarClienteTest {


	@Test
	public void doPost() throws Exception{
		HttpServletRequest req = mock(HttpServletRequest.class);
		HttpServletResponse resp = mock(HttpServletResponse.class);

			when(req.getParameter("cpfc")).thenReturn("000.000");
			new BuscarCliente().doPost(req, resp);
	        verify(req).setAttribute("cpf", "000.000");
		}

}
