import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class GraphByAL {

    ArrayList<ALGraphNode> nodeList = new ArrayList<ALGraphNode>();

    public GraphByAL(ArrayList<ALGraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j) {
        ALGraphNode first = nodeList.get(i);
        ALGraphNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }


// For printing Graph to the console

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j = 0; j < nodeList.get(i).neighbors.size(); j++) {
                if (j == nodeList.get(i).neighbors.size() - 1) {
                    s.append((nodeList.get(i).neighbors.get(j).name));
                } else {
                    s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }
}
