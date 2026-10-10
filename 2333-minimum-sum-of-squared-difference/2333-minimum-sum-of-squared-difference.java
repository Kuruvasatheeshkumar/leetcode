class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        long[] diff = new long[n];

        long max = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
            sum += diff[i];
        }

        if (sum <= k) {
            return 0;
        }

        long left = 0, right = max;

        while (left < right) {
            long mid = (left + right) / 2;
            long need = 0;

            for (long d : diff) {
                if (d > mid) {
                    need += d - mid;
                }
            }

            if (need <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        long ans = 0;
        long used = 0;

        for (long d : diff) {
            if (d > left) {
                used += d - left;
                d = left;
            }
            ans += d * d;
        }

        long remaining = k - used;

        for (long d : diff) {
            long value = Math.min(d, left);
            if (value == left && remaining > 0 && value > 0) {
                ans -= value * value;
                ans += (value - 1) * (value - 1);
                remaining--;
            }
        }

        return ans;
    }
}