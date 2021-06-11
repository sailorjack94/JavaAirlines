import org.junit.Before;
import org.junit.Test;
import people.CabinCrew;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Jane Smith", Rank.PURSER);
    }

    @Test
    public void hasName(){
        assertEquals("Jane Smith", cabinCrew.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.PURSER, cabinCrew.getRank());
    }

}
