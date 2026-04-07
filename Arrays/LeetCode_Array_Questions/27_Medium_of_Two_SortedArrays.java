// Problem : 04. Medium of two sorted Arrays
// Link : https://leetcode.com/problems/median-of-two-sorted-arrays/description/?envType=problem-list-v2&envId=array
// Difficulty : Hard;

// Approach : Merge + Binary Search
// Time complexity : O(log(m+n))
// Space complexity : O(1)

class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    // Length of both arrays
    int m = nums1.length;
    int n = nums2.length;
    // Pointers of both arrays
    int i=0;
    int j=0;
    // Total length after merge
    int total = m+n;
    // Median indices
    int medIndex2 = total/2;
    int medIndex1 = medIndex2-1;
    // Counter for merged position
    int mergeIdxCounter = 0;
    // Store median elements
    int medElement1 = 0;
    int medElement2 = 0;
    // Merge both arrays until one finishes
    while(i<m && j<n) {
          // Pick smaller element  
          if(nums1[i] <= nums2[j]){
              // Store first median 
              if(mergeIdxCounter == medIndex1)
                    medElement1 = nums1[i];
                // Store second median
                if(mergeIdxCounter == medIndex2)
                    medElement2 = nums1[i];

                    mergeIdxCounter++;
                    i++;
            }  else {
               // Store first median
                if(mergeIdxCounter == medIndex1)
                   medElement1 = nums2[j];
                // Store second median
                if(mergeIdxCounter == medIndex2)
                   medElement2 = nums2[j];

                mergeIdxCounter++;
                j++;
            }
        }
        // Process remaining elements of nums1
        while(i<m) {
            if(mergeIdxCounter == medIndex1)
               medElement1 = nums1[i];

            if(mergeIdxCounter == medIndex2)
               medElement2 = nums1[i];

            mergeIdxCounter++;
            i++;
        }
        // Process remaining elements of nums2
        while(j<n) {
            if(mergeIdxCounter == medIndex1)
               medElement1 = nums2[j];

            if(mergeIdxCounter == medIndex2)
              medElement2 = nums2[j];

            mergeIdxCounter++;
            j++;
        }
         // If odd length return middle element
        if(total % 2 == 1){
            return medElement2;
        }
        // If even length return average
        return (double) (medElement1 + medElement2)/2.0;
    }
}
