package br.com.cardetails.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.cardetails.dao.AbastecimentoDAO;
import br.com.cardetails.util.DateUtil;

@WebServlet("/abastecimento.do")
public class AbastecimentoServlet extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		AbastecimentoDAO dao = new AbastecimentoDAO();
		
		try {

			HttpSession session = request.getSession();
			if (session == null){
				session = request.getSession();
			}
			
			String posto = request.getParameter("posto");
			String placa = request.getParameter("placa");
			Float valor =  Float.parseFloat(request.getParameter("valor"));
			Float quant =  Float.parseFloat(request.getParameter("quant"));
			Float kmatual =  Float.parseFloat(request.getParameter("kmatual"));
			Date data = DateUtil.parseStringAsDate(request.getParameter("data"));
			
			dao.insertAbastecimento(placa, kmatual, quant, valor, data, posto);
			
			session.setAttribute("sucess", "cadastrado foi salvo!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	
	}

}
