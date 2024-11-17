import java.util.Random;
import java.util.Scanner;

public class Lab6Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = random.nextInt(101);
        int userGuess;

        System.out.println("Guess a number between 0 and 100:");
        do {
            userGuess = scanner.nextInt();
            if (userGuess < numberToGuess) {
                System.out.println("Too low.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high.");
            }
        } while (userGuess != numberToGuess);

        System.out.println("Correct! The number was: " + numberToGuess);
    }
}