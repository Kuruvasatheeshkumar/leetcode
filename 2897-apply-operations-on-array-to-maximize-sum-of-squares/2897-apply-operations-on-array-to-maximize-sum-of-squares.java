class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] count = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    count[i]++;
                }
            }
        }
        
        long MOD = 1_000_000_007;
        long totalSumOfSquares = 0;
        
        for (int i = 0; i < k; i++) {
            long curr = 0;
            for (int bit = 31; bit >= 0; bit--) {
                if (count[bit] > 0) {
                    curr|= (1L << bit);
                    count[bit]--;
                }
            }
            totalSumOfSquares = (totalSumOfSquares + (curr * curr) % MOD) % MOD;
        }
        
        return (int) totalSumOfSquares;
    }
}