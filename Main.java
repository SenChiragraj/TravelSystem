import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a sample itinerary
        Destination paris = new Destination("Paris", Arrays.asList(
                new Activity("Eiffel Tower Tour", "Visit the iconic Eiffel Tower", 50.0, 30),
                new Activity("Louvre Museum Visit", "Explore the famous Louvre Museum", 40.0, 40)
        ));

        Destination rome = new Destination("Rome", Arrays.asList(
                new Activity("Colosseum Tour", "Visit the historic Colosseum", 60.0, 25),
                new Activity("Vatican City Tour", "Explore Vatican City and St. Peter's Basilica", 55.0, 35)
        ));

        Itinerary itinerary = new Itinerary(Arrays.asList(paris, rome));

        // Create a travel package
        TravelPackage europeTour = new TravelPackage("Europe Tour", 50, itinerary);

        // Create passengers
        StandardPassenger johnDoe = new StandardPassenger("John Doe", 1, 1000);
        GoldPassenger aliceSmith = new GoldPassenger("Alice Smith", 2, 1500);
        PremiumPassenger bobJohnson = new PremiumPassenger("Bob Johnson", 3);

        // Enroll passengers in the travel package
        europeTour.enrollPassenger(johnDoe);
        europeTour.enrollPassenger(aliceSmith);
        europeTour.enrollPassenger(bobJohnson);

        // Print itinerary and passenger list
        europeTour.printItinerary();
        europeTour.printPassengerList();

        // Sample test case for enrolling in activities
        johnDoe.enrollInActivity(europeTour, paris, paris.getActivities().get(0));
        aliceSmith.enrollInActivity(europeTour, rome, rome.getActivities().get(1));

        // Print details of individual passengers
        johnDoe.printDetails();
        aliceSmith.printDetails();

        // Print details of available activities
        europeTour.printAvailableActivities();
    }
}
