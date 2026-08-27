class Solution {
    public int maxProfit(int[] price) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        
         for(int i =0 ; i <price.length; i++) {
            if(buyprice < price[i]) { 
                int profit = price[i] - buyprice;
              maxprofit =  Math.max(maxprofit, profit);
            }
            else {
                buyprice = price[i];
                }  
         } 
         return maxprofit;    
            
    }
    
} 
