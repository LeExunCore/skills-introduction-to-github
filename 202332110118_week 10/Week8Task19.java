public class Week8Task19 {
    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 6, 2, 9, 1, 4 };
        int key = 8;
        int result = linearSearch(array, key);

        if (result == -1) {
            System.out.println("Element " + key + " is not present in the array.");
        } else {
            System.out.println("Element " + key + " is present at index " + result);
        }
    }

    // Method that performs a linear search for a key in an array
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }
}