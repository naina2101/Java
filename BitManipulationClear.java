public class BitManipulationClear {

    public static void main(String[] args){
        int n=5, pos=2;
        int bitMask = 1<<pos;
        bitMask = ~(bitMask);
        int newNumber = bitMask & n;
        System.out.println(newNumber);
    }
}