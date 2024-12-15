public class Lab4Task13 {
    public static int hexToDecimal(String hex) {
        int decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int value = Character.getNumericValue(c);
            decimal = decimal * 16 + value;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println("The decimal value of AB8C is " + hexToDecimal("AB8C"));
    }
}