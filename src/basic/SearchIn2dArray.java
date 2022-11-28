package basic;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,1,4},
                {2,3,5},
                {78,89,44,11},
                {18,12}
        };
        int target = 89;
        int[] ans = search(arr, target);
        System.out.println((Arrays.toString(ans)));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }

            }

        }
        return new int[]{-1,-1};
    }




}
