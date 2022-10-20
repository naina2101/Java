import java.util.*;

public class HackerRankSolution2 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int a = sc.nextInt();
        System.out.println("Enter double integer:");
        double b = sc.nextDouble();
        System.out.println("Enter the string:");
        String str = sc.next();
        str += sc.nextLine();
        int sum1 = a + i;
        double sum2 = d + b;
        String sum3 = s.concat(str);
        sc.close();
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        
    }
}