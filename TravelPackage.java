import java.util.List;
import java.util.ArrayList;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private Itinerary itinerary;
    private List<Passenger> passengers;

    // Constructors, getters, and setters

    public TravelPackage(String name, int passengerCapacity, Itinerary itinerary) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = itinerary;
        this.passengers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void enrollPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
            System.out.println(passenger.getName() + " enrolled in " + name);
        } else {
            System.out.println("Cannot enroll " + passenger.getName() + ". Travel package is full.");
        }
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        System.out.println("Itinerary:");
        // Iterate through destinations and activities in the itinerary
        for (Destination destination : itinerary.getDestinations()) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("  Activity: " + activity.getName() + ", Cost: $" + activity.getCost()
                        + ", Capacity: " + activity.getCapacity() + ", Description: " + activity.getDescription());
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Passenger List for " + name);
        System.out.println("Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("  Passenger: " + passenger.getName() + ", Number: " + passenger.getPassengerNumber());
        }
    }

    public void printAvailableActivities() {
        System.out.println("Available Activities for " + name + ":");
        for (Destination destination : itinerary.getDestinations()) {
            for (Activity activity : destination.getActivities()) {
                if (activity.getCapacity() > 0) {
                    System.out.println("Destination: " + destination.getName());
                    System.out.println("  Activity: " + activity.getName());
                    System.out.println("    Cost: $" + activity.getCost());
                    System.out.println("    Capacity: " + activity.getCapacity());
                }
            }
        }
    }

    // Other methods specific to managing the travel package
}
