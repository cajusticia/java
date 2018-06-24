package uk.co.services.restful;

import java.util.List;

import uk.co.services.itinerary.Itinerary;

public class Booking {

	private long bookingId;
	
	private String customerName;
	
	private String email;
	
	private Itinerary itinerary;
	
	private List<Itinerary> listOfItineraries;

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Itinerary getItinerary() {
		return itinerary;
	}

	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}

	public List<Itinerary> getListOfItineraries() {
		return listOfItineraries;
	}

	public void setListOfItineraries(List<Itinerary> listOfItineraries) {
		this.listOfItineraries = listOfItineraries;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", customerName="
				+ customerName + ", email=" + email + ", listOfItineraries="
				+ listOfItineraries + "]";
	}
}
