// Problem : 10. Majority Element
// Link : https://leetcode.com/problems/majority-element/?envType=problem-list-v2&envId=array

// Approach : Boyer–Moore Voting Algorithm
// If an element appears more than n/2 times, it cannot be canceled out by all other elements combined.

// Time complexity : O(n)
// Space complexity : O(1)

class Solution {
  public int majorityElement(int[] nums) {
    int count = 0;
    int candidate = 0;
    for(int i=0; i<nus.length; i++){
      if(count==0){
        candidate = nums[i];
        count++;
      } else if(nums[i]==candidate){
        count++;
      } else {
        count--;
      }
    }
    // Recheck
    count = 0;
    for(int i=0; i<nums.length; i++){
      if(nums[i]==candidate){
        count++;
      }
    }
    if(count>nums.length/2){
      return candidate;
    } else {
      return count;
    }
  }
}
