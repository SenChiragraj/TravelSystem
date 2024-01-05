public class PremiumPassenger extends Passenger {
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber, 0);
    }

    @Override
    public void printDetails() {
        System.out.println("Premium Passenger Details:");
        System.out.println("- Name: " + getName());
        System.out.println("- Passenger Number: " + getPassengerNumber());
        System.out.println("- Status: Premium");

        if (!getEnrolledActivities().isEmpty()) {
            System.out.println("- Enrolled Activities:");
            for (EnrolledActivity enrolledActivity : getEnrolledActivities()) {
                System.out.println("  - Activity: " + enrolledActivity.getActivity().getName());
                System.out.println("    - Destination: " + enrolledActivity.getDestination().getName());
            }
        } else {
            System.out.println("No enrolled activities.");
        }
    }
}
