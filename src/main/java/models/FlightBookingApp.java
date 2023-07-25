package models;

import interfaces.IBook;

import java.util.ArrayList;


public class FlightBookingApp implements IBook{

    private ArrayList<Flight> flights;
    private ArrayList<Passenger> passengers;

    public void FLightBookingApp() {
        this.flights = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addFlight(){
        Flight flight = new Flight("Spain", "SP1",
        Weekday.MONDAY, TimeSlot.EVENING);
        this.flights.add(flight);

    }

    public void removeFlight(Flight flight){
        this.flights.remove(flight);
    }

    public void addPassenger(String name, int phoneNum, String id) {
        Passenger passenger = new Passenger("Mich",
                071234567, "BA12345");
        this.passengers.add(passenger);
    }

    public String bookPassenger(Passenger passenger, Flight flight) {
        flight.addPassenger(passenger);
        return "Successfully booked";
    }

    public String cancelBooking(Passenger passenger, Flight flight){
        flight.removePassenger(passenger);
        return "Booking cancelled";
    }

}


