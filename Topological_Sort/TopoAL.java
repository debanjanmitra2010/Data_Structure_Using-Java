import java.util.ArrayList;
import java.util.Stack;

public class TopoAL {

    ArrayList<ALGraphNode> nodeList = new ArrayList<ALGraphNode>();

    public TopoAL(ArrayList<ALGraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    // Topological Sort
    public void addDirectedEdge(int i, int j) {
        ALGraphNode first = nodeList.get(i);
        ALGraphNode second = nodeList.get(j);
        first.neighbors.add(second);
    }

    void topologicalVisit(ALGraphNode node, Stack<ALGraphNode> stack) {
        for (ALGraphNode neighbor : node.neighbors) {
            if (!neighbor.isVisited) {
                topologicalVisit(neighbor, stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }

    void topologicalSort() {
        Stack<ALGraphNode> stack = new Stack<>();
        for (ALGraphNode node : nodeList) {
            if (!node.isVisited) {
                topologicalVisit(node, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().name + " ");
        }
    }
}
