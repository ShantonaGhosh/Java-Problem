package Travel;

public class Flight {

    private int flightNumber;
   private String passengerName;
    private String origin;
    private String destination;
    private String date;
    private int numOfPassanger;
    private double price;
    private int confirmationNumber;

    public Flight(int flightNumber, String passengerName, String origin, String destination, String date, int numOfPassanger, double price) {
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.numOfPassanger = numOfPassanger;
        this.price = price;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }
    

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }
    

}
