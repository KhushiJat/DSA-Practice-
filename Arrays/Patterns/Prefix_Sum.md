# Prefix_Sum 

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
