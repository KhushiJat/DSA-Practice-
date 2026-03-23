# Two Pointer Pattern

## When to use
- Sorted arrays
- Pair sum problems
- Reverse arrays
- Remove duplicates

  ## Algorithm
  int left = 0;
  int right = arr.length-1;
  while(left<right){
  if(condition){
  left++;
  } else {
  right--;
  }
  }
  
  # Time Complexity : O(n)
  # Space Complexity : O(1)
