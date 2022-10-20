public class Pattern9{
    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  
     
        System.out.flush();  
     
     }
    public static void main(String[] args){

        /* 0-1 triangle.
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
        */
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            { 
                if( (i-j)%2 == 0)
                {
                    System.out.print("1 ");
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
        
    }
    
}