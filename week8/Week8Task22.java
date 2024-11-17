import java.util.Scanner;

public class Week8Task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double smallest = findSmallest(numbers);
        System.out.println("The smallest number is " + smallest);
    }

    public static double findSmallest(double[] array) {
        double smallest = array[0];
        for (double num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
}