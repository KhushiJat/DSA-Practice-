// Problem : 9. Move Zeroes
// Link : https://leetcode.com/problems/move-zeroes/description/?envType=problem-list-v2&envId=array
// Difficulty : Easy

// Approach : Two Pointer (count pointer)
// Time complexity : O(n)
// Space complexity : O(1)

class Solution {
  public void moveZeroes(int[] nums){
    int count = 0;
    for(int i=0; i<nums.length; i++){
      if(nums[i]!=0){
        int temp = nums[i];
        nums[i] = nums[count];
        nums[count] = temp;
        count++;
      }
    }
  }
}
