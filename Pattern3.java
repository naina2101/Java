public class Pattern3 {
    public static void clearScreen() {  
    
        System.out.print("\033[H\033[2J");  
     
        System.out.flush();  
     
     }
    public static void main(String[] args){

        /*
        ****
        ***
        **
        *
        */
        for(int i = 4; i >= 1; i--)
        {
            for(int j = i; j >= 1; j--)
            { 
                  System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}