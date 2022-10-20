import java.util.*;

public class AdvPattern5  {
public static void main(String[] args){
        //inverted pyramid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Inverted Half pyramid:");
        int n = sc.nextInt();
        sc.close();
        
        for( int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++)
               System.out.print(n-i+1);
            System.out.println();
        }

    }
}