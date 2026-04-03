// Problem : Geeks for Geeks 
// Link : https://www.geeksforgeeks.org/batch/dsa-at-your-own-pace/track/DSASP-Arrays/problem/equilibrium-point-1587115620

//Time complexity : O(n)
// Space complexity : O(1)

class Solution { 
public static int findEquilibrium(int arr[]) {
  int n = arr.length;
  int res = 0 ;
  for(int i=0; i<n; i++){
    res += arr[i];
  }
  int ls = 0;
  for(int i=0; i<n; i++){
    res -= arr[i];
    if(ls==res){
      return i;
    } else {
      ls += arr[i];
    }
  }
  return -1;
}
}
    
