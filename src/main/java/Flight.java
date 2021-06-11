import people.CabinCrew;
import people.Passenger;
import people.Pilot;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNo;
    private String destination;
    private String departure;
    private String ToD;

    public Flight(String flightNo, PlaneType planeType, String destination, String departure, String ToD){
        this.flightNo = flightNo;
        this.planeType = planeType;
        this.destination = destination;
        this.departure = departure;
        this.ToD = ToD;
        this.pilots = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();

    }


}
