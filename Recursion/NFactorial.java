public class NFactorial {

// Taking Input from User 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        NFactorial fac = new NFactorial();
        System.out.println("The Value of " + n + "! is :" + fac.factorial(n));
    }

    public int factorial(int n){
        if(n<0){
            return -1;
        }
        else if(n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
