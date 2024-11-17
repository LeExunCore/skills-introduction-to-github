import java.util.Scanner;

public class LabTask7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entet the driving distance :");
        double distance = sc.nextDouble();
        System.out.println("Entet the driving mile per gallon :");
        double mile_Gallon = sc.nextDouble();
        System.out.println("Entet the driving price per gallon:");
        double price_Gallon = sc.nextDouble();
        double cost = (distance / mile_Gallon) * price_Gallon;
        System.out.println("The cost of driving is $" + cost);
    }
}