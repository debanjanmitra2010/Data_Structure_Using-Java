public class AVLMain {

    public static void main(String[] args) {
        AVLTree avl = new AVLTree();
        avl.insert(5);
        avl.insert(10);
        avl.insert(15);
        avl.insert(20);
        avl.insert(8);
        avl.inOrderTraversal(avl.root);
        System.out.println();
        avl.postOrderTraversal(avl.root);
        System.out.println();
        avl.preOrderTraversal(avl.root);
        System.out.println();
        avl.levelOrderTraversal();
        System.out.println();
        avl.delete(15);
        System.out.println();
        avl.inOrderTraversal(avl.root);
        System.out.println();
        avl.Search(avl.root, 15);
        avl.Search(avl.root, 20);
    }

}
