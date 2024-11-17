import java.util.Scanner;

class people {
    float weight;
    float height;
    float BIM;
}

public class LabTask6 {

    final float pounds_Pre_kg = (float) 0.4535;
    final float inch_Pre_meter = (float) 0.0254;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        LabTask6 test = new LabTask6();
        people ming = new people();

        System.out.println("Enter weight in pounds:");
        ming.weight = test.sc.nextFloat();
        System.out.println("Enter height in inches:");
        ming.height = test.sc.nextFloat();

        ming.BIM = (float) ((ming.weight * test.pounds_Pre_kg) / Math.pow(ming.height * test.inch_Pre_meter, 2));
        System.out.println("BIM is " + ming.BIM);

    }

}