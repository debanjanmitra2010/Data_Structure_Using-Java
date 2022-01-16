import java.util.Scanner;

public class CQArray {
    int arr[];
    int topOfQueue;
    int beginningOfQueue;
    char choice;
    int size;
    Scanner s = new Scanner(System.in);

    public CQArray(int size) {
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The CQ is successfully created with size of " + size);
    }

    // isEmpty
    public boolean isEmpty() {
        if (topOfQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    // isFull
    public boolean isFull() {
        if (topOfQueue + 1 == beginningOfQueue) {
            return true;
        } else if (beginningOfQueue == 0 && topOfQueue + 1 == size) {
            return true;
        } else {
            return false;
        }
    }

    // enQueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The CQ is full!");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        } else {
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
    }

    // deQueue
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The CQ is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue + 1 == size) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The CQ is emtpy");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    // deleteQueue
    public void deleteQueue() {
        arr = null;
        System.out.println("The CQ is successfully deleted!");
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
                System.out.println("Peek value :" + peek());
                break;
            case 4:
                System.out.println("IsEmpty : " + isEmpty());
                break;
            case 5:
                System.out.println("IsFull : " + isFull());
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
