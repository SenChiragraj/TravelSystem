import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private int passengerNumber;
    private double balance;
    private List<EnrolledActivity> enrolledActivities;

    // Constructors
    public Passenger(String name, int passengerNumber, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.enrolledActivities = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<EnrolledActivity> getEnrolledActivities() {
        return enrolledActivities;
    }

    public void setEnrolledActivities(List<EnrolledActivity> enrolledActivities) {
        this.enrolledActivities = enrolledActivities;
    }

    // Other methods
    public void enrollInActivity(TravelPackage travelPackage, Destination destination, Activity activity) {
        // Check if activity is available
        if (activity.getCapacity() > 0) {
            // Check if passenger has sufficient balance
            if (hasSufficientBalance(activity.getCost())) {
                EnrolledActivity enrolledActivity = new EnrolledActivity(activity, destination, activity.getCost());
                enrolledActivities.add(enrolledActivity);
                activity.decrementCapacity();
                deductBalance(activity.getCost());
                System.out.println(name + " enrolled in " + activity.getName() + " at " + destination.getName());
            } else {
                System.out.println("Insufficient balance for " + name + " to enroll in " + activity.getName());
            }
        } else {
            System.out.println("Activity " + activity.getName() + " at " + destination.getName() + " is full.");
        }
    }

    public void printDetails() {
        System.out.println("Passenger Details:");
        System.out.println("- Name: " + name);
        System.out.println("- Passenger Number: " + passengerNumber);
        System.out.println("- Balance: $" + balance);

        if (!enrolledActivities.isEmpty()) {
            System.out.println("- Enrolled Activities:");
            for (EnrolledActivity enrolledActivity : enrolledActivities) {
                System.out.println("  - Activity: " + enrolledActivity.getActivity().getName());
                System.out.println("    - Destination: " + enrolledActivity.getDestination().getName());
                System.out.println("    - Paid Amount: $" + enrolledActivity.getPaidAmount());
            }
        }
    }

    private boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }

    private void deductBalance(double amount) {
        balance -= amount;
    }


}
