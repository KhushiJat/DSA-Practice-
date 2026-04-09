// Problem : Array Leaders (Geeks for Geeks)
// Link : https://www.geeksforgeeks.org/batch/dsa-at-your-own-pace/track/DSASP-Arrays/problem/leaders-in-an-array-1587115620
// Difficulty : Easy

// Approach : 
// - Traverse the array from right to left.
// - Keep track of the maximum element seen so far.
// - If current element ≥ max → it is a leader.
// - Update the max accordingly.

// Time complexity : O(n)
// Space complexity : O(1)

class Solution {
  static ArrayList<Integer> leaders(int arr[]) {
    int n = arr.length;
    ArrayList<Integer> res = new ArrayList<>();

  // Last element is always Leader
  int max = arr[n-1];
    res.add(max);
  // Traverse from right to left
  for(int i=n-2; i>=0; i--){
    if(arr[i]>max){
      res.add(arr[i]; // current element is leader
      max = arr[i]; // updated max
    }
  }
  // Reverse to maintain original order
   Collections.reverse(res);
    return res;
    }
}
