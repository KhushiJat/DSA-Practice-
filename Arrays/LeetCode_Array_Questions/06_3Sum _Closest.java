// Problem : 6. 3Sum Closest
// Link : https://leetcode.com/problems/3sum-closest/submissions/1960463148/?envType=problem-list-v2&envId=array
// Difficulty : Medium
// Approach : Sorting + Two Pointer

// Time Complexity : O(n^2)
// Space Complexity : O(1)

class Solution {
  public int threeSumClosest(int[] nums, int target){
    Arrays.sort(nums);
    int closestSum = nums[0]+nums[1]+nums[2];
    for(int i=0; i<nums.length-2; i++){
      int left = i+1;
      int right = nums.length-1;
      // Two pointer
      while(left<right){
        int sum = nums[i]+nums[left]+nums[right];
        //Update closestSum
        if(Math.abs(target-sum)<Math.abs(target-closestSum)){
          closestSum = sum;
        }
       // Move target
        if(sum<target){
          left++;
        } else if(sum>target){
          right--;
        } else {
          return sum;
        }
      }
    }
    return closestSum;
  }
}
        
