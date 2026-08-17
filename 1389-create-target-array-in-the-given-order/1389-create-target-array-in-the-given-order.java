class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       int n = nums.length;
       ArrayList<Integer> tl = new ArrayList<>();
       for(int i =0;i<n;i++) {
    tl.add(index[i],nums[i]);
       }
       int[] target = new int[ n] ;
       for(int i =0;i<n;i++) {
        target[i] = tl.get(i);
       }
       return target;
    }

}