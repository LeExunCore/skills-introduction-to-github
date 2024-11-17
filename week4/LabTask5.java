import java.util.Scanner;

public class LabTask5 {
    Scanner sc = new Scanner(System.in);
    float subtotal, gratuityRate;

    public static void main(String[] args) {
        LabTask5 test = new LabTask5();
        System.out.println("Please enter the subtotal and a gratuity rate :");
        test.subtotal = test.sc.nextFloat();
        test.gratuityRate = test.sc.nextFloat();
        float gratuity, total;
        gratuity = (float) (test.gratuityRate * test.subtotal * 0.01);
        total = test.subtotal + gratuity;
        System.out.println("The gratuity is $" + test.subtotal + " and total is $" + total);
    }

}