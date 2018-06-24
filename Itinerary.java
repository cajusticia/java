package uk.co.services.itinerary;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class Itinerary {

	//private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	private String origin;
	private String destination;
	private Date departureTime;
	private Date arrivalTime;
	private int connections;

	protected Itinerary() {}

	public Itinerary(String origin, String destination, Date departureTime, Date arrivalTime, int connections) {		
	    this.origin = origin;
	    this.destination = destination;
	    this.departureTime = departureTime;
	    this.arrivalTime = arrivalTime;
	    this.connections = connections;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getConnections() {
		return connections;
	}

	public void setConnections(int connections) {
		this.connections = connections;
	}

	@Override
	public String toString() {
		return "Itinerary [id=" + id + ", origin=" + origin + ", destination="
				+ destination + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + ", connections="
				+ connections + "]";
	}
}