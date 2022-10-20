import java.util.*;
public class FunctionPrime {

    public static void PrimeNumber(int a){

        for(int i = a/2; i >= 2;)
           if(a%i==0) {
             System.out.println("Not a prime number.");
             return;
           }
           else{
             System.out.println("Prime number.");
             return;
            }
        
    }

   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      PrimeNumber(n);
      sc.close();

   }
    
}
