import java.util.Scanner;

public class WeekTask4 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        WeekTask4 test = new WeekTask4();

        float a, b;
        System.out.println("Enter two digtals:");
        a = test.sc.nextFloat();
        b = test.sc.nextFloat();
        System.out.println("The maximum is " + Math.max(a, b) + "and the minimum is " + Math.min(a, b));

        System.out.println("The absolute value is " + Math.abs(a));

        System.out.println(a + (int) Math.random() * b);
    }
}
