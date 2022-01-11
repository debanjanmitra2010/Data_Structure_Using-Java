import java.util.Scanner;

public class ReverseString {

    public String reverse(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverse(str));
    }

}
