class Solution {
    public int maxProduct(int[] nums) {
        int min=nums[0] ;
        int max =nums[0];
        int ans =nums[0];
        for(int i =1;i<nums.length;i++) {
            if(nums[i]< 0) {
            int temp = max;
            max= min;
            min = temp;

            }
           
         max = Math.max(nums[i], max *  nums[i] );
         min = Math.min(nums[i], min * nums[i]);
        
        ans = Math.max(ans, max);
        }
        return ans;
        

        
    }
}