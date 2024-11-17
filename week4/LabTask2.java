import java.util.Scanner;

public class LabTask2 {
    Scanner sc = new Scanner(System.in);
    int seconds;
    int remainSeconds;
    int minutes;

    public static void main(String[] args) {
        LabTask2 test = new LabTask2();
        System.out.println("please input the seconds you want to obtain:");
        test.seconds = test.sc.nextInt();
        test.minutes = test.seconds / 60;
        test.remainSeconds = test.seconds % 60;
        System.out.println("The minutes is :" + test.minutes);
        System.out.println("The remainSeconds is " + test.remainSeconds);

    }
}