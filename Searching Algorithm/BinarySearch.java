// [8, 9, 12, 15, 17, 19, 20, 21, 28]
//  S              M               E
//  S  M      E
//         SM E
//            SME

public class BinarySearch {
    public static int binarySearch(int arr[], int value) {
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;
        while (arr[middle] != value && start <= end) {
            if (value < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = (start + end) / 2;
        }
        if (arr[middle] == value) {
            System.out.println("The element is found at the index: " + middle);
            return middle;
        } else {
            System.out.println("The element " + value + " not found.");
            return -1;
        }
    }
}
