package locations;

public class GasStation extends Location{
    /**
     * Gas Station is a subclass of Location. Therefore, it inherits all the properties of Location and represents a node in the graph.
     * It has the following properties:
     *   - name: String
     *   - xCoordinate: float
     *   - yCoordinate: float
     *   - gasPrice: float
     */
    private float gasPrice;

    /**
     * Constructor for the class.
     * @param name the name of the gas station
     * @param xCoordinate the longitude of the gas station
     * @param yCoordinate the latitude of the gas station
     * @param gasPrice the price of gas at the gas station
     */
    public GasStation(String name, float xCoordinate, float yCoordinate, float gasPrice) {
        super(name, xCoordinate, yCoordinate);
        this.gasPrice = gasPrice;
    }

    /**
     * Override of the toString method
     * @return a string containing the name, x coordinate, y coordinate and gas price of the gas station
     */
    @Override
    public String toString()
    {
        return "locations.Location: \nname: " + name + "\nx coordinate: " + xCoordinate + "\ny coordinate: " + yCoordinate + "\ngas price: " + gasPrice;
    }
}
