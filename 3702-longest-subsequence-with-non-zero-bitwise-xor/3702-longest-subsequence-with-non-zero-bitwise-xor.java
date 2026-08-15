class Solution {
    public int longestSubsequence(int[] nums) {
        int xor =0;
        int count = 0;
        for(int x : nums){
            xor = xor^x;
            if(x !=0){
                count++;
            }
        }
        if(xor!=0) {
        return nums.length;
        }
        else if(count>0){
            return nums.length-1;

        }
        return 0;

        
    }
}