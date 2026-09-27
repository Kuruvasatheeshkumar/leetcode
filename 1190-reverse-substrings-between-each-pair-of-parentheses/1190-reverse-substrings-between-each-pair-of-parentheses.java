class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        int[] pair = new int[n];
        Stack<Integer> open = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                open.push(i);
            } else if (s.charAt(i) == ')') {
                int left = open.pop();
                pair[left] = i;
                pair[i] = left;
            }
        }

        StringBuilder result = new StringBuilder();
        int step = 1;

        for (int i = 0; i >= 0 && i < n; i += step) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result.append(ch);
            } else {
                i = pair[i];
                step = -step;
            }
        }

        return result.toString();
    }
}