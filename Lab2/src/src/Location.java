public class Location {
    private String name;
    private LocationType type;
    private float xCoordinate;
    private float yCoordinate;

    //constructor
    public Location(String name, LocationType type, float xCoordinate, float yCoordinate)
    {
        this.name = name;
        this.type = type;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    //getters:
    public String getName()
    {
        return name;
    }
    public LocationType getType()
    {
        return type;
    }
    public float getXCoordinate()
    {
        return xCoordinate;
    }
    public float getYCoordinate()
    {
        return yCoordinate;
    }

    //setters:
    public void setName(String name)
    {
        this.name = name;
    }
    public void setType(LocationType type)
    {
        this.type = type;
    }
    public void setXCoordinate(float xCoordinate)
    {
        this.xCoordinate = xCoordinate;
    }
    public void setYCoordinate(float yCoordinate)
    {
        this.yCoordinate = yCoordinate;
    }

    //toString override:
    @Override
    public String toString()
    {
        return "Location: \nname: " + name + "\ntype: " + type + "\nx coordinate: " + xCoordinate + "\ny coordinate: " + yCoordinate;
    }
}
