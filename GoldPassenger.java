public class GoldPassenger extends Passenger {
    public GoldPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, balance);
    }

    public void applyDiscount(double percentage) {
        double discountAmount = getBalance() * (percentage / 100.0);
        setBalance(getBalance() - discountAmount);
    }
}
