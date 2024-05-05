import java.io.*;
import java.util.*;

public class Wakanda1{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    
    int[][] arr = new int[n][m];
    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[0].length; j++){
            arr[i][j] = scn.nextInt();
        }
    }
    
    for(int j = 0; j < arr[0].length; j++){ //as j is always increasing
        if(j % 2 == 0){     //when j is even, arr[i][j] increases
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i][j]);
            }
        } else {    //when j is odd, arr[i][j] decreases
            for(int i = arr.length - 1; i >= 0; i--){
                System.out.println(arr[i][j]);
            }
        }
    }
 }

}

// import java.util.*;

// public class Wakanda1 {
//     public static Scanner scn = new Scanner(System.in);

//     public static void input(int[][] arr) {
//         int n = arr.length; // REPRESENTS NUMBER OF ROWS
//         int m = arr[0].length;// REPRESENTS NUMBER OF COLUMNS

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = scn.nextInt();
//             }
//         }
//     }

//     // public static void stateOfWakanda(int[][] arr) {   //STATE OF WAKANDA 1
//     // int n = arr.length;
//     // int m = arr[0].length;
//     // for (int j = 0; j < m; j++) {
//     // if (j % 2 == 0) {
//     // for (int i = 0; i < n; i++) {
//     // System.out.println(arr[i][j]);
//     // }
//     // } else {
//     // for (int i = n - 1; i >= 0; i--)
//     // System.out.println(arr[i][j]);

//     // }

//     // }
//     // }

//     public static void stateOfWakanda_FB(int[][] arr) { // SPECIAL CASE OF STATE OF WAKANDA 1
//         int n = arr.length;
//         int m = arr[0].length;
//         for (int i = 0; i < n; i++) {
//             if (i % 2 == 0) {
//                 for (int j = 0; j < m; j++) {
//                     System.out.println(arr[i][j]);
//                 }
//             } else {
//                 for (int j = m - 1; j >= 0; j--)
//                     System.out.println(arr[i][j]);

//             }

//         }
//     }

//     public static void main(String[] args) {
//         int[][] arr = new int[scn.nextInt()][scn.nextInt()];
//         input(arr);
//         stateOfWakanda_FB(arr);

//     }

// }