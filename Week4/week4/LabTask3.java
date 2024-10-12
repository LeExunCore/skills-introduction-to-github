import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class LabTask3 {

    String[] WeekArray = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Statuday" };

    String weekDate;

    int i;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        LabTask3 test = new LabTask3();
        System.out.println("Today is :");
        test.weekDate = test.sc.nextLine();

        List<String> list = Arrays.asList(test.WeekArray);
        test.i = list.indexOf(test.weekDate);
        System.out.println("The days you want to calcultate is");
        int predictDays = test.sc.nextInt();
        int route = (predictDays + test.i) % 7;
        System.out.println("The calculation is " + test.WeekArray[route]);
    }

}
