public class EnrolledActivity {
    private Activity activity;
    private Destination destination;
    private double paidAmount;

    // Constructors
    public EnrolledActivity(Activity activity, Destination destination, double paidAmount) {
        this.activity = activity;
        this.destination = destination;
        this.paidAmount = paidAmount;
    }

    // Getters and Setters
    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }
}
