// Problem : Rearrange Array Alternatily (Geeks For Geeeks)
// Link : https://www.geeksforgeeks.org/batch/dsa-at-your-own-pace/track/DSASP-Arrays/problem/-rearrange-array-alternately-1587115620
// Difficulty : Medium

// Approach : 
// 1.Sorting Approach
// - Sort the array to easily access min and max elements.
// 2. Two Pointer Technique
// - Use minIdx and maxIdx to pick elements alternately.
// 3. In-Place Rearrangement
 // - Modify the array without using extra space.
// 4. Mathematical Encoding (Modulus Technique)
// 5. Store two values in one index using:
// -arr[i] = old + new * max

//   Steps :
// - Sort the array.
// - Use two pointers: minIdx = 0, maxIdx = n-1.
// - Take max = arr[n-1] + 1 (greater than all elements).
// - Traverse array:
//   Even index → insert max element
//  Odd index → insert min element
// - Encode values:
// arr[i] += (selected % max) * max
// - Decode values:
// arr[i] = arr[i] / max

// Time complexity : O(n log n)
// Space complexity : O(1)

class Solution {
  public void rearrange(int arr[]) {
    int n = arr.length;
    Arrays.sort(arr);
    // Max Element
    int max = arr[n-1] + 1;
    // Min and max index
    int minIdx = 0, maxIdx = n-1;
    for(int i=0; i<n; i++){
      if(i % 2 == 0) {
        // Even index → place maximum element
        // Store it using encoding
        arr[i] += (arr[maxIdx] % max) * max;
        maxIdx--;
      } else {
        // Odd index → place minimum element
        // Store it using encoding
        arr[i] += (arr[minIdx] % max) * max;
        minIdx++;
      }
    }
    // Decode to get final rearranged value
    for(int i=0; i<n; i++){
      arr[i] = arr[i]/max;
    }
  }
    
