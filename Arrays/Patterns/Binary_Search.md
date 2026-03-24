# Binary Search
Binary search is an algorithm used to find an element in a **Sorted array** efficiently

# Use :
- Array is sorted
- Need fast searching
- Need first or last occurence
- Need search optimization
- Search space is monotonic

  # Time Complexity : O(n log n)
  # Space Complexity : O(1)

# Algorithm :
Step 1 : Initialize :
         start = 0
         end = n-1
Step 2 : find middle :
        mid = (start + end)/2
Step 3 : Compare :
- If arr[mid] == target --> return index
- If arr[mid] < target --> start = mid+1
- If arr[mid] > target --> end = mid-1
Step 4 : Repeated until start >end.
Step 5 : If not found return -1.

# Top Interview Questions :
- Binary search
- Search in Rotated sorted array
- Find first and last positon
- Square root using binary search
  
