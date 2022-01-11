import java.util.Scanner;

public class NPower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int base = s.nextInt();
        System.out.print("Enter the power:  ");
        int power = s.nextInt();
        NPower np = new NPower();
        System.out.println("The Value of " + base + " to the power " + power+ " is: " + np.power(base,power));
    }

    public int power(int base , int power){
        if(base == 0 || base < 0 ){
            return -1;
        }
        else if(power ==0 || power ==1) {
            return base;
        }
        else {
            return base * power(base,power-1);
        }
    }

}
