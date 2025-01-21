package problem_solving;

import java.time.LocalTime;

public class Airplane {

    public String flightNumber;
    public String destination;
    public LocalTime scheduleDeparture;
    public int delayTime;

    public Airplane(String flightNumber, String destination, LocalTime scheduleDeparture) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.scheduleDeparture = scheduleDeparture;
        this.delayTime = 0;
    }

    public void delayTime(int minute) {
        this.delayTime = minute;
        this.scheduleDeparture = this.scheduleDeparture.plusMinutes(minute);

    }

    public void checkStatus() {
        if (delayTime == 0) {
            System.out.println("Flight " + flightNumber + " is on time.");

        } else {
            System.out.println("Flight " + flightNumber + " is delayed by." + delayTime + " minutes");
        }

    }

}
