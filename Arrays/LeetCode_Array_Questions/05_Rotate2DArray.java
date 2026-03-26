// Problem : 5. Rotate2DMatrix
// Link : https://leetcode.com/problems/rotate-image/?envType=problem-list-v2&envId=array

// Approach :
//The matrix is rotated by 90 degrees using the Transpose and Reverse technique.
//1. First, take the transpose of the matrix (convert rows into columns).
//2. Then:
//  - For clockwise rotation → reverse each row.
//  - For anticlockwise rotation → reverse each column.
// This approach works in-place and does not require extra space.

// Difficulty : Medium

// Time complexity : O(n^2)
// Space Complexity : O(1)

class Solution{
  public void rotate(int[][] matrix){
    int n = matrix.length;
    // Transpose
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    // Reverse each row
  for(int i=0; i<row.length; i++){
    reverse(matrix[i]);
  }
  }
  // Reverse 
public void reverse(int row[]){
 int left = 0, right= row.length-1;
  while(left<right){
    int temp = row[left];
    row[left] = row[right];
    row[right] = temp;
    left++;
    right--;
  }
}
}
