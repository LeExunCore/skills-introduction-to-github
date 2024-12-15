public class Week8Task13 {
    public static void main(String[] args) {
        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] targetArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }

        System.out.println("Copied array: ");
        for (int num : targetArray) {
            System.out.println(num);
        }
    }
}