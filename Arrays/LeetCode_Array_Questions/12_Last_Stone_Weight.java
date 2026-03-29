// Problem : 12. Last Stone Weight
// Link : https://leetcode.com/problems/last-stone-weight/?envType=problem-list-v2&envId=array

// Approach : Approach: Repeatedly find the largest and second largest elements and simulate the smashing process in-place.

// Time Complexity: O(n²), {we optimize it by using Max Heap (Priority Queue) , TC --> O(nlogn) }
// Space Complexity: O(1), as no extra space is used.

class Solution{
  public int lastStoneWeight(int[] stones) {

    while (true) {
    int maxVal = 0, secondMaxVal = 0;
    int maxIdx = -1, secondIdx = -1;

      //Find max and second max
  for(int i=0; i<stones.length; i++){
    if(stones[i]>maxVal){
      secondMaxVal = maxVal;
      secondIdx = maxIdx;
      maxVal = stones[i];
      maxIdx = i;
    } else if(stones[i]>secondMaxVal && stones[i]<= maxVl){
      secondMaxVal = stones[i];
      secondIdx = i;
    }
  }
    //Stop all stones are destroyed
  if(maxVal==0) return 0;

    // Smash stones
    if(secondMaxVal==0) return maxVal;  // only one stone left

    if(maxVal==secondMaxVal){
      stones[maxIdx] = 0;
      stones[secondIdx] = 0;
    } else {
       stones[maxIdx] = maxVal - secondVal;
       stones[secondIdx] = 0;
    }

    }
  }
}
      
