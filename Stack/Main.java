import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char choice1, choice2;
        Scanner s = new Scanner(System.in);
        System.out.print("Do you want to create a Stack (Y/N): ");
        choice2 = s.next().toLowerCase().charAt(0);
        if (choice2 == 'y') {
            System.out.println("By which method you want to create the Stack(Array or LinkedList)");
            System.out.println("Type A or L");
            choice1 = s.next().toLowerCase().charAt(0);
            if (choice1 == 'a') {
                System.out.print("Enter the size of the Array: ");
                int size = s.nextInt();
                StackArray Stack = new StackArray(size);
                System.out.println("Enter your 1st Element in Stack");
                int n = s.nextInt();
                Stack.push(n);
                Stack.printScreen();
            } else if (choice1 == 'l') {
                StackLinkedList Stack = new StackLinkedList();
                System.out.println("Enter your 1st Element in Stack");
                int n = s.nextInt();
                Stack.push(n);
                Stack.printScreen();
            } else {
                System.out.println("InValid Entry");
            }
        } else {
            System.out.println("Thank You!");
        }
    }
}
