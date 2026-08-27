class Solution {
    public int sumOfUnique(int[] nums) {
        int n =nums.length;
        int[] ans = new int[101];
        for(int num : nums) {
            ans[num]++;

        }
        int sum =0;
        for(int j =0;j< 101;j++) {
            if( ans[j] ==1){
                sum +=j;
            }

        }
        return sum;
        
    }
}