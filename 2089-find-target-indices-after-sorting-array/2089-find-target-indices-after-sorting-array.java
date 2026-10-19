class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int c = 0;
        int t = 0;
        for(int num : nums) {
            if(num < target) {
            c++;
        }
        else if(num == target) {
            t++;
        }
        
    }
    List<Integer> result = new ArrayList<>();
    for(int i =0;i<t;i++) {
        result.add(c+i);

    }
    return result;
}
}