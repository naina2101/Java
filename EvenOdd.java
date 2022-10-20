import java.util.*;

public class EvenOdd {
      public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2 == 0)
        { 
            System.out.println("The number is even.");
        }
        else
            System.out.println("The number is odd.");
        sc.close();
      }    
      
}
