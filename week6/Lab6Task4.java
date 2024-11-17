
import java.util.Random;
import java.util.Scanner;

public class Lab6Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 5) {
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            System.out.println("What is " + num1 + " - " + num2 + "?");
            int answer = scanner.nextInt();

            if (answer == (num1 - num2)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct answer is " + (num1 - num2));
            }
            count++;
        }
    }
}