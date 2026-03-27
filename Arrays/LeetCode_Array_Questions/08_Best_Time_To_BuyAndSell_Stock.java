// Problem : 8. Best Time to Buy and Sell Stock
// Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=problem-list-v2&envId=array
// Idea : --> Buy at lowest Price
//          --> Sell at highest Price

// Difficulty : Easy
// Time complexity : O(n)
// Space complexity : O(1)

class Solution{
  public int maxProfit(int[] prices) {
    int n = prices.length;
    int minPrices = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i=0; i<n; i++){
      if(prices[i]<minPrices){
        minPrices = prices[i];     //Buy stock
      } else {
        int profit = prices[i]-minPrices;      // Sell stock
        maxProfit = Math.max(maxProfit,profit);
      }
    }
    return maxProfit;
  }
}
