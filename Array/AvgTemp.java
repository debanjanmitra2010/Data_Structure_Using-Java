import java.util.Scanner;

public class AvgTemp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many days temp you want to insert : ");
        int days = s.nextInt();
        int[] arr = new int[days];
        int sum = 0;
        int counter = 0;
        for(int i = 0; i<arr.length;i++){
            System.out.print("Enter " + (i+1) + "th Day Temp: ");
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }
        int avg = sum/days;
        System.out.println("The Avg Temp is " + avg);
        for(int j = 0; j<arr.length;j++){
            if(arr[j] > avg){
                System.out.println((j+1) + "th Day is greater than avg.");
                counter++;
            }
        }
        System.out.println(counter + " days is above avg temp.");
    }
}
