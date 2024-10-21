import java.util.Random;

public class Lab4Task10 {
    public static char getRandomLowerCaseLetter() {
        Random rand = new Random();
        int ASCII = rand.nextInt(26) + 97;
        return (char) ASCII;
    }

    public static void main(String[] args) {
        System.out.println("The Random char is");
        System.out.println(getRandomLowerCaseLetter());
    }
}