import java.util.Scanner;

public class LabTask11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final float taxRate = (float) 0.06;
        System.out.println("Enter purchase amount : ");
        float purchaseAmount = sc.nextFloat();
        float tax = (purchaseAmount * taxRate);
        System.out.println("Sales tax is $" + tax);

    }
}