public class recursionMoveElem {
    public static void moveAlllX(String str, int idx, int count, String newString){

        if( idx == str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if( currChar == 'x'){
            count++;
            moveAlllX(str, idx+1, count, newString);
            // System.out.println("x" + count);
        }
        else{
           newString += currChar; 
           moveAlllX(str, idx+1, count, newString);
        //    System.out.println("char"+count);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        String newString = "";
        moveAlllX(str, 0, 0, newString);
    }
    
}
