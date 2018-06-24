package uk.co.services.itinerary;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ItineraryRepository extends CrudRepository<Itinerary, Long> {

  String SELECT = "select t from Itinerary t where 1=1 and ";
  String ORDER_BY = "order by t.connections";
	
  @Query(SELECT + "t.destination=:destination and t.connections=:connections")
  List<Itinerary> findByConnections(@Param("destination") String destination, @Param("connections") int connections);

  @Query(SELECT + "t.destination= ?1 order by (t.arrivalTime - t.departureTime)")
  List<Itinerary> findByTimeDifference(@Param("destination") String destination);

}
