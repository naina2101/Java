import java.util.*;
public class BitManipulationUpdate {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        int n=5, pos=3;
        int bitMask = 1<<pos;
        
        if(op == 1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            bitMask = ~(bitMask);
            int newNumber = bitMask & n;
            System.out.println(newNumber);
        }
        sc.close();


    }
}
