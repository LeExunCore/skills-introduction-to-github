import java.util.Scanner;

public class Lab4Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        System.out.println("The greatest common divisor is " + gcd(number1, number2));
    }

    public static int gcd(int a, int b) {
        int temp;
        while ((b != 0)) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}