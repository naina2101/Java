
public class exam {
    public static String newString(String str1, String str2) {
        StringBuilder str3 = new StringBuilder();
        while (!str1.isEmpty() && !str2.isEmpty()) {
            char c1 = str1.charAt(0);
            char c2 = str2.charAt(0);
            if (c1 < c2) {
                str3.append(c1);
                str1 = str1.substring(1);
            } else if (c2 < c1) {
                str3.append(c2);
                str2 = str2.substring(1);
            } else {
                str3.append(c1);
                str1 = str1.substring(1);
            }
        }
        str3.append(str1);
        str3.append(str2);
        return str3.toString();
    }

    public static void main(String[] args){
        String str1 = "DAVID";
        String str2 = "ROSE";
        String str3 = newString(str1,str2);
        System.out.println(str3);
    }
}
