import java.util.Scanner;

public class CQLinkedListMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CQLinkedList queue = new CQLinkedList();
        System.out.print("Do you want to create a Queue (Y/N): ");
        char choice = s.next().toLowerCase().charAt(0);
        if (choice == 'y') {
            System.out.println("Enter your 1st Element in Stack");
            int n = s.nextInt();
            queue.enQueue(n);
            queue.printScreen();
        }
    }
}


