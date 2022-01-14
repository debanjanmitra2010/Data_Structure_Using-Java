import java.util.Scanner;

public class DoubleLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;
    Scanner s = new Scanner(System.in);
    char choice;

    public DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    public void InsertInDLL(int NodeValue, int position) {
        DoublyNode newNode = new DoublyNode();
        if (head == null) {
            createDLL(NodeValue);
            return;
        } else if (position == 0) {
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (position >= size) {
            newNode.next = null;
            newNode.prev = tail;
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

    public void reverseTraversal() {
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

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The DLL does not exist! ");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if (location >= size) {
            DoublyNode tempNode = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head.next = null;
                tail = tempNode;
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

    public void deleteDLL() {
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The DLL has been deleted!");
    }

    public void printScreen() {
        System.out.println("Do you want to Perform the following operation :-");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Traverse");
        System.out.println("5. Delete Entire DoubleLinked List");
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
        int NodeValue;
        int position;
        switch (input) {
            case 1:
                System.out.print("Insert Value : ");
                NodeValue = s.nextInt();
                System.out.print("Insert position : ");
                position = s.nextInt();
                InsertInDLL(NodeValue, position);
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
                deleteDLL();
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

