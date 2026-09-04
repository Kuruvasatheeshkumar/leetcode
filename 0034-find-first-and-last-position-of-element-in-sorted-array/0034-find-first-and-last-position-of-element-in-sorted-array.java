class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            search(nums, target, true),
            search(nums, target, false)
        };
    }

    private int search(int[] nums, int target, boolean first) {
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;

                if (first)
                    right = mid - 1;   // go left
                else
                    left = mid + 1;    // go right
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}