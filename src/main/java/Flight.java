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

    public String getFlightNo(){
        return this.flightNo;
    }

    public PlaneType getPlaneType(){
        return this.planeType;
    }

    public String getDestination(){
        return this.destination;
    }

    public String getDeparture(){
        return this.departure;
    }

    public String getToD(){
        return this.ToD;
    }

    public ArrayList<CabinCrew> getCabinCrew() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public int returnEmptySeats(){
        return planeType.getCapacity() - passengers.size();
    }

    public void bookPassenger(Passenger passenger){
        if (this.returnEmptySeats() > 0 ) {
            passengers.add(passenger);
        }
    }

}
