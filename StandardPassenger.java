public class StandardPassenger extends Passenger {
    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, balance);
    }

    public void deductBalance(double amount) {
        setBalance(getBalance() - amount);
    }
}
