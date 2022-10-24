public class BitManipulationSet {

    public static void main(String[] args){
        int n=5, pos=1;
        int bitMask = 1<<pos;//  0001<<1=0010

        int newNumber = bitMask | n;// 0010 OR 0101 = 0111 & ^ ~
        System.out.println(newNumber);
    }
}