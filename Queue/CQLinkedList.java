import java.util.LinkedList;
import java.util.Scanner;

public class CQLinkedList {

    SingleLinkedList list;
    Scanner s = new Scanner(System.in);
    char choice;

    public CQLinkedList() {
        list = new SingleLinkedList();
        System.out.println("The Queue is successfully created");
    }

    // isEmpty
    public boolean isEmpty() {
        if (list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    //enQueue
    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted " + value + " in the queue");
    }

    // deQueue
    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("The Queue is is Empty");
        } else {
            value = list.head.value;
            list.deleteNode(0);
        }
        return value;
    }

    //peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            return list.head.value;
        }
    }

    //delete
    public void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("The Queue is successfully deleted");
    }

    public void printScreen() {
        System.out.println("Do you want to Perform the following operation :-");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. peek");
        System.out.println("4. isEmpty");
        System.out.println("5. Delete Stack");
        System.out.print("(Y/N) ?");
        choice = s.next().charAt(0);
        if (choice == 'Y' | choice == 'y') {
            Continue();
        } else {
            System.out.println("Thank You!");
        }
    }

    public void Continue() {
        System.out.print("Enter your choice: ");
        int input = s.nextInt();
        int Value;
        int position;
        switch (input) {
            case 1:
                System.out.print("Insert Value : ");
                Value = s.nextInt();
                enQueue(Value);
                break;
            case 2:
                System.out.println("Pop value :" + deQueue());
                break;
            case 3:
                System.out.println("Peek value :" + peek());
                break;
            case 4:
                System.out.println("IsEmpty : " + isEmpty());
                break;
            case 5:
                deleteQueue();
                break;
        }
        if (input <= 5) {
            printScreen();
        } else {
            System.out.println("Wrong Selection!");
            System.out.print("Enter your choice Again: ");
            Continue();
        }
    }
}
