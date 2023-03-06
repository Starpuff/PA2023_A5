import locations.*;
import roads.*;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /** Locations: */
        City city1 = new City("Iasi", 20, 50, 500_000);
        City city2 = new City("Bucuresti", 15.7f, 10.6f, 1_800_000);
        City city3 = new City("Brasov", 8.7f, 25, 230_000);
        City city4 = new City("Tokyo", 10_000, 60.8f, 14_000_000);
        /*
        GasStation gasStation1 = new GasStation("Station 1", 37, 45.3f, 8.17f);
        GasStation gasStation2 = new GasStation("Station 2", 78, 18, 11.5f);
        Airport airport1 = new Airport("Iasi", 20, 50, 3);
        Airport airport2 = new Airport("Bucuresti", 15.7f, 10.6f, 3);
        Airport airport3 = new Airport("Tokyo", 10_000, 60.8f, 3);
         */


        /** Roads: */
        Highway road1 = null;
        try {
            road1 = new Highway("A10", 203.3f, 130, city1, city2);
            //System.out.println(road1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Highway road2 = null;
        try {
            road2 = new Highway("A11", 452.4f, 150, city3, city1);
            //System.out.println(road2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Problem pb = new Problem(city1, city2);
        pb.addLocation(city1);
        pb.addLocation(city3);
        pb.addLocation(city4);
        pb.addRoad(road1);
        pb.addRoad(road2);
        pb.addRoad(road1);
        //pb.setStartLocation(city3);
        //pb.setFinishLocation(city4);
        //pb.setFinishLocation(city3);

        if(isInstanceValid(pb))
            System.out.println(pb);

        if(isInstanceValid(pb))
            isBReachableFromA(pb);


        /*
        try
        {
            Express road3 = new Express("E13", 263.4f, 100, city3, city2);
            System.out.println(road3);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            Country road4 = new Country("C89", 200.3f, 70, airport1, airport3);
            System.out.println(road4);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            Country road5 = new Country("C40", 230.3f, 70, gasStation1, airport2);
            System.out.println(road5);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            Express road6 = new Express("E43", 600f, 90, city3, gasStation2);
            System.out.println(road6);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        */
    }

    private static void isBReachableFromA(Problem pb) {
        Queue<Location> queue = new LinkedList<>();
        int visitedLocations[] = new int[pb.getIndexOfLocations()+1];
        for (int index = 0; index <= pb.getIndexOfLocations(); index++)
            visitedLocations[index] = 0;
        queue.add(pb.getStartLocation());
        visitedLocations[0] = 1;
        while(queue.peek()!=null)
        {
            Location currentLocation = queue.remove();
            if(currentLocation.equals(pb.getFinishLocation()))
            {
                System.out.println("The finish location is reachable from the start location.");
                return;
            }
            for(int index = 0; index < pb.getIndexOfRoads(); index++)
            {
                Road currentRoad = pb.getRoads()[index];
                int indexFirstEndOfRoad = pb.getIndexOfGivenLocation(pb.getFirstEndOfRoad(currentRoad));
                int indexSecondEndOfRoad = pb.getIndexOfGivenLocation(pb.getSecondEndOfRoad(currentRoad));

                if(pb.doesLocationExist(pb.getFirstEndOfRoad(currentRoad)) && pb.doesLocationExist(pb.getSecondEndOfRoad(currentRoad)))
                {
                    if(currentLocation.equals(pb.getFirstEndOfRoad(currentRoad)) && visitedLocations[indexSecondEndOfRoad]==0)
                    {
                        queue.add(pb.getSecondEndOfRoad(currentRoad));
                        visitedLocations[indexSecondEndOfRoad] = 1;
                    }
                    else if(currentLocation.equals(pb.getSecondEndOfRoad(currentRoad)) && visitedLocations[indexFirstEndOfRoad]==0)
                    {
                        queue.add(pb.getFirstEndOfRoad(currentRoad));
                        visitedLocations[indexFirstEndOfRoad] = 1;
                    }
                }
            }
        }
        System.out.println("The finish location is unreachable from the start location.");
        return;
    }

    private static boolean isInstanceValid(Problem pb)
    {
        if(pb.getStartLocation()==null || pb.getFinishLocation()==null)
            return false;
        if(pb.getStartLocation().equals(pb.getFinishLocation()))
            return false;
        if(pb.getRoads()==null)
            return false;
        return true;
    }
}