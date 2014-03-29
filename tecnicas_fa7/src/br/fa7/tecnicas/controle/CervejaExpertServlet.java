package br.fa7.tecnicas.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fa7.tecnicas.modelo.CervejaExpert;

@WebServlet("/cervejaExpert")
public class CervejaExpertServlet extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		CervejaExpert cerveja = new CervejaExpert();
		req.setAttribute("tipo", req.getParameter("tipo_cerveja"));
		req.setAttribute("cervejas", cerveja.getByType(req.getParameter("tipo_cerveja")));
		
		RequestDispatcher rd = req.getRequestDispatcher("cerveja.jsp");
		rd.forward(req, resp);
		
	}

}
