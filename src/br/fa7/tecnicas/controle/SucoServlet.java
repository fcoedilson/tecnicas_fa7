package br.fa7.tecnicas.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fa7.tecnicas.modelo.Suco;

@SuppressWarnings("serial")
@WebServlet("/suco")
public class SucoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String[] sabores = {"tangerina", "melão", "sapoti", "graviola", "tamarino", "melancia"};
		request.setAttribute("sabores", sabores);

		Suco suco = new Suco();
		request.setAttribute("suco", suco);
		RequestDispatcher rd = request.getRequestDispatcher("lanches.jsp");
		rd.forward(request, response);
	}

}
