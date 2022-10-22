public class recursiveFactorial {
    // public static void factorial(int i, int n, int mul){
    //     if(i == n){
    //         mul*= i;
    //         System.out.println(mul);
    //         return;
    //     }
    //     mul *=i;
    //     factorial(i+1, n, mul);
    // }
    // public static void main(String[] args) {
    //     factorial(1, 5, 1);
    // }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int fact_nm1= factorial(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n=5;
        int ans = factorial(n);
        System.out.println(ans);
    }
}
