import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] squares = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);

        long sum = 0;
        int n = nums.length;
        int k = (n + 1) / 2;

        for (int i = 0; i < n - k; i++) {
            sum -= squares[i];
        }

        for (int i = n - k; i < n; i++) {
            sum += squares[i];
        }

        return sum;
    }
}