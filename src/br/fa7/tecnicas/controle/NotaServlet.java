package br.fa7.tecnicas.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pages/cadastronotas")
public class NotaServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setAttribute("erro", null);
		req.setAttribute("erro_sistema", null);	
		
		try {
			
			Float media = null; // variável media final
			Float vp1 = null;
			Float vp2 = null;
			Float vf = null;
			
			if (!req.getParameter("vp1").isEmpty() && !req.getParameter("vp2").isEmpty() 
					&& !req.getParameter("vf").isEmpty()){
			
				vp1 = Float.parseFloat(req.getParameter("vp1")); // recebe nota vp1
				vp2 = Float.parseFloat(req.getParameter("vp2")); // recebe nota vp2
				vf = Float.parseFloat(req.getParameter("vf"));   // recebe nota vf
				
				media = (vp1 + 2*vp2 + 3*vf)/6; // calculo da  media
				
				String[] notas = {vp1.toString(), vp2.toString(), vf.toString()}; // array das notas recebidas
				
				req.setAttribute("notas", notas);
				req.setAttribute("media", media);
				
			} else {
				
				req.setAttribute("erro", "NOTA FALTANDO ...");
			}

		} catch (Exception e) {

			req.setAttribute("erro_sistema", "PROBLEMA DE CONVERSÃO ...");	
		}
		
		
		RequestDispatcher rd = req.getRequestDispatcher("media.jsp");
		rd.forward(req, resp);
		
	}

}
