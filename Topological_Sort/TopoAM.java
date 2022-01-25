import java.util.ArrayList;
import java.util.Stack;

public class TopoAM {

    public static ArrayList<AMGraphNode> nodeList = new ArrayList<AMGraphNode>();
    public static int[][] adjacencyMatrix;

    //  Topological Sort
    public void addDirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
    }

    void topologicalVisit(AMGraphNode node, Stack<AMGraphNode> stack) {
        ArrayList<AMGraphNode> neighbors = GraphByAM.getNeighbors(node);
        for (AMGraphNode neighbor : neighbors) {
            if (!neighbor.isVisited) {
                topologicalVisit(neighbor, stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }

    void topologicalSort() {
        Stack<AMGraphNode> stack = new Stack<>();
        for (AMGraphNode node : nodeList) {
            if (!node.isVisited) {
                topologicalVisit(node, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().name + " ");
        }
    }
}
