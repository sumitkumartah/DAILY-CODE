class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int i = 0; i < n; i++)
            total += nums[i];

        if (total % 2 == 1) {
            return false;
        } else {
            int k = total / 2;
            boolean dp[][] = new boolean[n][k + 1];
            for (boolean row[] : dp) {
                Arrays.fill(row, false);
            }
            return solve(n , k, nums, dp);
        }

    }

    public static boolean solve(int n, int tar, int arr[], boolean dp[][]) {
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        if (arr[0] <= tar) {
            dp[0][arr[0]] = true;
        }
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <=tar; k++) {

                // exclude
                boolean nottake = dp[i-1][k];
                // include
                boolean take = false;
                if (arr[i] <= k) {
                    take =  dp[i-1][k-arr[i]];
                }
              dp[i][k] = take || nottake;
            }
        }
        return dp[n-1][tar];

    }
}