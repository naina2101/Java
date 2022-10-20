public class Pattern7 {
    public static void clearScreen() {  
    
        System.out.print("\033[H\033[2J");  
     
        System.out.flush();  
     
     }
    public static void main(String[] args){

        /*
        12345
        1234
        123
        12
        1
        */
        int n = 5;
        for(int i = n; i >= 1; i--)
        {
            for(int j = i; j >= 1; j--)
            { 
                  System.out.print(i+1-j);
            }
            System.out.println();
        }
        
    }
    
}