import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger;

    @Before
    public void before(){
        flight = new Flight("BA714", PlaneType.BOEING737, "LHR", "GLA", "16:25");
        passenger = new Passenger("John Smith", 2);
    }

    @Test
    public void flightHasNo(){
        assertEquals("BA714", flight.getFlightNo());
    }

    @Test
    public void flightHasPlaneType(){
        assertEquals(PlaneType.BOEING737, flight.getPlaneType());
    }

    @Test
    public void flightHasDest(){
        assertEquals("LHR", flight.getDestination());
    }

    @Test
    public void flightHasDep(){
        assertEquals("GLA", flight.getDeparture());
    }

    @Test
    public void flightHasToD(){
        assertEquals("16:25", flight.getToD());
    }

    @Test
    public void flightHasPilotList(){
        assertEquals(0, flight.getPilots().size());
    }

    @Test
    public void flightHasCrew(){
        assertEquals(0, flight.getCabinCrew().size());
    }

    @Test
    public void flightHasPax(){
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void testEmptySeats(){
        assertEquals(flight.getPlaneType().getCapacity(), flight.returnEmptySeats());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(186, flight.returnEmptySeats());
    }




}
