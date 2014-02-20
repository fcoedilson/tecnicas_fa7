package br.fa7.tecnicas.controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/spoleto")
public class Spoleto extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
			
			
			//PrintWriter out = response.getWriter();
			
			String nome = request.getParameter("nome");
			String massa = request.getParameter("massa");
			String molho = request.getParameter("molho");
			String critica = request.getParameter("critica");
			String[] ingredientes = request.getParameterValues("ingredientes");
			
			request.setAttribute("nome", nome);
			request.setAttribute("massa", massa);
			request.setAttribute("molho", molho);
			request.setAttribute("ingrediente", ingredientes[0]);
			request.setAttribute("critica", critica);
			
			//out.println("<h1> O nome é :"  + nome +"</h1>");
			//out.println("<h1> A massa é :"  + massa +"</h1>");
			//out.println("<h1> O molho é :"  + molho +"</h1>");
			//out.println("<h1> O ingrediente é :"  + ingredientes[0] +"</h1>");
			//out.println("<h1> A critica é :"  + critica +"</h1>");
			
			RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
			
		}

}
