package basic;

public class printduplicates {
    public static void main(String[] args) {
        int[] nums = {1,22,3,4,55,5,3,22,6};
        for (int i = 0; i < nums.length ; i++) {
            for(int j = i+1;j< nums.length;j++){
                if(nums[i] == nums[j])
                    System.out.println("The Duplicates are: " + nums[i]);


            }

        }
    }
}
