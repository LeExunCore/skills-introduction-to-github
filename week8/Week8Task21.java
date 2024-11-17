public class Week8Task21 {
    public static void main(String[] args) {
        double[] numbers = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        System.out.println("Smallest element: " + findSmallest(numbers));
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