package br.fa7.tecnicas.controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		ArrayList carros =  new ArrayList(); //{"Palio", "KA", "UP", "L200"};//////////////////////////]
		carros.add("Palio");
		carros.add("Carro");
		carros.add("L200");
		request.setAttribute("carros", carros);
		
		List tamanhos = new ArrayList();
		tamanhos.add("270 ml");
		tamanhos.add("400 ml");
		tamanhos.add("500 ml");
		
		request.setAttribute("tamanhos", tamanhos);
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("nome", "Francisco Edilson");
		map.put("email","fcoedilson@gmail.com");
		request.setAttribute("map", map);
		

		Suco suco = new Suco();
		request.setAttribute("suco", suco);
		RequestDispatcher rd = request.getRequestDispatcher("lanches.jsp");
		rd.forward(request, response);
	}

}
