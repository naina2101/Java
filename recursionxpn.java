public class recursionxpn {
    public static int xpown(int x, int n){

        if( n==0 )
          return 1;
        //if( x==0)
         // return 0;
        
        int mul = x * (xpown(x,n-1));
        return mul;
    }

    public static void main(String[] args) {
        int x=2, n=5;
        int xpn = xpown(x, n);
        System.out.println(xpn);
    }
}
