package br.fa7.tecnicas.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/confirmar")
public class Confirmar extends HttpServlet{

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		RequestDispatcher rd = request.getRequestDispatcher("pages/saudacaoCadastro.jsp");
		rd.forward(request, response);
	}
}
