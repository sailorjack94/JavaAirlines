import org.junit.Before;
import org.junit.Test;
import people.Pilot;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Tom Cruise", Rank.CAPTAIN, "JZ2867");
    }

    @Test
    public void pilotHasName() {
        assertEquals("Tom Cruise", pilot.getName());
    }

    @Test
    public void pilotHasRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicence() {
        assertEquals("JZ2867", pilot.getLicenceNo());
    }

}
