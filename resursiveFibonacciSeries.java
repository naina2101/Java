public class resursiveFibonacciSeries {
    public static void fibonacciSeries(int a, int b, int count){
        if(count == 0)
          return;
        int c = a+b;
        System.out.print(c + " ");
        fibonacciSeries(b, c, count-1);
    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n=10;
        System.out.print(a + " " + b + " ");
        fibonacciSeries(a, b, n-2);
    }
}
