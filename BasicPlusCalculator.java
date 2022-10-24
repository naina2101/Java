import java.util.*;

public class BasicPlusCalculator {

    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  
     
        System.out.flush();  
     
     }
    public static void main(String[] args)
    {
        System.out.println("Enter two integers for operation:");
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        System.out.println("Enter the operation you want to perform- '+,-,*,/,%' 1 to 5 respectively:");
        int op = sc.nextInt();
        sc.close();
        switch(op)
        {
            case 1 : 
            result = a + b;
            System.out.print("Sum : ");
            System.out.println(result);
            break;

            case 2 : 
            result = a - b;
            System.out.print("Substraction : ");
            System.out.println(result);
            break;

            case 3 : 
            result = a * b;
            System.out.print("Multiplication : ");
            System.out.println(result);
            break;

            case 4 : 
            result= a / b;
            System.out.print("Division : ");
            System.out.println(result);
            break;

            case 5 : 
            result = a % b;
            System.out.print("Remainder : ");
            System.out.println(result);
            break;

            default : System.out.println("Invalid Operator");

        }
        

    }
    
}