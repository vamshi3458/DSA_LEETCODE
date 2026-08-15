class Solution {
    public int maxProfit(int[] prices) {
        int mini=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            mini = Math.min(mini,prices[i]);
            maxprofit=Math.max(maxprofit,prices[i]-mini);
        }

        return maxprofit;
    }
}