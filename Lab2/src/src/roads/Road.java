package roads;

import locations.Location;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public abstract class Road {
    /**
     * Road is an abstract class that represents an edge in the graph.
     * It is marked as abstract because it is not meant to be instantiated. Therefore, it will be used by the following classes:
     *      - Highway
     *      - Express
     *      - Country
     * The properties of a road are:
     *      - name: String
     *      - length: float
     *      - speedLimit: int
     *      - firstLocation: Location
     *      - secondLocation: Location
     */
    protected String name;
    protected float length;
    protected int speedLimit;
    protected Location firstLocation;
    protected Location secondLocation;

    /**
     * Constructor for the class.
     * @param name the name of the road
     * @param length the length of the road
     * @param speedLimit the speed limit of the road
     * @param firstLocation the first location of the road
     * @param secondLocation the second location of the road
     * @throws Exception if the length of the road is too short
     */
    public Road(String name, float length, int speedLimit, Location firstLocation, Location secondLocation) throws Exception
    {

        this.name = name;
        this.speedLimit = speedLimit;
        this.firstLocation = firstLocation;
        this.secondLocation = secondLocation;
        float xDifference = firstLocation.getXCoordinate()-secondLocation.getXCoordinate();
        float yDifference = firstLocation.getYCoordinate()-secondLocation.getYCoordinate();
        if(length < sqrt( pow(xDifference, 2) - pow(yDifference, 2) ) )
        {
            throw new Exception("The length introduced is too short.");
        }
        else
            this.length = length;
    }

    //getters:
    public String getName()
    {
        return name;
    }
    public float getLength()
    {
        return length;
    }
    public int getSpeedLimit()
    {
        return speedLimit;
    }
    public Location getFirstLocation()
    {
        return firstLocation;
    }
    public Location getSecondLocation()
    {
        return secondLocation;
    }

    //setters:
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Sets the length of the road. If the length is too short, an exception is thrown.
     * @param length the length of the road
     * @throws Exception if the length of the road is too short
     */
    public void setLength(float length) throws Exception
    {
        float xDifference = firstLocation.getXCoordinate()-secondLocation.getXCoordinate();
        float yDifference = firstLocation.getYCoordinate()-secondLocation.getYCoordinate();
        if(length < sqrt( pow(xDifference, 2) - pow(yDifference, 2) ) )
            throw new Exception("The length introduced is too short.");
        else
            this.length = length;
    }
    public void setSpeedLimit(int speedLimit)
    {
        this.speedLimit = speedLimit;
    }
    public void setFirstLocation(Location firstLocation)
    {
        this.firstLocation = firstLocation;
    }

    public void setSecondLocation(Location secondLocation)
    {
        this.secondLocation = secondLocation;
    }

    /**
     * Overrides the toString method
     * @return a string containing the name, length and speed limit of the road
     */
    @Override
    public String toString()
    {
        return "roads.Road: \nname: " + name + "\nlength: " + length + "\nspeed limit: " + speedLimit;
    }

    /**
     * Overrides the equals method
     * @param obj the object to be compared
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Road)) {
            return false;
        }
        Road road = (Road) obj;
        return this.name.equals(road.name) && this.length == road.length ;
    }

}
