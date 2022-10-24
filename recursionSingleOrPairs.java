public class recursionSingleOrPairs {
    public static int guestCall(int n){

        if(n<=1)
         return 1;

        int ways1 = guestCall(n-1);
        int ways2 = (n-1)*guestCall(n-2);
        return ways1+ways2;
    }
    
    public static void main(String[] args) {
        int n = 4;
        int callWays = guestCall(n);
        System.out.println(callWays);
    }
}
