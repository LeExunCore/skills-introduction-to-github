import java.util.Scanner;

public class Lab4Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        printPrimeNumbers(number);
    }

    public static void printPrimeNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}