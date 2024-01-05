import java.util.List;

public class Itinerary {
    private List<Destination> destinations;

    // Constructors
    public Itinerary(List<Destination> destinations) {
        this.destinations = destinations;
    }

    // Getters and Setters
    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }
}
