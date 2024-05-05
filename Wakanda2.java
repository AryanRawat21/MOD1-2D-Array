
import java.util.*;

public class Wakanda2 {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

   /* public static void diagonalPrint(int[][] arr) {  //half diagonal
        for (int gap = 0; gap < arr.length; gap++) {
            for (int i = 0, j = gap; j<arr.length ; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }*/

    public static void fullDiagonal(int[][] arr) {
        int n = arr.length;
        for (int gap = n - 1; gap >= 1; gap--) {
            for (int i = gap, j = 0; i < arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
        for (int gap = 0; gap < arr.length; gap++) {
            for (int i = 0, j = gap; j < arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        input(arr);
        fullDiagonal(arr);
    }
}