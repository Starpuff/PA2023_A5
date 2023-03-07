public class Company implements Node, Comparable<Company> {
    private String name;

    public Company(String name) {
        this.name = name;
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
