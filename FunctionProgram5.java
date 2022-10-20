import java.util.*;
public class FunctionProgram5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a,b);
        sc.close();
    }
    public static void gcd(int x, int y) 
    { 
        int gcd=1;
        for(int i = 1; i<x && i<y ; i++)
        { 
            if( x%i==0 && y%i==0)
              gcd= i;
        }
        System.out.println("GCD : " + gcd);
    }
}
