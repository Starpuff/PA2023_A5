package locations;

public class City extends Location{
    private int population;
    public City(String name, float xCoordinate, float yCoordinate, int population) {
        super(name, xCoordinate, yCoordinate);
        this.population = population;
    }

    @Override
    public String toString()
    {
        return "locations.Location: \nname: " + name + "\nx coordinate: " + xCoordinate + "\ny coordinate: " + yCoordinate + "\npopulation: " + population;
    }
}
