package people;

public class Pilot extends Person{

    private String rank;
    private String licence;


    public Pilot(String name, String rank, String licence) {
        super(name);
        this.rank = rank;
        this.licence = licence;
    }

}
