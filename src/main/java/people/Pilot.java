package people;

public class Pilot extends Person{

    private Rank rank;
    private String licence;


    public Pilot(String name, Rank rank, String licence) {
        super(name);
        this.rank = rank;
        this.licence = licence;
    }

    public Rank getRank() {
        return rank;
    }

    public String getLicenceNo() {
        return licence;
    }

    public String flyPlane(){
        return "Ready for take-off!";
    }
}
