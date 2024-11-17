import java.util.Scanner;

public class Week8Task10 {
    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };

        Scanner input = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNumber = input.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Month name: " + months[monthNumber - 1]);
        } else {
            System.out.println("Invalid month number.");
        }
    }
}