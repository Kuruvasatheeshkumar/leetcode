class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      
        if(nums == null || nums.length <2 || k ==0)
            return false;
            int i =0;
        
       HashSet<Integer> map = new HashSet<Integer>();
        for(int j =0;j<nums.length;j++) {
            if(!map.add(nums[j])) {
                return true;
            }
            if(map.size()>= k+1) {
                map.remove(nums[i++]);
            }   
        }
        return false;
    }
}