// Problem : Smallest Positive Missing Number(Geeks for Geeks)
// Link :https://www.geeksforgeeks.org/batch/dsa-at-your-own-pace/track/DSASP-Arrays/problem/smallest-positive-missing-number-1587115621
// Difficulty : Medium

//Approach : Cyclic sort
// Time complexity : O(n)
// Space complexity : O(1)

class Solution {
    public int missingNumber(int[] arr) {
        // code here
    int n = arr.length;
    for(int i=0; i<n; i++){
        while(arr[i]>0 && arr[i]<=n && arr[i]!=arr[arr[i]-1]){
            int temp = arr[i];
            arr[i] = arr[temp-1];
            arr[temp-1] = temp;
        }
    }
    for(int i=0; i<n; i++){
        if(arr[i]!=i+1){
            return i+1;
        }
    }
    return n+1;
    }
}
