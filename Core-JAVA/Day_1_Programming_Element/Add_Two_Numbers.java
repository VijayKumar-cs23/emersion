

import java.util.*;
public class Add_Two_Numbers {
    
    public static int sumTwoNum(int n1,int n2){
        return n1+n2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
             int n2 = sc.nextInt();
            //  System.out.println(sumTwoNum((n1,n2)));

            int result = sumTwoNum(n1, n2);
            sc.close();
            System.out.println(result);
    }
}
