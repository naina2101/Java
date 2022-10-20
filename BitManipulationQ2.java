import java.util.*;
public class BitManipulationQ2 {
	public static void main(String args[]) 
	{ 
        //Toggle a bit a position pos of any number n.
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int pos = sc.nextInt(); 
        int bitMask = 1<<pos;
        int toToggle = bitMask & n;
        if(toToggle == 0){
            int newNumber = bitMask | n;// 0010 OR 0101 = 0111 & ^ ~
            System.out.println(newNumber);
        }
        else {
            bitMask = ~(bitMask);
            int newNumber = bitMask & n;
            System.out.println(newNumber);
        }
        sc.close();
	} 
}    
