import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;;

public class LabTask17 {

    int[] randomArray = new int[2];

    void lotteryGet() {

        for (int i = 0; i < 2; i++)
            randomArray[i] = ThreadLocalRandom.current().nextInt(0, 9 + 1);
    }

    void lotteryCheck(int a) {

        List list = Arrays.asList(randomArray);
        int b = a / 10;
        int c = a % 10;
        int dowb = list.indexOf(b);
        int dowc = list.indexOf(c);
        if (b == randomArray[0] && c == randomArray[1]) {
            System.out.println("Exact match: you win $10000");
        } else
            switch (dowb + dowc) {
                case 1:
                    System.out.println("Mach all digits:you win $3000");

                    break;

                default:
                    System.out.println("Sorry:no match");

                    break;
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lottery pick:");
        int a = sc.nextInt();
        LabTask17 test = new LabTask17();
        test.lotteryGet();

        System.out.println("The lottery number is " + test.randomArray[0] + test.randomArray[1]);

        test.lotteryCheck(a);

    }

}