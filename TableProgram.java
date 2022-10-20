    import java.util.*;

    public class TableProgram {
    
        public static void clearScreen() {  
    
            System.out.print("\033[H\033[2J");  
         
            System.out.flush();  
         
         }
        public static void main(String[] args){

            int n;
            System.out.println("Enter the table no.:-");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            for(int i = 1; i <= 10; i++)
               System.out.println(n*i);
            sc.close();
        }
        
    }
    