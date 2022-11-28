import java.util.Arrays;

public class funk {
    public static void main(String[] args) {
        int[] arr = {12,3,4,5,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void change(int[] nums){
        nums[0] = 69;
    }

}
