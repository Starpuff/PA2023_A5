package locations;

public class City extends Location{
    /**
     * City is a subclass of Location. Therefore, it inherits all the properties of Location and represents a node in the graph.
     * It has the following properties:
     *   - name: String
     *   - xCoordinate: float
     *   - yCoordinate: float
     *   - population: int
     */
    private int population;

    /**
     * Constructor for the class.
     * @param name the name of the city
     * @param xCoordinate the longitude of the city
     * @param yCoordinate the latitude of the city
     * @param population the population of the city
     */
    public City(String name, float xCoordinate, float yCoordinate, int population) {
        super(name, xCoordinate, yCoordinate);
        this.population = population;
    }

    /**
     * Override of the toString method
     * @return a string containing the name, x coordinate, y coordinate and population of the city
     */
    @Override
    public String toString()
    {
        return "locations.Location: \nname: " + name + "\nx coordinate: " + xCoordinate + "\ny coordinate: " + yCoordinate + "\npopulation: " + population;
    }
}
