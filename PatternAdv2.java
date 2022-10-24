import java.util.*;

public class PatternAdv2  {

    public static void clearScreen() {  
       System.out.print("\033[H\033[2J");  
       System.out.flush();  
     
    }
public static void main(String[] args){
        //pyramid palindrome numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Palindrome:");
        int n = sc.nextInt();
        sc.close();
   
        for(int i=1; i<=n; i++) {
            for(int j = 1; j <= n-i; j++)
              System.out.print(" ");
            for(int j = i; j >= 1; j--)
              System.out.print(j);
            for(int j = 2; j <= i; j++)
              System.out.print(j);
            System.out.println();
        }
    }
    }