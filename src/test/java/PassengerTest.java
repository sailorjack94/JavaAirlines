import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("John Smith", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("John Smith", passenger.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(2, passenger.getBags());
    }
}
