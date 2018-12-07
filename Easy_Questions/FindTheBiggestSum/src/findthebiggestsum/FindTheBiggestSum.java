package findthebiggestsum;

public class FindTheBiggestSum {

    public static void maxSubbarray(int[] A) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (sum < 0) {
                sum = A[i];
            } else {
                sum += A[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4, 8, 5, 6, 7, 6, -9, -7, -2};
        maxSubbarray(Arr);
    }
    
}
