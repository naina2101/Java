// public class recursionRemDup {
//    public static boolean map[]= new boolean[26];

//     public static void remDup(String str, int idx, String newStr){
//         if(idx== str.length()){
//             System.out.println(newStr);
//             return;
//         }

//         char currChar = str.charAt(idx);
//         for(int i=0; i<=idx; i++){
//             if(map[currChar - 'a'] == true)
//               remDup(str, idx+1, newStr);
//             else{
//               if(map[currChar - ''])
//               newStr += currChar;
//               remDup(str, idx+1, newStr);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         String str= "abbccda";
//         remDup(str, 0, "");
//     }
// }
public class recursionRemDup {
    public static String removeDuplicates(String str, int idx, boolean present[]) {
    System.out.println("removeDuplicates("+idx+" "+present+")");
    if(idx == str.length()) {
    return "";
    }
    char curr = str.charAt(idx);
    if(present[curr-'a']) {
    return removeDuplicates(str, idx+1, present);
    } else {
    present[curr-'a'] = true;
    return curr + removeDuplicates(str, idx+1, present);
    }
    }
    public static void main(String args[]) {
    String str = "aabbccda";
    boolean present[] = new boolean[str.length()];
    System.out.println(removeDuplicates(str, 0, present));
    }
    }