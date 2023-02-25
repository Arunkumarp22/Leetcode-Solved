class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],max=0;
        
        for(int i=1;i<prices.length;i++){
            min=Math.min(prices[i],min);
            max=Math.max(prices[i]-min,max);
        }
        
        return max;
    }
}