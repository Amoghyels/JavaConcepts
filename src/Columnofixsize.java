public class Columnofixsize {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,4,5},
                {5,6},
                {7,8,9}
        };

        for(int row = 0; row <arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }





    }
}
