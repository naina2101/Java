import java.util.*;

public class AASample {

    public static void clearScreen() {  
       System.out.print("\033[H\033[2J");  
       System.out.flush();  
     
    }
public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("hey!");
        sc.close();
    }
    
}
