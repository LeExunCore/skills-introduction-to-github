import java.util.Scanner;

public class LabTask4 {

    double radius, area, volume, length;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        LabTask4 test = new LabTask4();
        System.out.println("Please enter the radius and length: ");
        test.radius = test.sc.nextDouble();
        test.length = test.sc.nextDouble();
        test.area = Math.pow(test.radius, 2) * Math.PI;
        test.volume = test.area * test.length;
        System.out.println("The area is : " + test.area);
        System.out.println("The volume is : " + test.volume);

    }
}