package BinarySearch;

public class Q2Floor {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 15, 16, 17, 8, 19, 10, 11};
        int target = 18;
        int ans = Floor(nums, target);
        System.out.println(ans);
    }
    //return the index : Greatest number <= target
    static int Floor(int[] arr, int target) {
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
        return end;

    }
}
