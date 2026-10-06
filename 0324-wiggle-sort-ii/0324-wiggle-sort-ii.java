class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        for(int i =0;i<n;i++) {
            temp[i] = nums[i];
        }
        Arrays.sort(temp);
        int l = (n-1)/2;
        int r = n-1;
        for(int i =0;i<n ;i+=2) {
            nums[i] = temp[l];
            l--;
        }
        for(int i =1;i<n;i+=2) {
            nums[i] = temp[r];
            r--;

        }
        
    }
}