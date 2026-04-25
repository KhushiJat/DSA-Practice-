// Problem : 268. Missing Number
// Link : https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=array
// Difficulty : Easy

// Approach : XOR - optimal 
// Time complexity : O(n)
// Space complexity : O(1)

class Solution {
    int missingNum(int arr[]) {
        // code here
       int n = arr.length + 1;
       int xor = 0;

       for(int i = 1; i <= n; i++){
       xor ^= i;
       }

      for(int num : arr){
      xor ^= num;
      }
      return xor;
    }
}
