# Sliding Window Pattern

## When to use
- Subarray problems
- Maximum sum subarray
- Minimum length subarray
- Longest substring problems

## Algorithm 
1. Initialize two pointers:
   - Start = 0
   - end = 0
2. Expand the window :
   - Move end pointer forward
   - Add current element to window
3. Check condition:
   - If condition satifisfied --> update answer
   - If condition breaks --> shrink window
4. Shrink window:
   - Remove start element
   - Move start pointer forward
5. Repeat until end reaches array size.

## Time complexity : O(n)
## Space complexity : O(1)

## Top Interview Questions 
- Maxixmum Subarray
- Longest Substring Without Repeating Character
- Minimum Window Substring
- Subarray Sum Equals K
- Maximum Sum Subarray of Size K
