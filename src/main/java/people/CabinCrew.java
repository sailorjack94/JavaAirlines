package people;

public class CabinCrew extends Person {

    private Rank rank;

    public CabinCrew(String name, Rank rank){
        super(name);
        this.rank = rank;
    }

    public Rank getRank(){
        return this.rank;
    }

    public String makeAnnouncement(){
        return "Please listen carefully to the following announcement.";
    }
}
