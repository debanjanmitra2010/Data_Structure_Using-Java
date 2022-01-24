public class ALGraphNode {
    public String name;
    public int index;
    public boolean isVisited = false;
    public ALGraphNode parent;

    public ArrayList<ALGraphNode> neighbors = new ArrayList<ALGraphNode>();

    public ALGraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
