class Solution {
    public int maxOperations(int[] nums, int k) {
       int n = nums.length;
       int l =0;
       int r = n-1;
       Arrays.sort(nums);
       int count =0;
       while(l<r) {
        int sum = nums[l] + nums[r];
        if(sum == k){
            count++;
            l++;
            r--;
        }
        else if(sum<k) {
            l++;
        }
        else {
            r--;
        }
       }
       return count;
    }
}