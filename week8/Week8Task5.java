public class Week8Task5 {
    public static void main(String[] args) {
        int[] myList = { 1, 2, 3, 4, 5 };
        int total = 0;

        for (int num : myList) {
            total += num;
        }

        System.out.println("Sum of all elements: " + total);
    }
}