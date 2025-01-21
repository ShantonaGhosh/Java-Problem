package Travel;

import java.util.ArrayList;
import java.util.Random;

public class TravelApp {

    private ArrayList<Flight> flights = new ArrayList<Flight>();
    private ArrayList<hotel> hotels = new ArrayList<hotel>();

    public void searchFlight(String origin, String destination, String date, int numOfPassanger) {
        System.out.println(" searching for flights from " + origin + " to " + destination + " on " + date + " for " + numOfPassanger + " passanger");

    }

    public void searchHotels(String location, String checkIn, String checkOut, int numGuests) {
        System.out.println("Searching for hotels in  " + location + " from " + checkIn + " to " + checkOut + " for " + numGuests + " guests.");
    }

    //------------flight booking--------
    public void bookFlight(int flightNumber, String passangerName, String origin, String destination, String date, int numOfPassanger, double price) {
        Flight flight = new Flight(flightNumber, passangerName, origin, destination, date, numOfPassanger, price);
        int confirmationNumber = generateConfirmationNumber();

        flight.setConfirmationNumber(confirmationNumber);

        flights.add(flight);
        System.out.println("Flight booked! Confirmation number: " + confirmationNumber);

    }

    //-------hotel bokking-----------
    public void bookHotel(int hotelId, String guestName, String location, String checkIn, String checkOut, int numGuests, double price) {
        hotel hotelbook = new hotel(hotelId, guestName, location, checkIn, checkOut, numGuests, price);
        int confirmationNumber = generateConfirmationNumber();
        hotelbook.setConfirmationNumber(confirmationNumber);
        hotels.add(hotelbook);
        System.out.println("Hotel booked! Confirmation number: " + confirmationNumber);

    }

    //------------cancel reservation--------
    public void cancelReservation(int confirmationNumber) {
        for (Flight flight : flights) {
            if (flight.getConfirmationNumber() == confirmationNumber) {
                flights.remove(flight);
                System.out.println("Flight reservation with confirmation number " + confirmationNumber + " cancelled.");
                return;
            }
        }

        for (hotel hotell : hotels) {
            if (hotell.getConfirmationNumber() == confirmationNumber) {
                hotels.remove(hotell);
                System.out.println("hotel reservation with confirmation number " + confirmationNumber + " cancelled.");

                return;
            }
        }

    }

    private int generateConfirmationNumber() {
        Random rand = new Random();
        return rand.nextInt(900000) + 100000;
    }

}
