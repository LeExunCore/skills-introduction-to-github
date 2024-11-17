public class Week8Task14 {
    public static void main(String[] args) {
        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] targetArray = new int[sourceArray.length];

        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

        System.out.println("Copied array using arraycopy: ");
        for (int num : targetArray) {
            System.out.println(num);
        }
    }
}