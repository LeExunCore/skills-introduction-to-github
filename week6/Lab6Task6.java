import java.util.Scanner;

public class Lab6Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number to add (0 to end): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("The sum is: " + sum);
    }
}