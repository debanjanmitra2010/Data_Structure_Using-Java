import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class BfsUsingAM {

    ArrayList<AMGraphNode> nodeList = new ArrayList<AMGraphNode>();
    int[][] adjacencyMatrix;


    // BSF internall
    void bfsVisit(AMGraphNode node) {
        LinkedList<AMGraphNode> queue = new LinkedList<AMGraphNode>();
        queue.add(node);
        while (!queue.isEmpty()) {
            AMGraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<AMGraphNode> neighbors = GraphByAM.getNeighbors(currentNode);
            for (AMGraphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    public void bfs() {
        for (AMGraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }

    void dfsVisit(AMGraphNode node) {
        Stack<AMGraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            AMGraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<AMGraphNode> neighbors = GraphByAM.getNeighbors(currentNode);
            for (AMGraphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }

        }
    }

    void dfs() {
        for (AMGraphNode node : nodeList) {
            if (!node.isVisited) {
                dfsVisit(node);
            }
        }
    }
}
