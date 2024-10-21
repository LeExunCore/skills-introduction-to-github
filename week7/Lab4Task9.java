public class Lab4Task9 {
    public static int max(int i, int j) {
        return (i > j) ? i : j;
    }

    public static double max(double i, double j) {
        return (i > j) ? i : j;
    }

    public static double max(double i, double j, double k) {
        if (i >= j && i >= k) {
            return i;
        } else if (j >= i && j >= k) {
            return j;
        } else {
            return k;
        }
    }

    public static void main(String[] args) {
        System.out.println("The maximum of 5 and 10 is " + max(5, 10));
        System.out.println("The maximum of 7.5 and 8.5 is " + max(7.5, 8.5));
        System.out.println("The maximum of 7.5, 8.5 and 6.0 is " + max(7.5, 8.5, 6.0));
    }
}