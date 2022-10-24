import java .util.*;
public class String1UsernmFromMail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String userNAme = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '@' )
               break;
            else
               userNAme += str.charAt(i);
        }
        System.out.println(userNAme);
        sc.close();
    }
    
}
