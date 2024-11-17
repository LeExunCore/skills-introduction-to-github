
import java.util.Arrays;
import java.util.Collections;

public class Week8Task9 {
    public static void main(String[] args) {
        Integer[] myList = { 1, 2, 3, 4, 5 };
        Collections.shuffle(Arrays.asList(myList));

        System.out.println("Shuffled array: ");
        for (int num : myList) {
            System.out.println(num);
        }
    }
}