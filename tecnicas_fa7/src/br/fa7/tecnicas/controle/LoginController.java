package br.fa7.tecnicas.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login.do")
public class LoginController extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response)
			throws ServletException, 
			IOException {

		HttpSession session = request.getSession();
		String usuarioLogado = request.getParameter("usuario");
		String senha = request.getParameter("senhas");
		
		if(session.isNew()){
			session.setAttribute("usuario", usuarioLogado);
			request.getParameter("usuario");
		} else {
			session.setAttribute("usuario", usuarioLogado);
			session.setAttribute("sessao", "Sessão já aberta");
		}
			
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
		
	}

}
