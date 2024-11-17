import java.util.Scanner;

public class Lab6Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userAnswer;
        int answer = (int) (Math.random() * 10) + 1;
        do {
            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);
            System.out.println("What is " + a + " + " + b + "? ");
            userAnswer = input.nextInt();
            answer = a + b;
            if (userAnswer == answer) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
        } while (userAnswer != answer);
        input.close();
    }
}