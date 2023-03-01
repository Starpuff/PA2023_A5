public class Main {
    public static void main(String[] args)
    {
        Main lab2 = new Main();
        lab2.compulsory();
    }
    void compulsory()
    {
        Location location1 = new Location("Iasi", LocationType.CITY, 3, 10);
        Location location2 = new Location("Bucuresti", LocationType.CITY, 10, 15);

        System.out.println(location1);
        System.out.println(location2);
        try
        {
            Road road1 = new Road("A1", RoadType.HIGHWAY, 2.3f, 130, location1, location2);
            System.out.println(road1);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}