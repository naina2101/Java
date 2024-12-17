// import java.util.ArrayList;
// import java.util.Scanner;

// public class backtrackingPrintPermInt {
    
//     public static void printPerm(int input[], ArrayList<Integer> output[]){
//         if(input.length== 0){
//             System.out.println(output);
//             return;
//         }

//         for(int i = 0; i<input.length; i++){

//             int currNum = input[i];
//             ArrayList<Integer> newInput = new ArrayList<>(); 
//             newInput.remove(i); 
//             printPerm(newInput, output.add(currNum));
//          }
//     }

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int input[] = new int[6];
//         for(int i = 0; i < 6; i++){
//             input[i] = sc.nextInt();
//         }
//         printPerm(input,   );
//     }
// }
