// Problem : 228. Summary Ranges
// Link : https://leetcode.com/problems/summary-ranges/description/?envType=problem-list-v2&envId=array
// Difficulty : Easy

// Approach : 
// The problem asks us to group consecutive numbers in a sorted and unique array into ranges.
// We use a linear scan (O(n)) approach:
// Initialize a variable start to track the beginning of a range.
// Traverse the array from left to right.
// For each element, check:
// If the current number is not consecutive (nums[i] != nums[i-1] + 1)
// Or if we reached the end of the array
// When a break occurs:
// Let end = nums[i-1]
// If start == end, add "start"
// Else, add "start->end"
// Update start to begin a new range.

// Time complexity : O(n)
// Space complexity : O(1)

class Solution{
  public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();
        
        int n = nums.length;
        if (n == 0) return result;

        int start = nums[0];

        for (int i = 1; i <= n; i++) {

            // If range breaks OR we reach end
            if (i == n || nums[i] != nums[i - 1] + 1) {
                
                int end = nums[i - 1];

                // Single element
                if (start == end) {
                    result.add(String.valueOf(start));
                } 
                // Range
                else {
                    result.add(start + "->" + end);
                }

                // Start new range
                if (i < n) {
                    start = nums[i];
                }
            }
        }

        return result; 
    }
}
