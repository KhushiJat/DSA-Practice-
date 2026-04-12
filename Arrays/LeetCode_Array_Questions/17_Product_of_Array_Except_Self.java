// Problem : 17. Product of Array Except Self
// Link : https://leetcode.com/problems/product-of-array-except-self/submissions/1964784897/?envType=problem-list-v2&envId=array
// Difficulty : Medium

// Approach : Prefix Product + Suffix Product (Optimized Space) , (also called Left-Right Product technique)
// Time complexity : O(n)
// Space complexity : O(1)

class Solution {
  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int answer[] = new int[n];
    // Left side
    answer[0] = 1;
    for(int i=1; i<n; i++){
      answer[i] = answer[i-1] * nums[i-1];
    }
    // Right side
    int right = 1;
   for(int i=n-1; i>=0; i--){
     answer[i] = answer[i] * right;
     right *= nums[i];
   }
  return answer;
  }
}
