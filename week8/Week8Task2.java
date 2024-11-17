import java.util.Scanner;

public class Week8Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myList = new int[5];

        for (int i = 0; i < myList.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myList[i] = input.nextInt();
        }

        for (int i = 0; i < myList.length; i++) {
            System.out.println("Element at index " + i + ": " + myList[i]);
        }
    }
}