import java.util.Arrays;
import java.util.Scanner;

public class TwoDArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
          1 2 3
          4 5 6
          7 8 9
         */

      //  int[][] arr = new int[3][];

       /* int [][] arr2d = {
                {1, 2, 3}, //0th Index
                {4, 5}, // 1st Index
                {6, 7, 8, 9} // 2nd Index ->arr2d[2] = {6, 7, 8, 9}
        };*/

        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        //input

        for(int row = 0; row<arr.length; row++){

            for(int col = 0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();

            }
        }


       /* for(int row = 0; row<arr.length; row++){

            for(int col = 0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();

        }*/

       /* for(int row = 0; row < arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }*/

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }



    }
}
