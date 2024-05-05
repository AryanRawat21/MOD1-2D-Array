import java.util.*;


public class MaxMinFind {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static int maximum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > maxEle) {
                    maxEle = arr[i][j];
                }
            }
        }
        return maxEle;
    }

    public static int minimum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int minEle = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < minEle) {
                    minEle = arr[i][j];
                }
            }
        }
        return minEle;
    }

    public static boolean find(int[][] arr, int data) {
        boolean res = false;
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res = arr[i][j] == data;
                if (res) {
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
        int data = scn.nextInt();
        System.out.println(maximum(arr));
        System.out.println(minimum(arr));
        System.out.println(find(arr,data));

    }

}

