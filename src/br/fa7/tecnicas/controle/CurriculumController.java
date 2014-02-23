package br.fa7.tecnicas.controle;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fa7.tecnicas.modelo.Curriculum;

@WebServlet("/curriculum")
public class CurriculumController extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		Curriculum c = new Curriculum();

		// dados pessoais
		
		c.setNome(request.getParameter("nome"));
		c.setRg(request.getParameter("rg"));
		c.setCpf(request.getParameter("cpf"));
		c.setTelefone(request.getParameter("telefone"));
		c.setEmail(request.getParameter("email"));
		c.setDataNascimento( new Date(request.getParameter("dtnasc")));
		c.setNaturalidade(request.getParameter("natural"));
		String sexo = request.getParameter("sexo");
		
		//endereco
		c.setEndereco(request.getParameter("lograd") + ", " + request.getParameter("numero") + 
				" - " + request.getParameter("complemento") + " " + request.getParameter("bairro") +
				" " + request.getParameter("cep") );

		
		// dados profissionais
		c.setEmpresa(request.getParameter("empresa"));
		c.setCargo(request.getParameter("cargo"));
		c.setAdmissao(new Date(request.getParameter("admissao")));
		c.setDesligamento(new Date(request.getParameter("desligamento")));
		c.setCompetencias(request.getParameterValues("competencias")[0]);
		
		c.setPropostaSalarial(request.getParameter("proposta_salarial"));
		
		request.setAttribute("curriculum", c);
		RequestDispatcher dispatcher = request.getRequestDispatcher("pages/confirmacaoCadastro.jsp");
		dispatcher.forward(request, response);
		
	}
}
