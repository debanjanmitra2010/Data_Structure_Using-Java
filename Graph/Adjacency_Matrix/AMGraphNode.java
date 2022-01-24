import java.util.ArrayList;

public class AMGraphNode {
    public String name;
    public int index;
    public boolean isVisited = false;
    public AMGraphNode parent;

    public ArrayList<AMGraphNode> neighbors = new ArrayList<AMGraphNode>();

    public AMGraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
