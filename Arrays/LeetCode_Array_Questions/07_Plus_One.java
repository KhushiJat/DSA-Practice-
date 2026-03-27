// Problem : 7. Plus One
// Link : https://leetcode.com/problems/plus-one/?envType=problem-list-v2&envId=array

// Difficulty : Easy
// Time complexity : O(n)
// Space complexity : O(1)

class Solution {
  public int[] plusOne(int[] digits){
    int n = digits.length;
    for(int i=n-1; i>=0; i--){
      //increament
    if(digits[i]<9){
      digits[i]++;
      return digits;
    }
    // Carry 0 when digits > 9
    digits[i]=0;
    }
    int res[] = new int[n+1];
    res[0] = 1;    // e.g. 999 = 1000
    return res;
  }
}
