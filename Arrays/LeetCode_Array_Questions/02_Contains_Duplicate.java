// Problem : 2 Contains Duplicate
// Link : https://leetcode.com/problems/contains-duplicate/description/?envType=problem-list-v2&envId=array
// Difficulity : EASY
// Approach : HashSet 

// Time Complexity : O(n)
// Space Complexity : O(n)

class Solution{
  public boolean duplicateContains(int nums[]){
    HashSet<Integer> h = new HashSet<>();
    for(int num : nums){
      if(h.contains(num)){
        return true;
      }
      h.add(num);
    }
    return false;
  }
}
