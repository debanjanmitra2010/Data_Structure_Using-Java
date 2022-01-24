import java.util.ArrayList;
import java.util.Stack;

public class DfsUsingAl {

    ArrayList<ALGraphNode> nodeList = new ArrayList<ALGraphNode>();

    public DfsUsingAl(ArrayList<ALGraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    void dfsVisit(ALGraphNode node) {
        Stack<ALGraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            ALGraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for (ALGraphNode neighbor : currentNode.neighbors) {
                if (!neighbor.isVisited) {
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    void dfs() {
        for (ALGraphNode node : nodeList) {
            if (!node.isVisited) {
                dfsVisit(node);
            }
        }
    }
}
