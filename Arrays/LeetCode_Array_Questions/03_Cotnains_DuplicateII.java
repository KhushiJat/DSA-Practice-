// Problem : 3. ContainsDuplicate -II
// Link : https://leetcode.com/problems/contains-duplicate-ii/description/?envType=problem-list-v2&envId=array
// Approach : HashMap

// Time complexity : O(n)
// Space complexity : O(n)

class Solution{
  public boolean containsNearbyDuplicate(int[] nums, int k){
    HashMap<Integer, Integer> m = new HashMap<>();
    for(int i=0; i<nums.length; i++){
      if(m.containsKey(nums[i])){
        int prevIdx = m.get(nums[i]);
        if(Math.abs(i-prevIdx)<=k){
          return true;
        }
      }
      m.put(nums[i],i);
    }
    return false;
  }
}
