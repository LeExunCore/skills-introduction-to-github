public class Week8Task18 {
    public static void main(String[] args) {
        int max = findMaximum(1, 5, 8, 3, 9, 6);
        System.out.println("The maximum value is: " + max);
    }

    // Method that prints the maximum value in a list of an unspecified number of
    // values
    public static int findMaximum(int... numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}