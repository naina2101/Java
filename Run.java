

    public class Run {
    
        public static void clearScreen() {  
    
            System.out.print("\033[H\033[2J");  
         
            System.out.flush();  
         
         }
        public static void main(String[] args){
    
            for(; ;) {
                System.out.println("Apna College");
            }
    
        }
        
    }
    