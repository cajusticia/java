--The application contains two main packages. The first one hosts functionality regarding itineraries. There are two main methods
in the ItinearyRepository class called findByConnections() and findByTimeDifference() mocking a pull-out process from a database.
--The second package contains a Booking application functionality that accounts for picking up information offered by the aforementioned API. This service will be in charged of rendering the information provided by the first one.

--In order to create the necessary jar file you need to run a maven build from your IDE using the pom.xml file. That will generate a 
file called adidas-0.0.1-SNAPSHOT   
 
