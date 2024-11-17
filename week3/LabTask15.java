import java.util.Scanner;

public class LabTask15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");

        int number = sc.nextInt();
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 2 and 3");
            System.exit(0);
        }
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3");
            System.exit(0);
        }
        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println(number + " is divisible by one of 2 or 3");
        }
    }
}