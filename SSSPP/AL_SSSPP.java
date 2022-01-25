import java.util.LinkedList;

public class AL_SSSPP {

    public static void pathPrint(ALGraphNode node) {
        if (node.parent  != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void BFSForSSSPP(ALGraphNode node) {
        LinkedList<ALGraphNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            ALGraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print("Printing path for node " + currentNode.name + ": ");
            pathPrint(currentNode);
            System.out.println();
            for (ALGraphNode neighbor : currentNode.neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                    neighbor.parent = currentNode;
                }
            }

        }
    }

}
