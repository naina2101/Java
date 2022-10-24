
    import java.util.*;

    public class BasicPrimeOrNot {
    
        public static void clearScreen() {  
    
            System.out.print("\033[H\033[2J");  
         
            System.out.flush();  
         
         }
        public static void main(String[] args){
    
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if( n==1)
                    System.out.println("It's neither Prime nor Composite number.");
            sc.close();
            int i = 2;
            while(i < n)
            { 
                if(n % i != 0)
                {
                    i++;
                    if(i == (n-1))
                       System.out.println("It's a Prime Number.");
                    else if (n == 1)
                       System.out.println("It's neither Prime nor Composite.");
                    else
                       continue;
                }
            
                else
                {
                    System.out.println("It is not a Prime number.");
                    break;
                }
            }
        }
        
    }
    
