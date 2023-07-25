package models;

import java.util.ArrayList;

public class Flight {

    private String destination;
    private String flightId;
    private ArrayList <Passenger> passengers;
    private Weekday weekday;
    private TimeSlot timeSlot;


    public Flight(String destination, String flightId, Weekday weekday, TimeSlot timeSlot) {

        this.destination = destination;
        this.flightId = flightId;
        this.passengers = passengers;
        this.weekday = weekday;
        this.timeSlot = timeSlot;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Weekday getWeekday() {
        return weekday;
    }

    public void setWeekday(Weekday weekday) {
        this.weekday = weekday;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }
    
    public void addPassenger( Passenger passenger){
        passengers.add(passenger);
    }
    
    public void removePassenger( Passenger passenger){
        passengers.remove(passenger);
    }
}

