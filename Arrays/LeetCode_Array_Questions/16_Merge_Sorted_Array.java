// Problem : 16. Merge Sorted Arrays
// Link : https://leetcode.com/problems/merge-sorted-array/?envType=problem-list-v2&envId=array
// Difficulty : Easy

// Approach : Merge sort
// Time complexity : O(m+n)
// Space complexity : O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;      // last element in nums1
        int j = n - 1;      // last element in nums2
        int k = m + n - 1;  // last position in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // copy remaining nums2
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
