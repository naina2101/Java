public class Pattern6 {
    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  
     
        System.out.flush();  
     
     }
    public static void main(String[] args){

        /* 
        1
        12
        123
        1234
        12345
        */
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= i; j++)
            { 
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    
}