class Solution {
    public int missingMultiple(int[] nums, int k) {
        int s = 1;
        Set<Integer> ans = new HashSet<>();
        for(int num : nums) {
            ans.add(num);
        }
        int m =  k;
        while(ans.contains(m)) {
            m += k;

        }
        return m;
        
    }
}