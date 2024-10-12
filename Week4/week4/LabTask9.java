import java.util.Scanner;

public class LabTask9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the purchase account is ");
        double purchaseAccount = sc.nextDouble();
        final double salesTaxrate = 0.06;
        double salesTax = purchaseAccount * salesTaxrate;
        System.out.println("the sales tax is $" + salesTax);

    }
}