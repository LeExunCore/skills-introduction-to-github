import java.util.Scanner;

public class LabTask21 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        LabTask21 test = new LabTask21();

        System.out.println("Enter the day number:");
        int a = test.sc.nextInt();
        switch (a) {
            case 6:
                System.out.println("Weekend");
                break;
            case 0:
                System.out.println("Weekend");
            default:
                System.out.println("weekday");
                break;
        }
    }
}