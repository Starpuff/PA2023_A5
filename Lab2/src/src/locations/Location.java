package locations;

public abstract class Location {
    protected String name;
    protected float xCoordinate;
    protected float yCoordinate;

    //constructor
    public Location(String name, float xCoordinate, float yCoordinate)
    {
        this.name = name;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    //getters:
    public String getName()
    {
        return name;
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
    public void setXCoordinate(float xCoordinate)
    {
        this.xCoordinate = xCoordinate;
    }
    public void setYCoordinate(float yCoordinate)
    {
        this.yCoordinate = yCoordinate;
    }

    //overrides:
    @Override
    public String toString()
    {
        return "locations.Location: \nname: " + name + "\nx coordinate: " + xCoordinate + "\ny coordinate: " + yCoordinate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Location)) return false;
        Location loc = (Location) obj;
        return loc.xCoordinate == xCoordinate && loc.yCoordinate == yCoordinate && name == loc.name;
    }
}
