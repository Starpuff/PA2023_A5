import locations.Location;
import roads.Road;

public class Problem {
    /**
     * Problem is a class that represents a problem. The problem is finding if there is a path between two locations.
     * The properties of a problem are:
     *    - startLocation: Location
     *    - finishLocation: Location
     *    - locations: Location[]
     *    - roads: Road[]
     *    - indexOfLocations: int
     *    - indexOfRoads: int
     *    - MAX_LOCATIONS: int
     *    - MAX_ROADS: int
     */
    private final int MAX_LOCATIONS = 1000;
    private final int MAX_ROADS = 1000;
    private Location startLocation;
    private Location finishLocation;
    private Location[] locations;
    private Road[] roads;
    private int indexOfLocations = 0;
    private int indexOfRoads = 0;

    /**
     * getIndexOfGivenLocation: returns the index of a given location in the locations array
     * @param givenLocation the location for which we want to find the index
     * @return the index of the given location
     */
    public int getIndexOfGivenLocation (Location givenLocation)
    {
        for(int index=0; index<= indexOfLocations;index++)
        {
            if(givenLocation.equals(locations[index]))
                return index;
        }
        return -1; //location not found
    }

    /**
     * doesLocationExist: checks if a given location exists in the locations array
     * @param newLocation the location we want to check
     * @return true if the location exists, false otherwise
     */
    public boolean doesLocationExist (Location newLocation)
    {
        for (int index=0; index <= indexOfLocations; index++)
        {
            if(locations[index].equals(newLocation))
                return true;
        }
        return false;
    }

    /**
     * doesRoadExist: checks if a given road exists in the roads array
     * @param newRoad the road we want to check
     * @return true if the road exists, false otherwise
     */
    public boolean doesRoadExist (Road newRoad)
    {
        if(indexOfRoads!=0)
            for (int index=0; index < indexOfRoads; index++)
            {
                if(roads[index].equals(newRoad))
                    return true;
            }
        return false;
    }

    // getters:
    public Location getStartLocation()
    {
        return this.startLocation;
    }
    public Location getFinishLocation()
    {
        return this.finishLocation;
    }
    public Location[] getLocations()
    {
        return locations;
    }
    public Road[] getRoads()
    {
        return roads;
    }
    public int getMAX_LOCATIONS ()
    {
        return this.MAX_LOCATIONS;
    }
    public int getMAX_ROADS()
    {
        return this.MAX_ROADS;
    }
    public int getIndexOfLocations()
    {
        return this.indexOfLocations;
    }
    public int getIndexOfRoads()
    {
        return this.indexOfRoads;
    }

    //setters:

    /*
    In vectorul meu de locations, locations[0] va fi mereu start location-ul, locations[1] va fi finish location-ul, iar restul vor fi celelalte locations  */

    /**
     * setStartLocation: sets the start location of the problem.
     * If the new start location is already a start location, it will not be added and the message "newStartLocation is already a start location" will be printed.
     * If the new start location is already a finish location, it will not be added and the message "newStartLocation can't be added as a start location because it already is a finish location" will be printed.
     * If the new start location doesn't exist in the locations array, it will be added.
     * If the new start location exists in the locations array, it will be moved to the first position.
     * If the new start location doesn't exist in the locations array and there is no more space for new locations, it will not be added and the message "No more space for new locations" will be printed.
     * @param newStartLocation the new start location of the problem
     */
    public void setStartLocation(Location newStartLocation) {
        if(locations[0].equals(newStartLocation))
            System.out.println(newStartLocation.getName() + " is already a start location");
        else if(locations[1].equals(newStartLocation))
            System.out.println(newStartLocation.getName() + " can't be added as a start location because it already is a finish location");
        else if(!doesLocationExist(newStartLocation) && indexOfLocations<MAX_LOCATIONS-1)
        {
            for(int index=indexOfLocations+1; index>=3; index--)
                locations[index] = locations [index-1];
            locations[2] = getStartLocation();
            locations[0] = newStartLocation;
            this.startLocation = newStartLocation;
            indexOfLocations++;
        }
        else if (!doesLocationExist(newStartLocation) && indexOfLocations>=MAX_LOCATIONS-1)
            System.out.println("No more space for new locations");
        else if (doesLocationExist(newStartLocation))
        {
            int newLocationIndex = getIndexOfGivenLocation(newStartLocation);
            if(newLocationIndex != -1)
            {
                for(int index = getIndexOfGivenLocation(newStartLocation); index>=3;index--)
                    locations[index] = locations[index-1];
                locations[2] = getStartLocation();
                locations[0] = newStartLocation;
                this.startLocation = newStartLocation;
            }
            else System.out.println("Couldn't add " + newStartLocation.getName());
        }
    }

