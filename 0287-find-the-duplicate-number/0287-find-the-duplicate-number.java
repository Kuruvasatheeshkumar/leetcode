class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i =0;i<n;i++) {
            int ans = Math.abs(nums[i]);
            if(nums[ans] <0) {
                return ans;
            }

                nums[ans] = - nums[ans];
            
        }
        return -1;

    }
}