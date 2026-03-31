// Problem : 15. Container with most water
// Link : https://leetcode.com/problems/container-with-most-water/submissions/1964750828/?envType=problem-list-v2&envId=array
// Difficulty : Medium

//Approach : Two Pointer
// Time complexiy = O(n)
// Space complexity = O(1)

class Solution {
  public int maxArea(int[] height) {
    int n = height.length;
    int left = 0;
    int right = n-1;
    int maxWater = 0;

    while(left<right){
      int h = Math.min(height[left], height[right]);
      int width = right-left;
      int area = h*width;

    maxWater = Math.max(maxWater, area);

     // Move smaller height
    if(height[left]<height[right]){
      left++;
    }  else {
      right--;
    }
    }
    return maxWater;
  }
}
