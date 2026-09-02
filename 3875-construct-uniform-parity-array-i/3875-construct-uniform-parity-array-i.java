class Solution {
    public boolean uniformArray(int[] nums1) {
        for(int i =0;i<nums1.length;i++) {
            if(nums1[i] % 2 !=1 || nums1[i] % 2 != 0) {
                return true;
            }
        }
        return false;
        
    }
}