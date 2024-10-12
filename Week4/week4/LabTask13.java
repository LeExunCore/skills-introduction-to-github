import java.util.Scanner;

public class LabTask13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double newPay;

        System.out.println("Enter your pay: ");
        double pay = sc.nextDouble();
        System.out.println("Your pay without increment is : " + pay);
        System.out.println("Enter your score :");

        double score = sc.nextDouble();

        if (score > 90) {
            newPay = pay + (0.03 * pay);
            System.out.println("Your pay with increment is: " + newPay);
        } else
            newPay = pay + (0.01 * pay);
        System.out.println("Your pay with increment is: " + newPay);
    }
}