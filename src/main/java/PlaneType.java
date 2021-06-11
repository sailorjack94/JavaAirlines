public enum PlaneType {

    BOEING737(188, 80000),
    AIRBUSA380(555, 500000);

    private int capacity;
    private int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getWeight(){
        return this.weight;
    }
}
