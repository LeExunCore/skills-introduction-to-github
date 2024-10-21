import java.util.Scanner;

public class WeekTask23 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        WeekTask23 test = new WeekTask23();
        System.out.println("Enter a length from the center of a pentagon:");
        float r = test.sc.nextFloat();
        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

        System.out.println("The area is " + String.format("%.2f", area));
    }
}