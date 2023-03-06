package roads;

import locations.Location;

public class Highway extends Road{
    public Highway(String name, float length, int speedLimit, Location firstLocation, Location secondLocation) throws Exception {
        super(name, length, speedLimit, firstLocation, secondLocation);
    }
}
