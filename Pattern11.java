public class Pattern11{
    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  
        System.out.flush();  
     
     }
    public static void main(String[] args){

        /* Pyramid.
              1
            2   2
           3   3   3
          4   4   4   4
        5   5   5   5   5
        */

        int n = 5;
        for(int i = 1; i <= n; i++)
        {
            
            for(int j = n; j >= i; j--)
            { 
                  System.out.print(" ");
            }
            
            for(int j = 1; j <= i; j++)
            {
                   System.out.print(i + " ");
              
            }
            System.out.println();
        }
        
    }
}