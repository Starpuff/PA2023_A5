import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Road {
    private String name;
    private RoadType type;
    private float length;
    private int speedLimit;
    private Location firstLocation;
    private Location secondLocation;

    //constructor:
    public Road(String name, RoadType type, float length, int speedLimit, Location firstLocation, Location secondLocation) throws Exception
    {

        this.name = name;
        this.type = type;
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
    public RoadType getType()
    {
        return type;
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
    public void setType(RoadType type)
    {
        this.type = type;
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
        return "Road: \nname: " + name + "\ntype: " + type + "\nlength: " + length + "\nspeed limit: " + speedLimit;
    }
}
