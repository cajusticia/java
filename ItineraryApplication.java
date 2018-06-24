package uk.co.services.itinerary;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ItineraryApplication {

	//private static final Logger log = LoggerFactory.getLogger(ItineraryApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ItineraryApplication.class);
	}

	/*
	@Bean
	public CommandLineRunner demoForTripApplication(ItineraryRepository repository) {
		return (args) -> {
			repository.save(new Itinerary("London", "NY", new SimpleDateFormat("hh-mm-ss").parse("10-00-00"), new SimpleDateFormat("hh-mm-ss").parse("18-00-00"), 0));
			repository.save(new Itinerary("London", "NY", new SimpleDateFormat("hh-mm-ss").parse("10-00-00"), new SimpleDateFormat("hh-mm-ss").parse("20-00-00"), 1));
			repository.save(new Itinerary("London", "NY", new SimpleDateFormat("hh-mm-ss").parse("10-00-00"), new SimpleDateFormat("hh-mm-ss").parse("22-00-00"), 2));
			repository.save(new Itinerary("London", "Dublin", new SimpleDateFormat("hh-mm-ss").parse("10-00-00"), new SimpleDateFormat("hh-mm-ss").parse("11-00-00"), 0));

			//fetch all itineraries
			log.info("All itineraries");
			for (Itinerary itinerary : repository.findAll()) {
				log.info(itinerary.toString());
			}
			log.info("");
			
			//fetching an individual itinerary by ID
			log.info("Itinerary with Id=1L");
			repository.findById(1L).ifPresent(itinerary -> {
				log.info(itinerary.toString());
				log.info("");
			});

			//fetching itineraries by connections
			log.info("Itineraries found by destination with number of connections (1)");
			repository.findByConnections("NY", 1).forEach(itinerary -> {
				log.info(itinerary.toString());
			});
			log.info("");
			
			//fetching itineraries by destination and number of connections
			log.info("Trip found by destination (NY) order by time difference");
			repository.findByTimeDifference("NY").forEach(itinerary -> {
				log.info(itinerary.toString());
			});
			log.info("");
		};
	}*/
}