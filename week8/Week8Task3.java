import java.util.Random;

public class Week8Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] myList = new double[5];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = random.nextDouble() * 10; // Random value between 0.0 and 10.0
        }

        for (double num : myList) {
            System.out.println(num);
        }
    }
}