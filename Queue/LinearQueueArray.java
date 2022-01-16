import java.util.Scanner;

public class LinearQueueArray {
    int arr[];
    int topOfQueue;
    int beginningOfQueue;
    char choice;
    Scanner s = new Scanner(System.in);

    public LinearQueueArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is succesfully created with size of: " + size);
    }

    public boolean isFull() {
        if (topOfQueue == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length)) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is Full.");
        } else if (isEmpty()) { // At the Beginning
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully Inserted " + value + " at position " + topOfQueue);
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully Inserted " + value + " at position " + topOfQueue);
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty.");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty.");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    public void deleteQueue() {
        arr = null;
        System.out.println("The Queue is Successfully Deleted");
    }

    public void printScreen() {
        System.out.println("Do you want to Perform the following operation :-");
        System.out.println("1. enQueue");
        System.out.println("2. DeQueue");
        System.out.println("3. peek");
        System.out.println("4. isEmpty");
        System.out.println("5. isFull");
        System.out.println("6. Delete Queue");
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
        switch (input) {
            case 1:
                System.out.print("Insert Value : ");
                Value = s.nextInt();
                enQueue(Value);
                break;
            case 2:
                System.out.println("deQueue value :" + deQueue());
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
                deleteQueue();
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
