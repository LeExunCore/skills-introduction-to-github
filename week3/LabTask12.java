import java.util.Scanner;

public class LabTask12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        float a = sc.nextFloat();
        if (a % 5 == 0) {
            System.out.println("HIFive");
        }
        if (a % 2 == 0) {
            System.out.println("HIEven");
        }

    }
}