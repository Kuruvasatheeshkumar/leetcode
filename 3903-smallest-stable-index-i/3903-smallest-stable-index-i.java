class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] minsuff = new int[n];
        minsuff[n -1] = nums[n-1];
        for(int i =n-2;i>=0;i--) {
            minsuff[i] = Math.min(nums[i], minsuff[i+1]);
        }
        int curr = Integer.MIN_VALUE;
        for(int i= 0;i<n ;i++) {
            curr = Math.max(curr, nums[i]);
            if(curr - minsuff[i] <= k) {
                return i;
            }
        }
        return -1;
        
    }
}