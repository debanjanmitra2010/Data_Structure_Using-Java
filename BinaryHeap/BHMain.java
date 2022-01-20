public class BHMain {

    public static void main(String[] args) {
        BinaryHeap bhmin = new BinaryHeap(6);
        bhmin.insert(10, "min");
        bhmin.insert(24, "min");
        bhmin.insert(6, "min");
        bhmin.insert(56, "min");
        bhmin.insert(22, "min");
        bhmin.insert(35, "min");
        bhmin.heapifyBottomToTop(3, "min");
        bhmin.levelOrder();
        bhmin.extractHeadOfBP("min");
        bhmin.levelOrder();
        bhmin.peek();
        bhmin.deleteBH();
        BinaryHeap bhmax = new BinaryHeap(6);
        bhmax.insert(10, "max");
        bhmax.insert(24, "max");
        bhmax.insert(6, "max");
        bhmax.insert(56, "max");
        bhmax.insert(22, "max");
        bhmax.insert(35, "max");
        bhmax.heapifyTopToBottom(4, "max");
        bhmax.levelOrder();
        System.out.println();
        bhmax.extractHeadOfBP("max");
        bhmax.levelOrder();
        bhmax.peek();
        bhmax.deleteBH();
    }
}
