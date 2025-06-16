import java.util.Scanner;

public class LeapYearCheck1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();
        sc.close();

        // Gregorian calendar check
        if (year < 1582) {
            System.out.println("Year is before the start of the Gregorian calendar.");
        } else {
            if (year % 4 != 0) {
                System.out.println(year + " is Not a Leap Year.");
            } else if (year % 100 != 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is Not a Leap Year.");
            }
        }
    }
}
