import java.util.*;

public class Loop1SumOfn {

    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  
     
        System.out.flush();  
     
     }
    public static void main(String[] args){

        int n, sum = 0;
        System.out.println("Enter a natural no.:-");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for( int i = 1; i <= n; i++)
        {
            sum += i;

        }
        System.out.println("Sum:-");
        System.out.println(sum);
        sc.close();
    }
    
}