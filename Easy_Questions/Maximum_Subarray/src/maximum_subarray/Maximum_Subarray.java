package maximum_subarray;

public class Maximum_Subarray {
     public static void maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i = 0; i < nums.length;i++){
            if(sum < 0){
                sum = nums[i];
            }else{
                sum += nums[i];
            }
            if(sum > max){
                max = sum;
            }
        }
         System.out.println(max);
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }

}
