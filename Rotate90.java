
import java.util.*;

public class Rotate90 {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

     public static void rotateArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {       //so that double transpose doesnt happen
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reverse array
        for (int i = 0; i < arr.length; i++) {
            int li = 0; // left index
            int ri = arr[i].length - 1;// right index
            while (li < ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }
        display(arr);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        input(arr);
        rotateArray(arr);
    }
}