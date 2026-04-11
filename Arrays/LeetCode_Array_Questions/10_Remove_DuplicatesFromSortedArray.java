// Problem : 10. Remove Duplicates From Sorted Array
// Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=problem-list-v2&envId=array
// Difficulty : Medium

// Approach : Approach: Two Pointers (In-place)
// Time complexicty : O(n)
// Space complexity : O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        // k represents the position where the next valid element will be placed
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
             // Condition explanation:
            // 1. If k < 2 → we can always take first two elements
            // 2. If current element is NOT equal to nums[k-2]
            //    → ensures we allow at most 2 duplicates
            if (k < 2 || nums[i] != nums[k - 2]) {
                // Place current element at position k
                nums[k] = nums[i];
                // Move k forward
                k++;
            }
            // Else case (implicitly skipped):
            // If nums[i] == nums[k-2], we skip it
            // because we already have 2 occurrences
        }
         // k is the new length of the array with valid elements
        return k;
    }
}
