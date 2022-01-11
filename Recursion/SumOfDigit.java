import java.util.Scanner;

public class SumOfDigit {

    //User Input Taken
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        SumOfDigit sd = new SumOfDigit();
        System.out.println("The Sum of digits of " + n + " is : " + sd.sum(n));

    }

    public int sum(int n) {
        if (n < 0) {
            System.out.println("Wrong Input!!");
            return -1;
        } else if (n == 0) {
            return n;
        } else {
            return n % 10 + sum(n/10);
        }
    }
}
