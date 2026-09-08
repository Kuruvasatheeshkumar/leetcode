class Solution {
    public int removeDuplicates(int[] nums) {
      int l =0;
      for(int r =0;r<nums.length;r++) {
        if(l<2 || nums[r] != nums[l-2]){
            nums[l] = nums[r];
             l++;


         }
        }
        return l;
        
    }
}