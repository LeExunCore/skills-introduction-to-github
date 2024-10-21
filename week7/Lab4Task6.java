public class Lab4Task6 {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("Original number: " + number);
        changeNumber(number);
        System.out.println("Number after method call: " + number);
    }

    public static void changeNumber(int number) {
        number++;
        System.out.println("n inside the method is " + number);
    }
}