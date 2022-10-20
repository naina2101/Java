public class AdvPattern6{
public static void main(String[] args){

        /* Hollow Rhombus.
     ****
    *  *
   *  *
  ****
        */

        int n = 10;
        /*for(int i = 1; i <= n; i++){
          for(int j = 1; j <= n-i; j++)
            { 
                  System.out.print(" ");
            }
          System.out.println();
          if( (i == 1) || (i == n) ){
            for(int j = 1; j < n; j++)
              System.out.print("*");
          }*/

          for(int i=1; i<=n; i++)

          {

            for(int j=1; j<=n-i; j++)
               System.out.print(" ");
            if(i==1 || i==n){
               for(int j=1; j<=n; j++)
                  System.out.print("*");
            }
            else
            {
               for(int j=1; j<=n; j++){
                  if(j==1 || j==n)
                    System.out.print("*");
                  else
                    System.out.print(" ");
               }
            }

            System.out.println();

}

}

}
