import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;

    @Before
    public void before(){
        flight = new Flight("BA714", PlaneType.BOEING737, "LHR", "GLA", "16:25");
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


}
