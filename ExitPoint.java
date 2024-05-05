
import java.util.*;

public class ExitPoint{
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void exitArray(int[][] arr) {
        int direc = 0; // 0-e,1-s,2-w,3-n
        int i = 0;
        int j = 0;
        while (true) {
            direc = (direc + arr[i][j]) % 4;
            if (direc == 0) { // east
                j++;
            } else if (direc == 1) {// south
                i++;
            } else if (direc == 2) {// west
                j--;
            } else if (direc == 3) {// north
                i--;
            }

            if (i < 0) {
                i++;
                break;

            } else if (j < 0) {
                j++;
                break;

            } else if (i == arr.length) {
                i--;
                break;

            } else if (j == arr[0].length) {
                j--;
                break;

            }
        }
        System.out.println(i);
        System.out.println(j);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        exitArray(arr);
    }
}