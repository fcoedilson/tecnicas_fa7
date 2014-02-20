package br.fa7.tecnicas.controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServerException {
		
		
		PrintWriter out = response.getWriter();
		out.println("<h1>" + new Date() + "</h1>");
	}

}
