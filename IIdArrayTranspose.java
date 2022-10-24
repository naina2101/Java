import java.util.*;
public class IIdArrayTranspose {

    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row and column size:");
    int n = sc.nextInt();
    int m = sc.nextInt();
    int matrix[][] = new int[5][6];
    System.out.println("Enter the matrix:");
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < m; j++){
            matrix[i][j]= sc.nextInt();
        }
        System.out.println();
    }
    System.out.println("The matrix is :");
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < m; j++){
            System.out.print(matrix[j][i] + " ");
        }
        System.out.println();
    }
    sc.close();
}}