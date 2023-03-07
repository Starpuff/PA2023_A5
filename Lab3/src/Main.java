import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Person("Sabina"));
        nodes.add(new Programmer("Ioana"));
        nodes.add(new Programmer("Petru"));
        nodes.add(new Designer("Stefana"));
        nodes.add(new Company("Google"));
        for (Node node : nodes)
        {
            System.out.println(node.getName());
        }
    }
}