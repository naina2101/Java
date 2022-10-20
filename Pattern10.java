public class Pattern10{
    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  
     
        System.out.flush();  
     
     }
    public static void main(String[] args){

        /* Solid Rhombus.
     ****
    ****
   ****
  ****
        */

        int n = 5;
        for(int i = 1; i <= n; i++)
        {
            
            for(int j = n; j >= i; j--)
            { 
                  System.out.print(" ");
            }
            
            for(int j = 1; j < n*2; j++)
            { 
                if( (i+j) >= (n+1) && (i+j) <= (n*2))
                   System.out.print("*");
              
            }
            System.out.println();
        }
        
    }
    
}