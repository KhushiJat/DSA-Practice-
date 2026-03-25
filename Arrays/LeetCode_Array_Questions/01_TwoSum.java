// Problem : 1. Two Sum
// Link : https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array
// Difficulty : Easy
// Appraoach : 
// We use  HashMap to store visited numbers.
//Check complement before inserting.

//Time complexity : O(n)
//Space complexity : O(n)

// Code :
import java.util.HashMap;
class Solution {
  HashMap<Integer, Integer> m = new HashMap<>();
  public int[] twoSum(int[] nums, int target){
    for(int i=0; i<nums.length; i++){
      int sum = nums[i];
      if(m.containsKey(target-sum)){
        return new int[]{m.get(target-sum),i};
      }
      m.put(sum,i);
    }
    return new int[]{-1,-1};
  }
}
