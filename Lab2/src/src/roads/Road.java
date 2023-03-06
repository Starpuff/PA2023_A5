package roads;

import locations.Location;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public abstract class Road {
    protected String name;
    protected float length;
    protected int speedLimit;
    protected Location firstLocation;
    protected Location secondLocation;

    //constructor:
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

    //toString override
    @Override
    public String toString()
    {
        return "roads.Road: \nname: " + name + "\nlength: " + length + "\nspeed limit: " + speedLimit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Road)) {
            return false;
        }
        Road road = (Road) obj;
        return this.name.equals(road.name) && this.length == road.length ;
    }

}
