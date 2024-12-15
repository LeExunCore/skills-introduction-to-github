import java.util.Scanner;
import java.util.Arrays;

public class WeekTask25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 提示用户输入三个城市
        System.out.print("Enter the first city: ");
        String city1 = sc.next();
        System.out.println();
        System.out.print("Enter the second city: ");
        String city2 = sc.next();
        System.out.println();
        System.out.print("Enter the third city: ");
        String city3 = sc.next();
        System.out.println();
        // 将城市名称存储在一个数组中
        String[] cities = { city1, city2, city3 };

        // 对城市名称进行排序
        Arrays.sort(cities);

        // 显示排序后的城市
        System.out.println("The cities in ascending order are:");
        System.out.println(cities[0] + ", " + cities[1] + ", " + cities[2]);

    }
}