public class Week8Task16 {
    public static void main(String[] args) {
        int[] myList = { 1, 2, 3, 4, 5 };
        System.out.println("Original array:");
        displayElements(myList);

        changeArray(myList);
        System.out.println("Array after change:");
        displayElements(myList);
    }

    public static void displayElements(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    public static void changeArray(int[] array) {
        array[0] = 10;
    }
}