package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);


    }

    static int orderAgnosticBS(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;


        //Find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //find the middle element
            //int mid = (start + end) / 2; might be possiblee that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;

    }

}
