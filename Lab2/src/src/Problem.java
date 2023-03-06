import locations.Location;
import roads.Road;

public class Problem {

    private final int MAX_LOCATIONS = 1000;
    private final int MAX_ROADS = 1000;
    private Location startLocation;
    private Location finishLocation;
    private Location[] locations;
    private Road[] roads;
    private int indexOfLocations = 0;
    private int indexOfRoads = 0;

    private boolean doesLocationExist (Location newLocation)
    {
        for (int index=0; index <= indexOfLocations; index++)
        {
            if(locations[index].equals(newLocation))
                return true;
        }
        return false;
    }

    private boolean doesRoadExist (Road newRoad)
    {
        if(indexOfRoads!=0)
            for (int index=0; index < indexOfRoads; index++)
            {
                if(roads[index].equals(newRoad))
                    return true;
            }
        return false;
    }

    private int getIndexOfGivenLocation (Location givenLocation)
    {
        for(int index=0; index<= indexOfLocations;index++)
        {
            if(givenLocation.equals(locations[index]))
                return index;
        }
        return -1; //location not found
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

    //setters:

    /*
    In vectorul meu de locations, locations[0] va fi mereu start location-ul, locations[1] va fi finish location-ul, iar restul vor fi celelalte locations  */
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

    public void addLocation(Location newLocation)
    {
        if(!doesLocationExist(newLocation) && indexOfLocations<MAX_LOCATIONS-1)
            this.locations[++indexOfLocations] = newLocation;
        else if (indexOfLocations < MAX_LOCATIONS-1)
            System.out.println("Location " + newLocation.getName() + " already exists");
        else
            System.out.println("No more space for locations");
    }

    public void addRoad(Road newRoad)
    {
        if(!(doesRoadExist(newRoad)) && indexOfRoads<MAX_ROADS-1)
            roads[indexOfRoads++] = newRoad;
        else if(indexOfRoads < MAX_ROADS-1)
            System.out.println("Road " + newRoad.getName() + " already exists");
        else
            System.out.println("No more space for roads");
    }


    @Override
    public String toString ()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("\n\nProblem's instance: ");
        for (int index =0; index<=indexOfLocations; index++)
        {
            if(index==0) {
                builder.append("start location: ");
                builder.append(startLocation);
            }
            else if(index==1) {
                builder.append("\nfinish location: ");
                builder.append(finishLocation);
            }
            else {
                builder.append("\nlocation ");
                builder.append(index+1);
                builder.append(": ");
                builder.append(locations[index]);
            }
        }
        for(int index=0; index<indexOfRoads; index++)
        {
            builder.append("\nroad ");
            builder.append(index+1);
            builder.append(": ");
            builder.append(roads[index]);
        }
        return builder.toString();
    }
}
