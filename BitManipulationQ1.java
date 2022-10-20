import java.util.*;
public class BitManipulationQ1 {
    
    public static void main(String[] args){

        //To find if a number is a power of 2.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result;
        result = n & (n-1);
        if(result == 0){
            System.out.println("Number is Power of 2.");
        }
        else{
            System.out.println("Number is not Power of 2.");
        }
        sc.close();


    }
}
