// Problem : 18. Maximum Subarray
// Link : https://leetcode.com/problems/maximum-subarray/submissions/1965401734/?envType=problem-list-v2&envId=array
// Difficulty : Medium

// Approach : Kadane Algorithm
// Time complexity : O(n)
// Space complexity : O(1)

class Solution {
  public int maxSubArray(int[] nums) {
    int n = nums.length;
    int currSum = nums[0];
    int maxSum = nums[0];

   for(int i=1; i<n; i++){
     currSum = Math.max(currSum + nums[i] , nums[i]);
     maxSum = Math.max(maxSum , currSum);
   }
   return maxSum;
  }
}
