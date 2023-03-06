package locations;

public class Airport extends Location{
    private int numberOfTerminals;
    public Airport(String name, float xCoordinate, float yCoordinate, int numberOfTerminals) {
        super(name, xCoordinate, yCoordinate);
        this.numberOfTerminals = numberOfTerminals;
    }

    @Override
    public String toString()
    {
        return "locations.Location: \nname: " + name + "\nx coordinate: " + xCoordinate + "\ny coordinate: " + yCoordinate + "\nnumber of terminals: " + numberOfTerminals;
    }
}
