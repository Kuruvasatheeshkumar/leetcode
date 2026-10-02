class Solution {
    public int maxProfit(int[] prices) {
       int a = Integer.MIN_VALUE;
       int ans = 0;
       int b = Integer.MIN_VALUE;
       int res = 0;
       for(int price : prices) {
        a = Math.max(a, - price);
        ans  = Math.max(ans, a + price);

        b = Math.max(b, ans - price);
        res = Math.max(res, b + price);
       }
       return res;
    }
}