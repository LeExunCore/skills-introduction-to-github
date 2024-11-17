import java.util.Scanner;

public class LabTask16 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        LabTask16 test = new LabTask16();
        System.out.println("Enter a years:");

        int years = test.sc.nextInt();

        boolean isLeapYear = (years % 4 == 0 && years % 100 != 0) || (years % 400 == 0);

        if (isLeapYear) {
            System.out.println(years + " is leap year");

        } else
            System.out.println(years + " is not  leap year");

    }
}