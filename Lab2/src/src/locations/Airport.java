package locations;

public class Airport extends Location{
    /**
     * Airport is a subclass of Location. Therefore, it inherits all the properties of Location and represents a node in the graph.
     * It has the following properties:
     *    - name: String
     *    - xCoordinate: float
     *    - yCoordinate: float
     *    - numberOfTerminals: int
     */
    private int numberOfTerminals;

    /**
     * Constructor for the class.
     * @param name the name of the airport
     * @param xCoordinate the longitude of the airport
     * @param yCoordinate the latitude of the airport
     * @param numberOfTerminals the number of terminals in the airport
     */
    public Airport(String name, float xCoordinate, float yCoordinate, int numberOfTerminals) {
        super(name, xCoordinate, yCoordinate);
        this.numberOfTerminals = numberOfTerminals;
    }

    /**
     * Override of the toString method
     * @return a string containing the name, x coordinate, y coordinate and number of terminals of the airport
     */
    @Override
    public String toString()
    {
        return "locations.Location: \nname: " + name + "\nx coordinate: " + xCoordinate + "\ny coordinate: " + yCoordinate + "\nnumber of terminals: " + numberOfTerminals;
    }
}
