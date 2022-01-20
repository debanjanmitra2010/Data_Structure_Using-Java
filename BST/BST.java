import java.util.LinkedList;
import java.util.Queue;

public class BST {

    BSTNode root;

    public BST() {
        root = null;
    }

    // Insert Method
    private BSTNode IntenalInsertOperation(BSTNode currentNode, int value) {
        if (currentNode == null) {
            BSTNode newNode = new BSTNode();
            newNode.value = value;
            System.out.println("The value " + value + " successfully inserted");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = IntenalInsertOperation(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = IntenalInsertOperation(currentNode.right, value);
            return currentNode;
        }
    }

    void insert(int value) {
        root = IntenalInsertOperation(root, value);
    }


    public void preOrderTraversal(BSTNode node) { // Insert Root Node of BST
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(BSTNode node) {// Insert Root Node of BST
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value + " ");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(BSTNode node) { // Insert Root Node of BST
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");
    }

    public void levelOrderTraversal() {
        Queue<BSTNode> queue = new LinkedList<BSTNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BSTNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    // Search Method
    BSTNode InternalSearch(BSTNode node, int value) {
        if (node == null) {
            System.out.println("Value: " + value + " not found in BST");
            return null;
        } else if (node.value == value) {
            System.out.println("Value: " + value + " found in BST");
            return node;
        } else if (value < node.value) {
            return InternalSearch(node.left, value);
        } else {
            return InternalSearch(node.right, value);
        }
    }

    void search(int value) {
        InternalSearch(this.root, value);
    }

    // Minimum node
    public static BSTNode minimumNode(BSTNode root) {
        if (root.left == null) {
            return root;
        } else {
            return minimumNode(root.left);
        }
    }

    // Delete node
    public BSTNode Internaldelete(BSTNode root, int value) {
        if (root == null) {
            return null;
        }
        if (value < root.value) {
            root.left = Internaldelete(root.left, value);
        } else if (value > root.value) {
            root.right = Internaldelete(root.right, value);
        } else {
            if (root.left != null && root.right != null) { // When the node has two children
                BSTNode temp = root;
                BSTNode minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = Internaldelete(root.right, minNodeForRight.value);
            } else if (root.left != null) { // One Child
                root = root.left;
            } else if (root.right != null) { // One Child
                root = root.right;
            } else {
                root = null;
            }
        }
        return root;
    }

    void deleteNode(int value) {
        Internaldelete(this.root, value);
    }


    public void deleteBST() {
        root = null;
        System.out.println("BST has been deleted successfully");
    }

}
