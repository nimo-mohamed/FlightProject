package interfaces;

import models.Flight;
import models.Passenger;

public interface IBook {

    String bookPassenger(Passenger passenger, Flight flight);

    String cancelBooking(Passenger passenger, Flight flight);
}
