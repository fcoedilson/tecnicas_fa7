package br.fa7.tecnicas.controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/carrinho.do")
public class CarrinhoServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		String var = request.getParameter("var");
		ArrayList<String> carrinho = null;
		
		if(session.isNew()){
			carrinho = new ArrayList<String>();
		} else {
			carrinho = (ArrayList<String>)session.getAttribute("carrinho");
		}
			
		if (var != null){
			carrinho.add(var);
		}
		
		session.setAttribute("carrinho", carrinho);
		for (String string : carrinho) {
			
			out.println("item:" + string + "<br/>");
		}
	
	}

}
