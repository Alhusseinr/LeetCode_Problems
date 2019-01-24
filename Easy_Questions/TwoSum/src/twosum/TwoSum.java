package twosum;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11, 5, 2};
        int target = 9;
        twoSum(nums, target);
    }
    public static void twoSum(int[] nums, int target) {
        String returnVal = "There are no values";
        int i = 0;
        for(int j = 1; j <nums.length; j++){
            if(nums[i] + nums[j] == target){
                System.out.println("[" + nums[i] + "," + nums[j] + "]"); 
            }
            i++;
        }
    }
}
