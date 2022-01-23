public class HeapSort {

    int[] arr = null;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        BHeap bh = new BHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            bh.insertInHeap(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = bh.extractHeadOfHeap();
        }


    }


    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
