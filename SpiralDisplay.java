import java.io.*;
import java.util.*;

public class SpiralDisplay {

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
        
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int tne = n * m;
        int count = 0;
        
        
        while(count < tne){
            //left wall
            for(int i = minr, j = minc; i <= maxr && count < tne; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            
            //bottom wall
            for(int i = maxr, j = minc; j <= maxc && count < tne; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            
            //right wall
            for(int i = maxr, j = maxc; i >= minr && count < tne; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            
            //top wall
            for(int i = minr, j = maxc; j >= minc && count < tne; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        } 
        
    }

}

// import java.util.*;

// public class SpiralDisplay {
//     public static Scanner scn = new Scanner(System.in);

//     public static void input(int[][] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 arr[i][j] = scn.nextInt();
//             }
//         }
//     }

//     public static void printSpiral(int[][] arr) {

//         int minr = 0;
//         int minc = 0;
//         int maxr = arr.length - 1;
//         int maxc = arr[0].length - 1;
//         int tne = arr.length * arr[0].length;
//         int count = 0;

//         while (count < tne) {
//             // left wall
//             for (int i = minr, j = minc; i <= maxr && count < tne; i++) {
//                 System.out.println(arr[i][j]);
//                 count++;
//             }
//             minc++;

//             // bottom wall
//             for (int i = maxr, j = minc; j <= maxc && count < tne; j++) {
//                 System.out.println(arr[i][j]);
//                 count++;
//             }
//             maxr--;

//             // right wall
//             for (int i = maxr, j = maxc; i >= minr && count < tne; i--) {
//                 System.out.println(arr[i][j]);
//                 count++;
//             }
//             maxc--;

//             // top wall
//             for (int i = minr, j = maxc; j >= minc && count < tne; j--) {
//                 System.out.println(arr[i][j]);
//                 count++;
//             }
//             minr++;
//         }
//     }

//     public static void main(String[] args) {
//         int n = scn.nextInt();
//         int m = scn.nextInt();
//         int[][] arr = new int[n][m];
//         input(arr);
//         printSpiral(arr);
//     }
// }