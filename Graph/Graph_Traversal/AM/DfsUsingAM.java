import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class DfsUsingAM {
    ArrayList<AMGraphNode> nodeList = new ArrayList<AMGraphNode>();
    int[][] adjacencyMatrix;

    public DfsUsingAM(ArrayList<AMGraphNode> nodeList) {
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    // get Neighbors
    public ArrayList<AMGraphNode> getNeighbors(AMGraphNode node) {
        ArrayList<AMGraphNode> neighbors = new ArrayList<AMGraphNode>();
        int nodeIndex = node.index;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;

    }

    // BSF internall
    void bfsVisit(AMGraphNode node) {
        LinkedList<AMGraphNode> queue = new LinkedList<AMGraphNode>();
        queue.add(node);
        while (!queue.isEmpty()) {
            AMGraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<AMGraphNode> neighbors = getNeighbors(currentNode);
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
            ArrayList<AMGraphNode> neighbors = getNeighbors(currentNode);
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
    
