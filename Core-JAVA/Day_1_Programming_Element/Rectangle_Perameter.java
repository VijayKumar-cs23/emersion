import java.util.Scanner;

public class Rectangle_Perameter {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        sc.close();

        int Perimeter = 2 * (l + w);
        System.out.println(Perimeter);

    }
}
