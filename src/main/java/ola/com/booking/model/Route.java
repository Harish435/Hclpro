package ola.com.booking.model;


public class Route {

	
	private int routeId;
	
	private String source;
	private String destination;
	private double duration;
	


	
	public Route() {
		
	}
	public Route(int routeId, String source, String destination, double duration) {
		super();
		this.routeId = routeId;
		this.source = source;
		this.destination = destination;
		this.duration = duration;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	
}
