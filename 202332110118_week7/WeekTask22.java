import java.util.Scanner;

public class WeekTask22 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        WeekTask22 test = new WeekTask22();
        System.out.println("Enter an integer between 0 and 15 :");
        int a = test.sc.nextInt();
        if (a > 16) {
            System.out.println(a + "is an invalid input");
        } else
            System.out.println("The hex value is " + Integer.toHexString(a));
    }
}