package perfsquare;

public class PerfSquare {

    public static void perfsquare(int n) {
        int[] dp = new int[n + 1]; // starts your array to find your perfect squares
        dp[0] = 0; // sets dp[0] to 0
        for(int i = 1; i <= n; i++){
            int min = Integer.MAX_VALUE;
            int j = 1;
            while(i - j * j >= 0){ 
                min = Math.min(dp[i - j * j] + 1, min); //get the minimum value of the index
                j++;// increase j + 1
            }
            dp[i] = min; // set dp[] a i  = to min
        }
        System.out.println(dp[n]); // print out the value of dp[] at n
    }

    public static void main(String[] args) {
        int n = 12;
        perfsquare(n);
    }
}
