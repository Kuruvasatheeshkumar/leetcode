class Solution {
    public int[] findErrorNums(int[] nums) {
        int  n = nums.length;
        int[] res  = new int [n+1];
        int[] ans  = new int[2];
        for(int i =0;i< n;i++) {
            res[nums[i]]++;
        }
        for(int i = 1;i<=n;i++) {
            if(res[i] ==2) {
                ans[0] = i;
            }
                if(res[i] == 0) {
                    ans[1] = i;
                
            }
    
        }
        return ans;
    
        
    }
}