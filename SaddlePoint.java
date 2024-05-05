
import java.util.*;

public class SaddlePoint {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void minMaxPoint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int svj = 0; // smallest value j
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][svj]) {
                    svj = j;
                }
            }
            boolean flag = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][svj] > arr[i][svj]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid input");
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        input(arr);
        minMaxPoint(arr);
    }

}
