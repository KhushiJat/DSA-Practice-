// Problem : 268. Missing Number
// Link : https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=array
// Difficulty : Easy

// Approach : XOR - optimal 
// Time complexity : O(n)
// Space complexity : O(1)

class Solution {
  public int missingNumber(int[] nums) {
    int n = nums.length;
    int xor = n;

  for(int i=0; i<n; i++){
    xor ^= i^ nums[i];
  }
  return xor;
  }
}
