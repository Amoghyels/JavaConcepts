package BinarySearch;

public class BSALGO {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] arr1;
        int target = 14;
        int ans = binarysearch(arr,target);
        System.out.println(ans);


    }

    //return the index
    //return -1 if it does not exist
    static int binarysearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;


        while(start <= end){
            //find the middle element
            //int mid = (start + end) / 2; might be possiblee that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

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
