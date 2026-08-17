class Solution {
    public int[] runningSum(int[] nums) {
       int[] n = new int[nums.length];
       n[0] = nums[0];
       for(int i=1;i<nums.length;i++) {
        n[i]= n[i-1]+nums[i];

       }
       return n;   
    }
}