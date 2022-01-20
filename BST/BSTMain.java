public class BSTMain {

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);
        bst.preOrderTraversal(bst.root);
        System.out.println();
        bst.inOrderTraversal(bst.root);
        System.out.println();
        bst.postOrderTraversal(bst.root);
        System.out.println();
        bst.levelOrderTraversal();
        System.out.println();
        bst.search(40);
        bst.search(100);
        bst.deleteNode(40);
        bst.deleteNode(50);
        bst.deleteNode(70);
        bst.deleteNode(100);
        bst.deleteNode(70);
        bst.preOrderTraversal(bst.root);
        System.out.println();
        bst.deleteBST();
    }

}
