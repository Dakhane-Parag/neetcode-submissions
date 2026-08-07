class Solution {
    public int maxProfit(int[] prices) {
        //Bruteforce solution 
        // int maxProfit = 0;
        // for(int i = 0; i<prices.length;i++){
        //     for(int j = i;j<prices.length;j++){
        //         if(prices[j]-prices[i]>0){
        //             maxProfit = Math.max(maxProfit,prices[j]-prices[i]);
        //         }
        //     }
        // }
        // return maxProfit;

        int l = 0;
        int maxProfit = 0;
        for(int r = 1;r<prices.length;r++){
            if(prices[l]>prices[r]){
                l = r;
            }
            if(prices[r] - prices[l] > 0){
                maxProfit = Math.max(maxProfit,prices[r] - prices[l]);
            }
        }
        return maxProfit;
    }
}
