    public class Pattern1 {
        public static void clearScreen() {  
    
            System.out.print("\033[H\033[2J");  
         
            System.out.flush();  
         
         }
        public static void main(String[] args){
    
            //solid rectangle
            for(int i = 0; i < 4; i++)
            {
                for(int j = 0; j < 5; j++)
                { 
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
        
    }