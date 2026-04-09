// Problem : Maximum Index Difference (Geeks For Geeks)
// Link : https://www.geeksforgeeks.org/batch/dsa-at-your-own-pace/track/DSASP-Arrays/problem/maximum-index-1587115620
// Difficulty : Medium

// Approach : 
// Use prefix min + suffix max + two pointers to find maximum j - i efficiently.
// Steps:
// Step 1: Initialize arrays
// Create two arrays:
// - lmax[] → stores minimum from left
// - rmax[] → stores maximum from right
// Step 2: Fill lmax[] (Prefix Minimum)
// lmax[0] = arr[0]
// For each index:
// - lmax[i] = min(arr[i], lmax[i-1])
// Step 3: Fill rmax[] (Suffix Maximum)
// rmax[n-1] = arr[n-1]
// For each index:
// - rmax[j] = max(arr[j], rmax[j+1])
// Step 4: Apply Two Pointer Technique
// Initialize:
// - i = 0, j = 0
// - maxDiff = -1
// Step 5: Traverse arrays
// - While i < n and j < n:
// - If lmax[i] <= rmax[j]:
// - Valid pair found
// Update:
// - maxDiff = max(maxDiff, j - i)
// - Move j++ (increase distance)
// Else:
// - Move i++ (need smaller left value)
// Step 6: Return result
// Return maxDiff 

// Time complexity : O(n)
// Space complexity : O(n)

class Solution {
  int maxIndexDiff(int[] arr) {
    int n = arr.length;
    // // Step 1: Create arrays for prefix min and suffix max
    int lmax[] = new int[n];
    int rmax[] = new int[n];
    //  Step 2: Fill lmax[] (prefix minimum)
    lmax[0] = arr[0];
    for(int i=1; i<n; i++){
      lmax[i] = Math.min(arr[i], lmax[i-1]);
    }
    //  Step 3: Fill rmax[] (suffix maximum)
    rmax[n-1] = arr[n-1];
    for(int j=n-2; j>=0; j--){
      rmax[j] = Math.max(arr[j], rmax[j+1]);
    }
    // Step 4: Use two pointers to find maximum j - i
    int i=0, j=0;
    int maxDiff = -1;
    while(i<n && j<n) {
      if(lmax[i]<=rmax[j]){
        // // update maximum difference
        maxDiff = Math.max(maxDiff, j-i);
        j++;
      } else {
        i++;
      }
    }
    // return res
    return maxDiff;
  }
}
