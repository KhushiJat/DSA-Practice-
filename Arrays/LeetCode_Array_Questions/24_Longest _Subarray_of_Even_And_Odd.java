// Problem : Longest Subarray Of Evens And Odds (Geeks for Geeks)
// Link : https://www.geeksforgeeks.org/batch/dsa-at-your-own-pace/track/DSASP-Arrays/problem/longest-subarray-of-evens-and-odds
// Difficulty : Medium

// Approach : (use sliding window idea)
// - Traverse the array from left to right.
// - Compare each element with its previous element.
// - If one is even and the other is odd, increase the current length.
// - Otherwise, reset the current length to 1.
// - Keep track of the maximum length found.

// Time complexity : O(n)
// Space complexity : O(1)

class Solution {
  public static int maxEvenOdd(int arr[]) {
    int count = 1;
        int maxlen = 1;
        for(int i=1; i<arr.length; i++){
        if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
            count++;
        } 
        else {
            count =1;
        }
        maxlen = Math.max(maxlen,count);
        }
        return maxlen;
        
    }
}
