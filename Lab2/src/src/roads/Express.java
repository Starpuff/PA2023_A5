package roads;

import locations.Location;

public class Express extends Road{
    public Express(String name, float length, int speedLimit, Location firstLocation, locations.Location secondLocation) throws Exception {
        super(name, length, speedLimit, firstLocation, secondLocation);
    }
}
