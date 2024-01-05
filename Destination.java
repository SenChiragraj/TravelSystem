import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;

    // Constructors
    public Destination(String name, List<Activity> activities) {
        this.name = name;
        this.activities = activities;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
