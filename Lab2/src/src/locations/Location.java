package locations;

public abstract class Location {
    /**
     * Location is an abstract class that represents a node in the graph.
     * It is marked as abstract because it is not meant to be instantiated. Therefore, it will be used by the following classes:
     *     - Airport
     *     - City
     *     - GasStation
     *
     * The properties of a location are:
     *    - name: String
     *    - xCoordinate: float
     *    - yCoordinate: float
     */
    protected String name;
    protected float xCoordinate;
    protected float yCoordinate;

    /**
     * Constructor for the class.
     * @param name the name of the location
     * @param xCoordinate the longitude of the location
     * @param yCoordinate the latitude of the location
     */
    public Location(String name, float xCoordinate, float yCoordinate)
    {
        this.name = name;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

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

    /**
     * This method returns a string representation of the object.
     * @return a string representation of the object in the form of "locations.Location: \nname: name \nx coordinate: xCoordinate \ny coordinate: yCoordinate"
     */
    @Override
    public String toString()
    {
        return "locations.Location: \nname: " + name + "\nx coordinate: " + xCoordinate + "\ny coordinate: " + yCoordinate;
    }

    /**
     * This method checks if two objects are equal.
     * @param obj the object to be compared with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Location)) return false;
        Location loc = (Location) obj;
        return loc.xCoordinate == xCoordinate && loc.yCoordinate == yCoordinate && name == loc.name;
    }
}
