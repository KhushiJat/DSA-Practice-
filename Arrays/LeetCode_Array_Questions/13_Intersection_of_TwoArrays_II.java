// Problem : 13. Intersection Of Two Arrays II
// Link : https://leetcode.com/problems/intersection-of-two-arrays-ii/?envType=problem-list-v2&envId=array
// Difficulty : Easy to medium

// Approach : HashMap
// Time complexicty = O(n1 + n2)
// Space complexity = O(n1 + min(n1,n2))

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Step 1: count occurrences of elements in nums1
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: find intersection with nums2
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                map.put(num, map.get(num) - 1); // decrement count
            }
        }

        // Step 3: convert ArrayList to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
