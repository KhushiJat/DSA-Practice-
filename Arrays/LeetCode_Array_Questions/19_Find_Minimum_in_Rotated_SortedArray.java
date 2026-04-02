// Problem : 153. Find Minimum in Rotated Sorted Array
// Link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/?envType=problem-list-v2&envId=array
// Approach : Binary Search

// Time Complexity : O(log(n))
// Space complexity : O(1)

class Solution {
  public int findMin(int[] nums) {
    int n = nums.length;
    int left = 0;
    int right = n-1;

  while(left < right){
    int mid = left + (right - left)/2;

    // Case 1: Minimum is in right half
    if(nums[mid]>nums[right]){
      left = mid+1;
    } 
      // Case 2: Minimum is in left half including mid
    else {
      right = mid;
    }
  }
  return nums[left];
  }
}

    
