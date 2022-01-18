public class BinaryTreeArrMain {

    public static void main(String[] args) {
        BinaryTreeArray bin = new BinaryTreeArray(10);
        bin.insert("N1");
        bin.insert("N2");
        bin.insert("N3");
        bin.insert("N4");
        bin.insert("N5");
        bin.insert("N6");
        bin.insert("N7");
        bin.insert("N8");
        bin.insert("N9");
        bin.isFull();
        bin.preOrder(1);
        System.out.println();
        bin.inOrder(1);
        System.out.println();
        bin.postOrder(1);
        System.out.println();
        bin.search("N6");
        bin.delete("N6");
        System.out.println();
        bin.levelOrder();
        bin.deleteBT();
    }

}
