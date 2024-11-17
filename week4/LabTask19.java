import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LabTask19 {
    Scanner sc = new Scanner(System.in);
    int[] numArray = new int[2];

    void getNumber() {

        for (int i = 0; i < 2; i++) {
            numArray[i] = ThreadLocalRandom.current().nextInt(0, 9 + 1);

        }
        System.out.println("What is " + numArray[0] + "+" + numArray[1]);
    }

    void checkAnswer(int a) {

        int c = numArray[0] + numArray[1];

        if (a == c) {
            System.out.println("Congratulateions! You are right!");

        } else
            System.out.println("NO!It's wrong");
    }

    public static void main(String[] args) {

        LabTask19 test = new LabTask19();
        test.getNumber();
        System.out.println("Enter your anwser:");
        int a = test.sc.nextInt();
        test.checkAnswer(a);
    }
}