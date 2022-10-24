

public class PatternAdv8{

    public static void clearScreen() {  
       System.out.print("\033[H\033[2J");  
       System.out.flush();  
     
    }
public static void main(String[] args){

        //Pascal's triangle
        int n = 5;
        
        for(int i = 0; i < n; i++)
        {   
            for(int j = 0; j < n-i; j++)
              System.out.print(" ");
            int k = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(k + " ");
                k = (k * (i-j))/(j+1);
            }
        System.out.println();
        }
    
}
}
