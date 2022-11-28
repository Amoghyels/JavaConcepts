package BinarySearch;

public class Q1Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 15, 16, 17, 18, 19, 20, 21};;
        int target = 16;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    //return the index of smallest number >= target
    static int ceiling(int[] arr, int target) {

        //but what if the target is greater than the number in the array
        if(target >arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; might be possiblee that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return start;

    }
}
