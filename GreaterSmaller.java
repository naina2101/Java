import java.util.*;

public class GreaterSmaller {
      public static void main(String[] args){
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b)
            System.out.println("The numbers are equal.");
        else if(a > b)
            System.out.println("a is greater than b.");
        else 
            System.out.println("a is smaller than b.");
        sc.close();
      }    
}