import java.util.Scanner;

public class ProductofArray {

    public int method(int A[], int N)
    {
        if (N <= 0)
            return 1;
        return (method(A, N - 1) * A[N - 1]);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Array length : ");
        int n = s.nextInt();
        System.out.println("Enter the Array Elements : ");
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        ProductofArray pa = new ProductofArray();
        System.out.println("Product of the array: " + pa.method(arr,n));

    }

}
