import java.util.Scanner;

public class CLL implements Operations {

    public Node head;
    public Node tail;
    public int size;
    Scanner s = new Scanner(System.in);
    char choice;

    @Override
    public Node CreatCLL(int NodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = NodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    @Override
    public void insertInCLL(int nodeValue, int position) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            CreatCLL(nodeValue);
            return;
        } else if (position == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (position >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < position - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    @Override
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

    @Override
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

    @Override
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CSLL does not exist! ");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
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

    @Override
    public void deleteCLL() {
        if (head == null) {
            System.out.println("The CSLL does not exist!");
        } else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CSLL has been deleted!");
        }
    }

    @Override
    public void printScreen() {
        System.out.println("Do you want to Perform the following operation :-");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Traverse");
        System.out.println("5. Delete Entire CircularLinked List");
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
                insertInCLL(NodeValue, position);
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
                deleteCLL();
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
