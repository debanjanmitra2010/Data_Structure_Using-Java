import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CLL cll = new CLL();
        System.out.print("Do you want to create a Circular Doubly LinkedList (Y/N): ");
        char choice = s.next().toLowerCase().charAt(0);
        if (choice == 'y') {
            System.out.println("Enter your 1st Element in CDLL");
            int n = s.nextInt();
            cll.CreatCLL(n);
            cll.printScreen();
        }
    }
}
