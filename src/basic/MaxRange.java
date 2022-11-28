package basic;

import java.util.Scanner;

public class MaxRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start  = in.nextInt();
        int end = in.nextInt();
        int [] arr = {1,22,33,4,100,444};
        System.out.println(maxRange(arr,start,end));
    }
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for (int i = start; i <= end ; i++)
        {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
