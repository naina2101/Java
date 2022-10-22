import java.util.HashSet;
public class recursionUniqueSub {
    
    public static void uniSub(String str, int idx, String newStr, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
            System.out.println(newStr);
            set.add(newStr);
            return;
            }
        }
          
        char currChar = str.charAt(idx);
        uniSub(str, idx+1, newStr+currChar, set);
        uniSub(str, idx+1, newStr, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniSub(str, 0, "", set);

    }
}
