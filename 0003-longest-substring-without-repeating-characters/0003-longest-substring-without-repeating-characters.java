class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        int  max = 0;
        boolean[] nums = new boolean[256];
        for(int r=0;r<s.length();r++) {
            int index =(int)s.charAt(r);
            if(nums[index]) {
                while(nums[index]) {
                nums[(int)s.charAt(l)]= false;
                l++;
            }
        }
           
          nums[index] = true;
            max = Math.max(max,r-l+1); 
        
        }
        
        return max;
    }
}