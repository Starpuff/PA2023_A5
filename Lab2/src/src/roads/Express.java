package roads;

import locations.Location;

public class Express extends Road{
    /**
     * Constructor for the class.
     * @param name the name of the road
     * @param length the length of the road
     * @param speedLimit the speed limit of the road
     * @param firstLocation the first location of the road
     * @param secondLocation the second location of the road
     * @throws Exception if the length of the road is too short
     */
    public Express(String name, float length, int speedLimit, Location firstLocation, locations.Location secondLocation) throws Exception {
        super(name, length, speedLimit, firstLocation, secondLocation);
    }
}
