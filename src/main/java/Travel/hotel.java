package Travel;

public class hotel {

    int hotelId;
    String guestName;
    private String location;
    private String checkIn;
    private String checkOut;
    private int numGuests;
    private double price;
    private int confirmationNumber;

    public hotel(int hotelId, String guestName, String location, String checkIn, String checkOut, int numGuests, double price) {
        this.hotelId = hotelId;
        this.guestName = guestName;
        this.location = location;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numGuests = numGuests;
        this.price = price;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    

}