    /**
     * setFinishLocation: sets the finish location of the problem.
     * If the new finish location is already a finish location, it will not be added and the message "newFinishLocation is already a finish location" will be printed.
     * If the new finish location is already a start location, it will not be added and the message "newFinishLocation can't be added as a finish location because it already is a start location" will be printed.
     * If the new finish location doesn't exist in the locations array, it will be added.
     * If the new finish location exists in the locations array, it will be moved to the second position.
     * If the new finish location doesn't exist in the locations array and there is no more space for new locations, it will not be added and the message "No more space for new locations" will be printed.
     * @param newFinishLocation the new finish location of the problem
     */
    public void setFinishLocation(Location newFinishLocation) {
        if(locations[1].equals(newFinishLocation))
            System.out.println(newFinishLocation.getName() + " is already a finish location");
        else if (locations[0].equals(newFinishLocation))
            System.out.println(newFinishLocation.getName() + " can't be added as a finish location because it already is a start location");
        else if(!doesLocationExist(newFinishLocation) && indexOfLocations<MAX_LOCATIONS-1)
        {
            for(int index=indexOfLocations+1; index>=2; index--)
                locations[index] = locations [index-1];
            locations[1] = newFinishLocation;
            this.finishLocation = newFinishLocation;
            indexOfLocations++;
        }
        else if (!doesLocationExist(newFinishLocation) && indexOfLocations>=MAX_LOCATIONS-1)
            System.out.println("No more space for new locations");
        else if (doesLocationExist(newFinishLocation))
        {
            int newLocationIndex = getIndexOfGivenLocation(newFinishLocation);
            if(newLocationIndex != -1)
            {
                for (int index = getIndexOfGivenLocation(newFinishLocation); index >= 2; index--)
                    locations[index] = locations[index - 1];
                locations[1] = newFinishLocation;
                this.finishLocation = newFinishLocation;
            }
            else System.out.println("Couldn't add " + newFinishLocation.getName());
        }
    }

    public Location getFirstEndOfRoad(Road road)
    {
        return road.getFirstLocation();
    }
    public Location getSecondEndOfRoad(Road road)
    {
        return road.getSecondLocation();
    }

    /**
     * Constructor for the Problem class
     * It creates a new problem with the given start location and finish location.
     * It also creates a new array of roads and a new array of locations.
     * The start location and the finish location are added to the locations array.
     * The index of the locations array is set to 1.
     * The roads array is set to null.
     * The start location and the finish location are set to the given start location and finish location.
     * @param startLocation - the starting location
     * @param finishLocation - the finishing location
     */
    public Problem(Location startLocation, Location finishLocation)
    {
        roads = new Road[MAX_ROADS];
        locations = new Location[MAX_LOCATIONS];
        this.startLocation = startLocation;
        this.finishLocation = finishLocation;
        this.locations[0] = startLocation;
        this.locations[1] = finishLocation;
        this.indexOfLocations = 1;
    }

    /**
     * addLocation: adds a new location to the locations array.
     * If the new location already exists in the locations array, it will not be added and the message "Location newLocation already exists" will be printed.
     * If the new location doesn't exist in the locations array and there is no more space for new locations, it will not be added and the message "No more space for locations" will be printed.
     * @param newLocation - the new location to be added
     */
    public void addLocation(Location newLocation)
    {
        if(!doesLocationExist(newLocation) && indexOfLocations<MAX_LOCATIONS-1)
            this.locations[++indexOfLocations] = newLocation;
        else if (indexOfLocations < MAX_LOCATIONS-1)
            System.out.println("Location " + newLocation.getName() + " already exists");
        else
            System.out.println("No more space for locations");
    }

    /**
     * addRoad: adds a new road to the roads array.
     * If the new road already exists in the roads array, it will not be added and the message "Road newRoad already exists" will be printed.
     * If the new road doesn't exist in the roads array and there is no more space for new roads, it will not be added and the message "No more space for roads" will be printed.
     * @param newRoad - the new road to be added
     */
    public void addRoad(Road newRoad)
    {
        if(!(doesRoadExist(newRoad)) && indexOfRoads<MAX_ROADS-1)
            roads[indexOfRoads++] = newRoad;
        else if(indexOfRoads < MAX_ROADS-1)
            System.out.println("Road " + newRoad.getName() + " already exists");
        else
            System.out.println("No more space for roads");
    }

    /**
     * toString overrides toString method
     * @return a string containing the problem's instance containing the start location, the finish location and the locations in the locations array and the roads in the roads array
     */
    @Override
    public String toString ()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("\n\nProblem's instance: \n");
        for (int index =0; index<=indexOfLocations; index++)
        {
            if(index==0) {
                builder.append("start location: ");
                builder.append(startLocation);
                builder.append("\n");
            }
            else if(index==1) {
                builder.append("\nfinish location: ");
                builder.append(finishLocation);
                builder.append("\n");
            }
            else {
                builder.append("\nlocation ");
                builder.append(index+1);
                builder.append(": ");
                builder.append(locations[index]);
                builder.append("\n");
            }
        }
        for(int index=0; index<indexOfRoads; index++)
        {
            builder.append("\nroad ");
            builder.append(index+1);
            builder.append(": ");
            builder.append(roads[index]);
            builder.append("\n");
        }
        return builder.toString();
    }
}
