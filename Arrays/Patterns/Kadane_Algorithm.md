# Kadane Algorithm 
kadane's Algorithm is used to find the  "Maximum sum of a continous subarray" in an array.

## Use :
- Maximum subarray sum
- Largest contiguous sum
- Continuous sum optimization
- Profit maximization problems

# Algorithm 
Step 1 : Initialize two variables:
          currentSum = arr[0]
          maxSum = arr[0]
Step 2 : Traverse the array from index 1.
Step 3 : For every element update currentSum :
         currentSum = max(arr[i], currentSum + arr[i])
Step 4 : Update maximum sum :
         maxSum = max(maxSum, currentSum)
Step 5 : Continue until end of subarray.
Step 6 : Return maxSum

# Time Complexicty : O(n)
# Space Complexicty : O(1)

# Top Interview Questions
1. Maximum Subarray
2. Maximum Product Subarray
3. Best Time to Buy and Sell Stock
4. Maximum Sum Circular subarray

