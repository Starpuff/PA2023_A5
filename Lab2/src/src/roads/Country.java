package roads;

import locations.Location;

public class Country extends Road{
    public Country(String name, float length, int speedLimit, Location firstLocation, locations.Location secondLocation) throws Exception {
        super(name, length, speedLimit, firstLocation, secondLocation);
    }
}
