package br.edu.fa7.tecnicas.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.fa7.tecnicas.dao.AlunoDAO;

@WebServlet("/insertAluno.do")
public class AlunoServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String nome = request.getParameter("nome");
		String matricula = request.getParameter("matricula");
		
		AlunoDAO alunoDao = new AlunoDAO();
		alunoDao.insertAluno(nome, matricula);
		
		
		RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
		rs.forward(request, response);
		
	}

}
