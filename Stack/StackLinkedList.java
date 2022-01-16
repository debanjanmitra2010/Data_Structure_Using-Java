import java.util.Scanner;

public class StackLinkedList {
    SingleLinkedList linkedList;
    char choice;
    Scanner s = new Scanner(System.in);

    public StackLinkedList() {
        linkedList = new SingleLinkedList();
    }

    // Push method
    public void push(int value) {
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in Stack");
    }

    // isEmpty
    public boolean isEmpty() {
        if (linkedList.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // Pop method
    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
        } else {
            result = linkedList.head.value;
            linkedList.deleteNode(0);
        }
        return result;
    }

    // Peek Method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }

    // Delete Method
    public void deleteStack() {
        linkedList.head = null;
        System.out.println("The Stack is deleted");
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
                push(Value);
                break;
            case 2:
                System.out.println("Pop value :" + pop());
                break;
            case 3:
                System.out.println("Peek value :" +peek());
                break;
            case 4:
                System.out.println("IsEmpty : " +isEmpty());
                break;
            case 5:
                deleteStack();
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

