package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public abstract class Controller  extends HttpServlet{

	public final String DELETE = "delete";
	public final String CREATE = "create";
	public final String NEW = "new";
	public final String LIST = "list";
	public final String EDIT = "edit";
	public final String SEARCH = "search";
	public final String UPDATE = "update";

	public abstract void update(HttpServletRequest request, HttpServletResponse response);
	public abstract void edit(HttpServletRequest request, HttpServletResponse response) ;
	public abstract void list(HttpServletRequest request, HttpServletResponse response);
	public abstract void newer(HttpServletRequest request, HttpServletResponse response);
	public abstract void create(HttpServletRequest request, HttpServletResponse response);
	public abstract void delete(HttpServletRequest request, HttpServletResponse response);	

	public void executar(String action, 
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		if (action != null && action.equals(DELETE)){
			delete(request, response);

		} else if (action != null && action.equals(CREATE)){
			create(request, response);

		} else if (action.equals(NEW)){
			newer(request, response);	

		} else if (action != null && action.equals(LIST)){
			list(request, response);

		} else if(action != null && action.equals(SEARCH)){
			list(request, response);	

		}else if(action != null && action.equals(EDIT)){
			edit(request, response);

		}else if(action != null && action.equals(UPDATE)){
			update(request, response);

		}
	}

	public void dispatch(String page, 
			HttpServletRequest request, 
			HttpServletResponse response)
					throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
