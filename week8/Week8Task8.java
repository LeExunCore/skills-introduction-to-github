public class Week8Task8 {
    public static void main(String[] args) {
        int[] myList = { 5, 3, 8, 6, 2 };
        int largest = myList[0];
        int index = 0;

        for (int i = 0; i < myList.length; i++) {
            if (myList[i] >= largest) {
                largest = myList[i];
                index = i;
            }
        }

        System.out.println("Smallest index of the largest element: " + index);
    }
}