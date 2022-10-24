import java.util.*;


public class String5CaseChanging {
// Java Program to demonstrate
// Conversion of String from lowercase
// to uppercase without using
// built-in String functions

    public static void main(String args[]) {
        
        System.out.println("Enter Lowercase string-");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
            //String str = "java is best";
        System.out.println("Lower case string is : " + str);
        char strArr[] = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
                    // here is the actual logic
            if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                strArr[i] = (char) ((int) strArr[i] - 32);
                    }
            }
            System.out.print("Upper case string is : ");
            // print the string array
            for (int i = 0; i < strArr.length; i++) {
                    System.out.print(strArr[i]);
            }
            sc.close();
    }
}