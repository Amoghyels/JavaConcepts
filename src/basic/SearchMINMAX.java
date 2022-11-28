package basic;

public class SearchMINMAX {
    public static void main(String[] args) {
        int [] nums = {1,2,44,5,666,7,8,99,555,10};
        System.out.println(MinMax(nums));


    }


    //assume arr.length !=0
    static int MinMax(int []arr){
        int ans = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;





    }



}
