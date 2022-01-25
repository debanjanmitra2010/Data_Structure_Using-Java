import java.util.ArrayList;
import java.util.LinkedList;

public class AM_SSSPP {

    public static void pathPrint(AMGraphNode node) {
        if(node.parent!=null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name+" ");
    }

    public void BFSForSSSPP(AMGraphNode node) {
        LinkedList<AMGraphNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            AMGraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print("Printing path for node "+currentNode.name+": ");
            pathPrint(currentNode);
            System.out.println();
            ArrayList<AMGraphNode> neighbors = GraphByAM.getNeighbors(currentNode);
            for (AMGraphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                    neighbor.parent = currentNode;
                }
            }

        }
    }


}
