import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class BfsUsingAL {

    ArrayList<ALGraphNode> nodeList = new ArrayList<ALGraphNode>();

    public BfsUsingAL(ArrayList<ALGraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    // BFS internall
    void bfsVisit(ALGraphNode node) {
        LinkedList<ALGraphNode> queue = new LinkedList<ALGraphNode>();
        queue.add(node);
        while (!queue.isEmpty()) {
            ALGraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for (ALGraphNode neighbor : currentNode.neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    void bfs() {
        for (ALGraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }
}
