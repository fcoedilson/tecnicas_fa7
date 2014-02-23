package br.fa7.tecnicas.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fa7.tecnicas.modelo.Time;

@WebServlet("/cadastrotime")
public class TimeServlet  extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		Time time = new Time();
		
		time.setNome(request.getParameter("nome"));
		time.setTecnico(request.getParameter("tecnico"));
		time.setTorcedores(Integer.parseInt(request.getParameter("torcedores") ));		
		time.setDivisao(request.getParameter("divisao"));
		time.setEstado(request.getParameter("estado"));
		
		request.setAttribute("time", time);

		RequestDispatcher rd = request.getRequestDispatcher("pages/time.jsp");
		rd.forward(request, response);
		
	}

}
