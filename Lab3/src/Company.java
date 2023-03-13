public class Company implements Node, Comparable<Company> {
    private String name;
    private int numberOfPlants;

    public Company(String name, int numberOfPlants) {
        this.name = name;
        this.numberOfPlants = numberOfPlants;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Company o) {
        return this.name.compareTo(o.getName());
    }
}
