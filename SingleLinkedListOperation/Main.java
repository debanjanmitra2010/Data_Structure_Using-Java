import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SingleLinkedList SLL = new SingleLinkedList();
        System.out.printf("Do you want to create a LinkedList (Y/N): ");
        char choice = s.next().toLowerCase().charAt(0);
        if (choice == 'y') {
            System.out.println("Enter your 1st Element in LinkedList");
            int n = s.nextInt();
            SLL.createSingleLinkedin(n);
            SLL.printScreen();
        }
        System.out.printf("Program Designed by Debanjan Mitra");
    }
}
