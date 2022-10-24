import java.util.*;

public class BasicOutputMarks {

    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  
     
        System.out.flush();  
     
     }
    public static void main(String[] args){
        
        int i = 0, a = 0;
        Scanner sc = new Scanner(System.in);
        do
        {
                   
             System.out.println("Enter either 1 or 0-");
             a = sc.nextInt();

             switch(a)
             {
                case 0 : 
                break;

                case 1 :
                System.out.println("Enter Marks-");
                int marks = sc.nextInt();
                if(marks >= 100)
                    System.out.println("Invalid marks.");
                else if(marks >= 90)
                    System.out.println("This is Good.");
                else if(marks >= 60 && marks <= 89)
                    System.out.println("This is also Good.");
                else 
                    System.out.println("This is Good as well.");
                    break;

                default:
                System.out.println("You entered a wrong number.");

             }
             System.out.println("Do you want to continue? 1 for Yes and 0 for No.");
             i = sc.nextInt();
             
        } while(i == 1);
        sc.close();
    }
    
}