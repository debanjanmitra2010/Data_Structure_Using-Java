import java.util.Scanner;

public class CQArrayMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = s.nextInt();
        CQArray queue = new CQArray(size);
        System.out.print("Do you want to create a Queue (Y/N): ");
        char choice = s.next().toLowerCase().charAt(0);
        if (choice == 'y') {
            System.out.println("Enter your 1st Element in Queue");
            int n = s.nextInt();
            queue.enQueue(n);
            queue.printScreen();
        }
    }
}
