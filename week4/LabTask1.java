import java.util.Scanner;

public class LabTask1 {
    Scanner sc = new Scanner(System.in);
    final double Kilometers_per_mile = 1.609;
    double mile = 100;
    double kilometers;

    public static void main(String[] args) {
        System.out.println("please input the miles:");
        LabTask1 test = new LabTask1();
        test.mile = test.sc.nextDouble();
        test.kilometers = test.mile / test.Kilometers_per_mile;
        System.out.println("the kilometers is " + test.kilometers);

    }

}
