import java.util.*;

public class PatternAdv4  {

    public static void clearScreen() {  
       System.out.print("\033[H\033[2J");  
       System.out.flush();  
     
    }
public static void main(String[] args){
        //half pyramid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Half pyramid:");
        int n = sc.nextInt();
        sc.close();
        
        for( int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++)
               System.out.print(j);
            System.out.println();
        }
    }
}