# Prefix_Sum : A prefix sum array stores cumulative sums:

prefix[i]=a[0]+a[1]+a[2]+⋯+a[i]
** Example
Given array:
arr = [2, 4, 1, 3, 5]
Prefix sum array:
prefix = [2, 6, 7, 10, 15]
How?
prefix[0] = 2
prefix[1] = 2 + 4 = 6
prefix[2] = 6 + 1 = 7
prefix[3] = 7 + 3 = 10
prefix[4] = 10 + 5 = 15

# When Use :
- Subarray sum
- Range sum queries
- Continuous sum
- Cumulative calculations
- Number of subarrays

  ## Algorithm
  Step 1: Create a prefix array of same size as original array.
  Step 2: Initialize first element :
   prefix[0] = arr[0]
  Step 3: Traverse array from index 1.
  Step 4: Store cumulative sum:
      prefix[i] = prefix[i-1] + arr[i]
  Step 5: To find sum between index L and R:
  If L = 0:
   sum = prefix[R]
  Else :
  sum = prefix[R] - prefix[L-1]

  ## Time Complexity : O(n)
  ## Space Complexity : O(n)

  ## Top Interview Questions :
  - Subarray sSum Eqauls K
  - Product of Array except self
  - Range sum query
  - Equilibrium subarray sum
