import models.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PassengerTest {

    private Passenger passenger;

    @BeforeEach
    public void setUp(){
        passenger = new Passenger("nimo", 0712345, "BA12345");
    }

    @Test
    public void canGetName(){
        assertThat(passenger.getName()).isEqualTo("nimo");
    }


}
