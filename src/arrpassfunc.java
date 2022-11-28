import java.util.Arrays;

public class arrpassfunc {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));

        Change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void Change(int[] arr){
        arr[0] = 99;


    }




}
