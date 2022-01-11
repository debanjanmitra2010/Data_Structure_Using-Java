import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1 = s.nextInt();
        System.out.print("Enter the 2nd number:  ");
        int n2 = s.nextInt();
        GCD gcdobj = new GCD();
        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + gcdobj.gcd(n1,n2));
    }

        public int gcd(int a, int b){
            if(b == 0){
                return a;
            }
            else if(a < 0 || b < 0 ){
                return -1;
            }
            else{
                return gcd(b, a % b);
            }
        }
}
