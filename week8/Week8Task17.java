public class Week8Task17 {
    public static void main(String[] args) {
        int[] myList = { 1, 2, 3, 4, 5 };
        int[] reversedArray = reverseArray(myList);
        System.out.println("Reversed array:");
        for (int num : reversedArray) {
            System.out.println(num);
        }
    }

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
}