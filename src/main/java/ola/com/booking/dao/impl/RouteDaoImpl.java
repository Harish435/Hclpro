package ola.com.booking.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ola.com.booking.ConectionManager;
import ola.com.booking.dao.RouteDao;
import ola.com.booking.model.Route;

public class RouteDaoImpl implements RouteDao{

	Connection conn= ConectionManager.getConnection();
	private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";

	@Override
	public List<Route> getRoutes() {
		List<Route> routeList = new ArrayList<Route>();
		try {
			ResultSet result = conn.createStatement().executeQuery("select * from route");
			while(result.next()) {
				Route route = new Route();
				route.setRouteId(result.getInt("routeId"));
				route.setDestination(result.getString("destination"));
				route.setSource(result.getString("source"));
				route.setDuration(result.getDouble("duration"));
				routeList.add(route);
				
			}
			return routeList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Route selectroute(int id) {
		Route route = null;
		// Step 1: Establishing a Connection
		try  {
			PreparedStatement preparedStatement = conn.prepareStatement(SELECT_USER_BY_ID);
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String name = rs.getString("source");
				String email = rs.getString("destination");
				double country = rs.getDouble("duration");
				route = new Route(id,name,email,country);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return route;
	}

}
