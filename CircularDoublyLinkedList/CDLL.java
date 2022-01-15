import java.util.Scanner;

public class CDLL implements Operation {
    DoublyNode head;
    DoublyNode tail;
    int size;
    char choice;
    Scanner s = new Scanner(System.in);

    @Override
    public DoublyNode CreatCDLL(int NodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        head = newNode;
        tail = newNode;
        newNode.value = NodeValue;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }

    @Override
    public void insertInCDLL(int nodeValue, int position) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            CreatCDLL(nodeValue);
            return;
        } else if (position == 0) {
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        } else if (position >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < position - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    @Override
    public void traversal() {
        if (head == null) {
            System.out.println("No Value in LinkedList");
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i < size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }

    @Override
    public void ReverseTraversal() {
        if (head == null) {
            System.out.println("No Value in LinkedList");
        } else {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i < size - 1) {
                    System.out.print("<-");
                }
                tempNode = tempNode.prev;
            }
        }
        System.out.println();
    }

    @Override
    public void search(int NodeValue) {
        if (head == null) {
            System.out.println("No Value in LinkedList");
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == NodeValue) {
                    System.out.println(NodeValue + " Found at location " + (i + 1));
                    break;
                }
                tempNode = tempNode.next;
            }
            System.out.println("Element not Found!");
        }
    }

    @Override
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CDLL does not exist!");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head.prev = null;
                head.next = null;
                head = tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if (size == 1) {
                head.prev = null;
                head.next = null;
                head = tail = null;
                size--;
                return;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    @Override
    public void deleteCDLL() {
        DoublyNode tempNode = head;
        for (int i=0; i<size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The CDLL has been deleted!");
    }

    @Override
    public void printScreen() {
        System.out.println("Do you want to Perform the following operation :-");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Traverse");
        System.out.println("5. Delete Entire Circular DoubleLinked List");
        System.out.print("(Y/N) ?");
        choice = s.next().charAt(0);
        if (choice == 'Y' | choice == 'y') {
            Continue();
        } else {
            System.out.println("Thank You!");
        }
    }

    @Override
    public void Continue() {
        System.out.print("Enter your choice: ");
        int input = s.nextInt();
        int NodeValue;
        int position;
        switch (input) {
            case 1:
                System.out.print("Insert Value : ");
                NodeValue = s.nextInt();
                System.out.print("Insert position : ");
                position = s.nextInt();
                insertInCDLL(NodeValue, position);
                break;
            case 2:
                System.out.print("Insert position to Delete : ");
                position = s.nextInt();
                System.out.println();
                deleteNode(position);
                break;
            case 3:
                System.out.print("Insert Element to Search : ");
                NodeValue = s.nextInt();
                System.out.println();
                search(NodeValue);
                break;
            case 4:
                traversal();
                break;
            case 5:
                deleteCDLL();
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
