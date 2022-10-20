import java.util.*;
public class SpiralOrder2dArray {

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
    for(int i = 0; i < 5; i++)
    {
        for(int j = 0; j < 6; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }

    int row_start=0, row_end=4, col_start=0, col_end=5;

    while(row_start <= row_end && col_start <= col_end){
        
    for(int col = col_start; col <= col_end; col++){
        System.out.print(matrix[row_start][col] + " ");
    }
    row_start++;
    for(int row = row_start; row <= row_end; row++){
        System.out.print(matrix[row][col_end] + " ");
    }
    col_end--;
    for(int col = col_end; col >= col_start; col--){
        System.out.print(matrix[row_end][col] + " ");
    }
    row_end--;
    for(int row = row_end; row >= row_start; row--){
        System.out.print(matrix[row][col_start] + " ");
    }
    col_start++;
    }
    sc.close();
}

}
