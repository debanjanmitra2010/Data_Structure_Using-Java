import java.util.Scanner;

public class StackArray {
    int[] arr;
    int topOfStack;
    char choice;
    Scanner s = new Scanner(System.in);

    public StackArray(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack is created with size of: " + size);
    }

    // isEmpty
    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    // isFull

    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            // System.out.println("The Stack is full!");
            return true;
        } else {
            return false;
        }
    }

    // Push
    public void push(int value) {
        if (isFull()) {
            System.out.println("The Stack is full!");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    // pop

    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    // Peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    //  Delete method
    public void deleteStack() {
        arr = null;
        System.out.println("The Stack is successfully deleted");
    }

    public void printScreen() {
        System.out.println("Do you want to Perform the following operation :-");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. peek");
        System.out.println("4. isEmpty");
        System.out.println("5. isFull");
        System.out.println("6. Delete Stack");
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
                System.out.println("IsFull : " +isFull());
                break;
            case 6:
                deleteStack();
                break;

        }
        if (input <= 6) {
            printScreen();
        } else {
            System.out.println("Wrong Selection!");
            System.out.print("Enter your choice Again: ");
            Continue();
        }
    }
}
