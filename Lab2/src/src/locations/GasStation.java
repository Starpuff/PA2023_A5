package locations;

public class GasStation extends Location{
    private float gasPrice;
    public GasStation(String name, float xCoordinate, float yCoordinate, float gasPrice) {
        super(name, xCoordinate, yCoordinate);
        this.gasPrice = gasPrice;
    }

    @Override
    public String toString()
    {
        return "locations.Location: \nname: " + name + "\nx coordinate: " + xCoordinate + "\ny coordinate: " + yCoordinate + "\ngas price: " + gasPrice;
    }
}
