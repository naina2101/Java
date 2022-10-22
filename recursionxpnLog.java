public class recursionxpnLog {
    public static int xpown(int x, int n){

        if( n==0 )
          return 1;
        //if( x==0)
         // return 0;
        
        if( n % 2 == 0)
           return xpown(x,n/2) * xpown(x, n/2);
        else 
           return xpown(x,n/2) * xpown(x, n/2) * x;
    }

    public static void main(String[] args) {
        int x=2, n=5;
        int xpn = xpown(x, n);
        System.out.println(xpn);
    }
}
