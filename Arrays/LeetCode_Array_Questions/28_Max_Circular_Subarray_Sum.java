// Problem : Max Circular Subarray Sum array(Greeks for Geeks)
// Link : https://www.geeksforgeeks.org/batch/dsa-at-your-own-pace/track/DSASP-Arrays/problem/max-circular-subarray-sum-1587115620
// Difficulty : Hard

// Appraoch : The maximum circular subarray sum is the maximum of:
// - Normal subarray sum (Kadane)
// - Total sum - minimum subarray sum
// Time complexity : O(n)
// Space complexity :O(1)

class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int num:arr){
            sum +=num;
        }
        int minSum = kadaneMinSum(arr);
        int maxSum = kadaneMaxSum(arr);
        int circularSum = sum-minSum;
        if(maxSum>0){
            return Math.max(maxSum, circularSum);
        }
        return maxSum;
    }
    int kadaneMaxSum(int arr[]){
        int n = arr.length;
        int maxEle = arr[0];
        int res1 = arr[0];
        for(int i=1; i<n; i++){
            maxEle = Math.max(maxEle+arr[i], arr[i]);
            res1 = Math.max(maxEle, res1);
        }
        return res1;
    }
    int kadaneMinSum(int arr[]){
        int n = arr.length;
        int minEle = arr[0];
        int res2 = arr[0];
        for(int i=1; i<n; i++){
            minEle = Math.min(minEle+arr[i], arr[i]);
            res2 = Math.min(minEle, res2);
        }
        return res2;
    }
}
