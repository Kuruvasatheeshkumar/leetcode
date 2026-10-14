class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (num * 9 < sum) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        while (sum >= 9) {
            ans.append('9');
            sum -= 9;
        }

        if (sum > 0) {
            ans.append(sum);
        }

        while (ans.length() < num) {
            ans.append('0');
        }

        return ans.toString();
    }
}