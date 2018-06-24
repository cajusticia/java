package uk.co.services.restful;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import uk.co.services.itinerary.Itinerary;
@Named
@Path("/")

@RestController
public class BookingRest {
	

	private long id = 1;
	@Inject
	private RestTemplate restTemplate;

	@GET
	@Path("order")
	@Produces(MediaType.APPLICATION_JSON)
	public Booking submitBooking
	    (@QueryParam("origin") String London,
		 @QueryParam("destination") String NY) {
			Booking booking = new Booking();
			//List<Itinerary> itineraries = restTemplate.getForObject("http://localhost:8081/itinerary?id={id}", List.class, id);
			List<Itinerary> itineraries = restTemplate.getForObject("http://localhost:8082/itinerary?origin={London}&destination={NY}", 
					List.class, London, NY);
			booking.setListOfItineraries(itineraries);
			booking.setCustomerName("name");
			booking.setEmail("cajusticia@gmail.com");
			id++;
			return booking;
	}

	
}	
  