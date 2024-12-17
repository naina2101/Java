// import java.util.Scanner;

// public class backtrackingSudoko  {
//         // public boolean isSafe(char[][] board, int row, int col, int number){
//         //     for(int i=0; i<row; i++){
               
//         //         //row
//         //         if(board[i][col] == (char)(number+'0'))
//         //             return false;
              
//         //         //column
//         //         if(board[row][i] == (char)(number+'0'))
//         //             return false;
                
//         //         //grid
//         //         int starR= (row/3)*3;
//         //         int starC= (col/3)*3;
//         //         for(i=starR; i<3; i++)
//         //             for(int j=starC; j<3; j++)
//         //                 if(board[i][j]== (char)(number+'0'))
//         //             return false;
//         //     }
//         //     return true;  
//         // }
//         // public boolean helper(char[][] board, int row, int col){
            
//         //     if(row == board.length)
//         //         return true;
            
//         //     int newR=0, newC=0;
//         //     if(newC != board.length()-1){
//         //         newC++;
//         //     }
//         //     else {
//         //         newR++;
//         //         newC= 0;
//         //     }
            
//         //     if(board[row][col] != "."){
//         //       if(helper(board, newR, newC))
//         //           return true;
//         //       else{
//         //           for(int i=0; i<9; i++){
//         //               if(isSafe(board[row][col], row, col, i))
//         //                   board[row][col] = (char)(i+'0');
//         //               if(helper(board[row][col], newR, newC))
//         //                   return true;
//         //               else 
//         //                   board[row][col]='.';
//         //           }
//         //       }
//         //     }
//         //     return false;
//         // }
//         // void solveSudoku(vector<vector<char>>& board) {
//         //     helper(board,0,0);
            
//         // }
//             public boolean isSafe(char[][] board, int row, int col, int number){
                
//                 for(int i=0; i<board.length; i++){
//                     if(board[i][col] == (char)(number+'0'))
//                         return false;
//                 }
//                 for(int j=0; j<board.length; j++) {  
//                     if(board[row][j] == (char)(number+'0'))
//                         return false;
//                 }
                
//                     int starR= (row/3)*3;
//                     int starC= (col/3)*3;
//                     for(int i=starR; i<3; i++) {
//                         for(int j=starC; j<3; j++)
//                             if(board[i][j]== (char)(number+'0'))
//                         return false;
//                 }
//                 return true;  
//             }
//             public boolean helper(char[][] board, int row, int col){
                
//                 if(row == board.length)
//                     return true;
                
//                 int newR=0, newC=0;
//                 if(col != board.length-1){
//                     newR= row+1;
//                     newC=0;
//                 }
//                 else {
//                     newR=row;
//                     newC= col+1;
//                 }
                
//                 if(board[row][col] != '.'){
//                   if(helper(board, newR, newC))
//                       return true;
//                   else {
//                       for(int i=0; i<9; i++){
//                           if(isSafe(board, row, col, i)){
//                               board[row][col] = (char)(i+'0');
//                           if(helper(board, newR, newC))
//                               return true;
//                       }
//                           else 
//                               board[row][col]='.';
//                       }
//                   }
//                 }
//                 return false;
//             }
            
//             public static void main(String[] args){
                
//                 char[][] board = new char[9][9];
//                 board[][]= (("5","3",".",".","7",".",".",".",".") , ("6",".",".","1","9","5",".",".",".") , (".","9","8",".",".",".",".","6",".") , ("8",".",".",".","6",".",".",".","3"),["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
//                 // // Scanner sc = new Scanner(System.in);
//                 // // for(int i =0; i<9; i++)
//                 // //   for(int j = 0; j<9; j++){
//                 // //     board[i][j]  = sc.next().toCharArray();
//                 helper(board, 0, 0);
//                 }
                
//             }
//         }

        