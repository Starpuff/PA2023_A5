import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Person("Sabina", Date.valueOf("2006-06-13")));
        nodes.add(new Programmer("Cristian", Date.valueOf("2002-05-19"), "Java"));
        nodes.add(new Programmer("Petru", Date.valueOf("2006-06-13"), "C#"));
        nodes.add(new Designer("Ioana", Date.valueOf("2002-12-11"), "Web"));
        nodes.add(new Company("Google", 8));
        for (Node node : nodes)
        {
            System.out.println(node.getName());
        }
    }
}