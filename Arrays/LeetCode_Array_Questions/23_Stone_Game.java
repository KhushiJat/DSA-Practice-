// problem : 877. Stone Game
// Link : https://leetcode.com/problems/stone-game/description/?envType=problem-list-v2&envId=array
// Difficulty : Medium

// Approach : Dynamic + Recursive
// Time complexity : O(n^2)
// Space complexity : O(n^2)   { Optimize O(n) by using DP }

class Solution {
  public boolean stoneGame(int[] piles) {
        int n = piles.length;
        // dp[i][j] will store max score difference Alice can get from subarray piles[i..j]
        int[][] dp = new int[n][n];
        // Initialize with a value that means "not calculated"
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        // If Alice can get a positive score difference, she wins
        return helper(piles, 0, n - 1, dp) > 0;
    }

    private int helper(int[] piles, int i, int j, int[][] dp){
        if(i > j) return 0; // no piles left
        if(dp[i][j] != Integer.MIN_VALUE) return dp[i][j]; // already computed

        // pick the left pile
        int pickLeft = piles[i] - helper(piles, i + 1, j, dp);
        // pick the right pile
        int pickRight = piles[j] - helper(piles, i, j - 1, dp);

        dp[i][j] = Math.max(pickLeft, pickRight);
        return dp[i][j];
    }
}
