import java.util.Scanner;

public class BitManipulationQ3 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        int newNumber, count=0, pos=1;
        for(int i = 0; i < binary.length(); i++){
            int bitMask=0;
            bitMask = 1<<pos;
            newNumber = bitMask & n;
            if( newNumber !=0){
                count++;
            }
            pos++;
        }
        sc.close();
        System.out.println("Number of 1s in " + n + ":" + count);

    }
}
