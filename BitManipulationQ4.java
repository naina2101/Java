import java.util.*;
public class BitManipulationQ4 {

    public static void decimalToBinary(int n){
        
            StringBuilder str = new StringBuilder();
            while(n != 0){
                if(n % 2 == 0)
                  str.insert(0, 'o');
                else
                  str.insert(0, '1');
                n = n/2;
            }
                System.out.println("Binary representation of " + n + " is: " + str);

        
    }

    public static void binaryToDecimal(int b){
        int count = 0; 
        int n[] = new int[b];
        for(int i = 0; i < n.length; i++){
            count+= n[i]*((int)Math.pow(2, i));
        }
        System.out.println("Decimal representation of " + b + " is: " + count);
    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        // decimalToBinary(n);
        binaryToDecimal(n);
        sc.close();
    }
}