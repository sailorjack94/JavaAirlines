package people;

public class Passenger extends Person{

    private int NumberBags;

    public Passenger(String name, int NumberBags){
        super(name);
        this.NumberBags = NumberBags;
    }

}
