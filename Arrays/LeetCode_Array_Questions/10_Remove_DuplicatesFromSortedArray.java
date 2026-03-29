// Problem : 10. Remove Duplicates From Sorted Array
// Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=problem-list-v2&envId=array
// Difficulty : Medium

// Approach : Approach: Two Pointers (In-place)
// Time complexicty : O(n)
// Space complexity : O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (k < 2 || nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
