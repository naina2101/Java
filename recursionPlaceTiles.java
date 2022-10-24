public class recursionPlaceTiles {
    public static int placeTiles(int n, int m){

        if(n==m)
          return 2;
        if(n<m)
          return 1;

        int vertPlacements = placeTiles(n-m, m);
        int horiPlacements = placeTiles(n-1, m);
        return vertPlacements+horiPlacements;
    }

    public static void main(String[] args) {
        int n=4, m=2;
        int totalWays= placeTiles(n, m);
        System.out.println(totalWays);
    }
}
