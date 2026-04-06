// Problem : Maximum occured Integer (Geeks for Geeks)
// Link : https://www.geeksforgeeks.org/batch/dsa-at-your-own-pace/track/DSASP-Arrays/problem/maximum-occured-integer4602
// Difficulty : Medium

// Approach : Prefix Sum + Difference Array
// Time complexity :  O(N + maxR)
// Space Complexity = O(maxR)

class Solution {
    public int maxOccured(int[] L, int[] R) {

        int maxR = 0;
        for (int r : R) {
            maxR = Math.max(maxR, r);
        }

        int[] freq = new int[maxR + 2];

        // Difference array
        for (int i = 0; i < L.length; i++) {
            freq[L[i]]++;
            freq[R[i] + 1]--;
        }

        int maxFreq = 0;
        int result = 0;

        // Prefix sum
        for (int i = 1; i <= maxR; i++) {
            freq[i] += freq[i - 1];

            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = i;
            }
        }

        return result;
    }
}
