import java.util.*;

public class String4ArrayCatLength {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int strNumber=0;
       String str[] = new String[size];
       for(int i = 0; i < size; i++){
         str[i] = sc.next();
         strNumber+= str[i].length(); 
       }
       System.out.print("Length of Strings is: " + strNumber);
       System.out.println();
       for(int i = 0; i < size; i++){
         System.out.print(str[i] + " ");
       }
       
       sc.close();
    }
 }
 