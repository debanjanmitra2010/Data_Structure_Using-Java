import java.util.Scanner;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;
    Scanner s = new Scanner(System.in);
    char choice;

    public Node createSingleLinkedin(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int position) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSingleLinkedin(nodeValue);
            return;
        } else if (position >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < position - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traversal() {
        if (head == null) {
            System.out.println("No Value in LinkedList");
        } else {
            Node tempNode = head;
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

    public void search(int NodeValue) {
        if (head == null) {
            System.out.println("No Value in LinkedList");
        } else {
            Node tempNode = head;
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
            System.out.println("There is no LinkedList");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteLinkedList() {
        head = null;
        tail = null;
        System.out.println("LinkedList Deleted Successfully");
    }

    public void printScreen() {
        System.out.println("Do you want to Perform the following operation :-");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Traverse");
        System.out.println("5. Delete Entire Linked List");
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
                insertInLinkedList(NodeValue, position);
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
                deleteLinkedList();
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

