package uk.co.services.itinerary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.data.repository.query.Param;


@Named
@Path("/")
public class ItineraryRest implements ItineraryRepository {

private static List<Itinerary> itineraries = new ArrayList<Itinerary>();
	
	static {
		try {
			Itinerary itinerary1 = new Itinerary("London", "NY", new SimpleDateFormat("hh-mm-ss").parse("10-00-00"), new SimpleDateFormat("hh-mm-ss").parse("18-00-00"), 0);
			Itinerary itinerary2 = new Itinerary("London", "NY", new SimpleDateFormat("hh-mm-ss").parse("10-00-00"), new SimpleDateFormat("hh-mm-ss").parse("20-00-00"), 1);
			Itinerary itinerary3 = new Itinerary("London", "NY", new SimpleDateFormat("hh-mm-ss").parse("10-00-00"), new SimpleDateFormat("hh-mm-ss").parse("22-00-00"), 2);
			Itinerary itinerary4 = new Itinerary("London", "Dublin", new SimpleDateFormat("hh-mm-ss").parse("10-00-00"), new SimpleDateFormat("hh-mm-ss").parse("11-00-00"), 0);
			itineraries.add(itinerary1);
			itineraries.add(itinerary2);
			itineraries.add(itinerary3);
			itineraries.add(itinerary4);
		} catch (ParseException e) {
			System.out.println("Error while loading itineraries");
			e.printStackTrace();
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Itinerary> getItineraries() {
		return itineraries;
	}
	
	@GET
	@Path("Itinerary")
	@Produces(MediaType.APPLICATION_JSON)
	public Itinerary getItinerary(@QueryParam("id") long id) {
		Itinerary itinerary = null;
		for (Itinerary record : itineraries) {
			if (record.getId() == id) {
				itinerary = record;
				break;
			}	
		}
		return itinerary;
	}
	
	@GET
	@Path("Itinerary")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public List<Itinerary> findByConnections(@Param("destination") String destination, @Param("connections") int connections) {
		List<Itinerary> itinerariesByConnections = new ArrayList<Itinerary>();
		findByConnections("NY", 1).forEach(itinerary -> {
			itinerariesByConnections.add(itinerary);
		});		
		return itinerariesByConnections;
	}

	@GET
	@Path("Itinerary")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public List<Itinerary> findByTimeDifference(String destination) {
		List<Itinerary> itinerariesByTimeDifference = new ArrayList<Itinerary>();
		findByConnections("NY", 1).forEach(itinerary -> {
			itinerariesByTimeDifference.add(itinerary);
		});		
		return itinerariesByTimeDifference;
	}	
	
	@GET
	@Path("Itinerary")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public Optional<Itinerary> findById(Long id) {
		Optional<Itinerary> record = null;
		findById(1L).ifPresent(itinerary -> {
			return;
		});
		return record;
	}

	@Override
	public <S extends Itinerary> S save(S entity) {
		return null;
	}

	@Override
	public <S extends Itinerary> Iterable<S> saveAll(Iterable<S> entities) {
		return null;
	}	
	
	@Override
	public boolean existsById(Long id) {
		return false;
	}

	@Override
	public Iterable<Itinerary> findAll() {
		return null;
	}

	@Override
	public Iterable<Itinerary> findAllById(Iterable<Long> ids) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Long id) {
	
	}

	@Override
	public void delete(Itinerary entity) {
		
	}

	@Override
	public void deleteAll(Iterable<? extends Itinerary> entities) {

	}

	@Override
	public void deleteAll() {

	}
}