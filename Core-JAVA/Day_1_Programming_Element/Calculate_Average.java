import java.util.Scanner;

public class Calculate_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int l = sc.nextInt();
        sc.close();

        int average = (m + n + l) / 3;
        System.out.println(average);
    }
}
