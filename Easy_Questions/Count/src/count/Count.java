package count;

public class Count {

    public static void twosum(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                sum = nums[i] + nums[j];

                if (sum == target) {
                    System.out.println("The indexes = " + "[" + i + ", " + j + "]");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 9};
        int taget = 18;
        twosum(arr, taget);
    }
}
