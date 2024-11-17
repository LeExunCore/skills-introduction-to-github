import java.util.Scanner;

public class LabTask10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double monthRate = 0.00417;
        final double yearRate = 0.02;
        System.out.println("PLease enter your account :");
        double accountNumber = sc.nextDouble();
        System.out.println("You have saved money for  " + " monthes");
        int monthes = sc.nextInt();
        for (int i = 1; i < monthes + 1; i++) {
            accountNumber = accountNumber * monthRate + accountNumber * i;
        }
        System.out.println("After " + monthes + "monthes your account is :" + accountNumber);
    }
}