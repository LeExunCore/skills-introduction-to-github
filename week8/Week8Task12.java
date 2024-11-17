import java.util.Scanner;

public class Week8Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / n;

        int count = 0;
        for (double num : numbers) {
            if (num > average) {
                count++;
            }
        }

        System.out.println("Number of elements above average: " + count);
    }
}