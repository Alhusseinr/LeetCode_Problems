import java.util.*;

public class Remove_duplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
    public static int removeDuplicates (int[] nums){
        //check if we have an array
        if(nums.length == 0){
            System.out.print("There is no array");
        }
        
        int i = 0;
        //This is where we check to see if there are any duplicates
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
