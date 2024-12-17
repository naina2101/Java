public class recursionTowerHanoi {
    public static void TowHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + src +" to " +dest);
            return;
        }

        TowHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src +" to " +dest);
        TowHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        TowHanoi(9, "S", "H", "D");
    }
}
