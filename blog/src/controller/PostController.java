package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Post;
import dao.PostDAO;

@SuppressWarnings("serial")
@WebServlet("/posts")
public class PostController extends Controller{

	String action = null;
	PostDAO dao = new PostDAO();


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		action = request.getParameter("action");
		
		if (action.equals(null)){
			dispatch("pages/home.jsp", request, response);
		} else {
			executar(action, request, response);
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		action = request.getParameter("action");
		if (action.equals(null)){
			dispatch("pages/home.jsp", request, response);
		} else {
			executar(action, request, response);
		}
	}

	@Override
	public void update(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void edit(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void list(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			
			List<Post> posts = dao.listAll();
			request.setAttribute("posts", posts);
			try {
				dispatch("pages/post/list.jsp", request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void newer(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			dispatch("pages/post/new.jsp", request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	


	@Override
	public void create(HttpServletRequest request, HttpServletResponse response) {

		
		try {
			String titulo = request.getParameter("titulo");
			String texto = request.getParameter("texto");
			Post post = new Post(titulo, texto);
			dao.save(post);
			
			list(request, response);
		
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

}
