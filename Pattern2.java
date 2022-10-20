public class Pattern2 {
    
public static void clearScreen() {  
    
  System.out.print("\033[H\033[2J");  
  System.out.flush();  
         
  }
public static void main(String[] args){

//Hollow Rectangle
  int i, j;
  for(i = 1; i <= 4; i++)
  {
    for(j = 1; j <= 5; j++)
    { 
        if(i == 1 || i == 4 || j == 1 || j == 5)
          System.out.print("*");
        else 
          System.out.print(" ");
               
    }
    System.out.println();
  }
        
  }
}