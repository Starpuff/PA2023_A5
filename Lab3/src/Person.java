import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Person implements Node, Comparable<Person>{
    private String name;
    private Date birthDate;
    private Map<Node, String> relationships = new HashMap<>();

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Map<Node, String> getRelationship() {
        return relationships;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setRelationship(Node node, PeopleRelationships relationship) {
        this.relationships.put(node, String.valueOf(relationship));
    }
    public void setRelationship(Node node, PositionInCompany relationship) {
        this.relationships.put(node, String.valueOf(relationship));
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.getName());
    }

}
