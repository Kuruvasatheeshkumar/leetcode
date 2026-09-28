class Solution {
    public int mySqrt(int x) {
        if (x <= 1) 
            return x;
        

        int a = 1, b = x;

        while (a <= b) {
            int mid = a + (b - a) / 2;

            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                a = mid + 1;
            } else {
                b = mid - 1;
            }
        }

        return b;
    }
}