import java.util.Scanner;

import java.util.Arrays;
import java.util.List;

public class WeekTask24 {

    char[] vowelsArrays = new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', };

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        WeekTask24 test = new WeekTask24();

        System.out.println("Enter a letter: ");

        char strin = test.sc.nextLine();
        List list = Arrays.asList(test.vowelsArrays);
        String ch = String.valueOf(strin);
        int str = (int) strin;
        if (str >= 65 && str <= 90) {
            int i = list.indexOf(ch);
            if (i != -1) {
                System.out.println(ch + "is a vowel");
            } else
                System.out.println(ch + "is a consonant");

        } else if (str >= 97 && str <= 122) {
            int i = list.indexOf(ch);
            if (i != -1) {
                System.out.println(ch + "is a vowel");
            } else
                System.out.println(ch + "is a consontant");
        } else
            System.out.println(ch + "is an unvalud input");

    }
}