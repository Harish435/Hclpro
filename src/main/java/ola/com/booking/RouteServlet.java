package ola.com.booking;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ola.com.booking.dao.RouteDao;
import ola.com.booking.model.Route;
import ola.com.booking.service.RouteService;
import ola.com.booking.service.impl.RouteServiceImpl;

@WebServlet("/routes")
public class RouteServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RouteService routeService = new RouteServiceImpl();
	  

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//u have userId
		/*int id = Integer.parseInt(req.getParameter("kk"));
		System.out.println("id"+id);*/
		req.setAttribute("rList", routeService.getRoutes()); //all rout info + userId
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/routeview.jsp");
		
        rd.forward(req, resp);
	}
	private void showroutes(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		/*int id = Integer.parseInt(request.getParameter("id"));
		Route existingUser = routeService.selectUser(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);*/
		
		int id = Integer.parseInt(request.getParameter("id"));
		Route existingUser = routeService.selectroute(id);
		RequestDispatcher rd = request.getRequestDispatcher("user-form.jsp");
		request.setAttribute("rList", routeService.getRoutes());

	}
	
}
