public class Main {

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.createDLL(1);
        System.out.print("Do you want to create a LinkedList (Y/N): ");
        char choice = s.next().toLowerCase().charAt(0);
        if (choice == 'y') {
            System.out.println("Enter your 1st Element in LinkedList");
            int n = s.nextInt();
            cll.CreatCLL(n);
            cll.printScreen();
        }
    }
}
