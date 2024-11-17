import java.util.Scanner;

public class LabTask8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length:");
        double length = sc.nextDouble();
        double area = Math.pow(length, length) * Math.sqrt(3) * 0.5;
        System.out.println("The area is " + area);

    }
}