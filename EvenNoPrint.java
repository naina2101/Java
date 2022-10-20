
    import java.util.*;

    public class EvenNoPrint {
    
        public static void clearScreen() {  
    
            System.out.print("\033[H\033[2J");  
         
            System.out.flush();  
         
         }
        public static void main(String[] args){

            int i=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a no!");
            int n = sc.nextInt();
            while(i <= n)
            {
                if(i%2 == 0)
                  System.out.println(i);
                i++;
            }
            System.out.println("hey!");
            sc.close();
        }
        
    }
