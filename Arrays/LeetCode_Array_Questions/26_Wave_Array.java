// Problem : Wave Array (Geeks for Geeks)
// Link : https://www.geeksforgeeks.org/batch/dsa-at-your-own-pace/track/DSASP-Arrays/problem/wave-array-1587115621
// Difficulty : Medium

//Approach : Swap adjacent elements
// Time complexity : O(n)
// Space Complexity = O(1)

class Solution {
  public void sortInWave(int arr[]){
    int n = arr.length;
    for(int i=1; i<n; i+=2){
      int temp = arr[i];
      arr[i] = arr[i-1];
      arr[i-1] = temp;
    }

  }
}
