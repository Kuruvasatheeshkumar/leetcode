class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
       int count =0;
       for(int num : nums) {
        if(num == 0) {
            count = 0;
        }
        else {
            count++;
        }
       
        
        if(max < count) {
            max = count;
        }
       }
        return max;
        
    }
}