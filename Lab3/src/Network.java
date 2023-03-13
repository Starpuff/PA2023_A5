import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<Node> nodes = new ArrayList<>();
    public Network() {
        this.nodes = new ArrayList<>();
    }
    public void addNode(Node node) {
        nodes.add(node);
    }
}
