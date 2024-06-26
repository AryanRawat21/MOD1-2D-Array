
import java.util.*;

public class Search2D {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void search(int[][]arr){
        int x = scn.nextInt();
        int i =0;
        int j = arr[0].length-1;
        while(i<arr.length && j>=0){    //search from top right
            if(x == arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(x<arr[i][j]){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        input(arr);
        search(arr);
    }
}