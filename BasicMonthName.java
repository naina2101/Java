import java.util.*;

public class BasicMonthName {

    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  
     
        System.out.flush();  
     
     }
    public static void main(String[] args){
        System.out.println("Enter month number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a)
        { 
            case 1 : 
            System.out.println("Month name: January");
            break;

            case 2:
            System.out.println("Month name: February");
            break;

            case 3: 
            System.out.println("Month name: March");
            break;

            case 4:
            System.out.println("Month name: April");
            break;

            case 5:
            System.out.println("Month name: May");
            break;

            case 6:
            System.out.println("Month name: June");
            break;

            case 7:
            System.out.println("Month name: July");
            break;

            case 8:
            System.out.println("Month name: August");
            break;

            case 9:
            System.out.println("Month name: September");
            break;

            case 10:
            System.out.println("Month name: October");
            break;

            case 11:
            System.out.println("Month name: November");
            break;

            case 12:
            System.out.println("Month name: December");
            break;

            default:
            System.out.println("Invalid number");
        }
        sc.close();
    }
    
}
