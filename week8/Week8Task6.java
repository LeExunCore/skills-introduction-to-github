public class Week8Task6 {
    public static void main(String[] args) {
        int[] myList = { 5, 3, 8, 6, 2 };
        int max = myList[0];

        for (int num : myList) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest element: " + max);
    }
}