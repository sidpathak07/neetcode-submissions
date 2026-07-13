class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        int i = 1;
        while(i<prices.length){
            if(min>prices[i]){
                min = prices[i];
            }
            if(prices[i]>min){
                if((prices[i]-min)>max) max = prices[i]-min;
            }
            i++;
        }
        return max;
    }
}
