
import java.util.*;

public class Celsius_to_Fahrenheit_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celcius");
        int n= sc.nextInt();
        float Fahrenheit = (n * 9f/5) + 32;
        System.out.println(Fahrenheit);
        sc.close();
    }
}
