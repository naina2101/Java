import java.util.*;

public class PatternAdv3  {

    public static void clearScreen() {  
       System.out.print("\033[H\033[2J");  
       System.out.flush();  
     
    }
public static void main(String[] args){
        //diamond
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Diamond:");
        int n = sc.nextInt();
        sc.close();
         
        for( int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++)
               System.out.print(" ");
            for(int j = 1; j <= 2*i-1; j++)
               System.out.print("*");
            System.out.println();
        }

        for( int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i; j++)
               System.out.print(" ");
            for(int j = 1; j <= 2*i-1; j++)
               System.out.print("*");
            System.out.println();
        }
}
}