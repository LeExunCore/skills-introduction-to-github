import java.util.Scanner;

public class LabTask20 {

    String[] zodiacArray = new String[] { "Rat", "Ox", "Giter", "Rabbit", "Dragon", "Snake", "Horse", "Sheep", "Monkey",
            "Rooster", "Dog", "Pig" };

    Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        LabTask20 test = new LabTask20();

        System.out.println("Enter a year you want to know");

        int years = test.sc.nextInt();

        System.out.println(years + " is " + test.zodiacArray[years % 12] + " year");

    }

}