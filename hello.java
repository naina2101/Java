import java.util.*;
class hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("The sum of the two integers is:");
        System.out.println(sum);
        sc.close();
    }
}