import java.util.*;
public class FunctionProgram3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers x and n respectively(x^n): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        PowerNumber(a,b);
        sc.close();
    }

    public static void PowerNumber(int a, int b){

        int NewDigit=1;
        for(int i=1; i<=b; i++)
          NewDigit*= a;
        System.out.println("Required digit is: " + NewDigit);
    }
    
}
