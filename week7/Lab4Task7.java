public class Lab4Task7 {
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20 };
        swap(arr);
        System.out.println("Array after swap: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}