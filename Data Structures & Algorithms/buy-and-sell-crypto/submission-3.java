class Solution {
    public int maxProfit(int[] p) {
        int maxProfit = 0;
        for(int i = 0; i<p.length - 1; i++){
            for(int j = i+1; j< p.length ; j++){
                int profit = p[j] - p[i];
                maxProfit = Math.max(profit, maxProfit);
            }
        }

        return maxProfit;
    }
}
